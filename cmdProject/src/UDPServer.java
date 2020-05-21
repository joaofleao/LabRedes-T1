import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

class UDPServer {
      public static DatagramSocket serverSocket;
      public static DatagramPacket receivePacket;
      public static void main(String args[])  throws IOException {

            // cria socket do servidor com a porta 1971
            serverSocket = new DatagramSocket(3333);


            Game jogo = new Game(true);
            jogo.questions();
            receivePacket();
            
            
            while(true) { 
                  Question a = jogo.getRandomQuestion();
                  if (a==null) {
                        sendPacket("-1\n");
                        System.out.println("Game Over");
                        jogo = new Game(true);
                        jogo.questions();
                        a = jogo.getRandomQuestion();
                        receivePacket();
                  }
                  
                  
                  sendPacket("4\n" +a.toString());

                  int resposta = Character.getNumericValue(receivePacket().charAt(0));
                  
                  boolean resultado = jogo.answerQuestion(a, resposta);
                  
                  if (resultado) {
                        sendPacket("4\nParabéns! Você acertou \nSua pontuação: " + jogo.getPlayer1Points() + "\nPerguntas certas seguidas: " + jogo.getPlayer1Fire() + "\n" + "Clique enter para continuar\n");
                        receivePacket();
                  }
                  else {
                        sendPacket("4\nQue pena! Você errou \nSua pontuação: " + jogo.getPlayer1Points() + "\nPerguntas certas seguidas: " + jogo.getPlayer1Fire() + "\n" + "Clique enter para continuar\n");
                        receivePacket();
                  }
            }        
      }

      public static String receivePacket() throws IOException {
            //cria array que vai ser recebido
            byte[] dataComing = new byte[1024];

            // declara o pacote a ser recebido
            receivePacket = new DatagramPacket(dataComing, dataComing.length);

            // recebe o pacote do cliente
            serverSocket.receive(receivePacket);
            
            //retorna o texto que foi recebido
            return (new String (receivePacket.getData()));
      }


      public static void sendPacket(String text) throws IOException {
            
            //converte texto para array de bytes
            byte[] dataGoing = text.getBytes();

            //pega o endereco que acabou de receber 
            InetAddress IPAddress = receivePacket.getAddress();

            //pega a porta que acabou de receber 
            int port = receivePacket.getPort();

            // cria pacote com o dado, o endereço do server e porta do servidor
            DatagramPacket sendPacket = new DatagramPacket(dataGoing, dataGoing.length, IPAddress, port);

            //serverSocket.setSoTimeout(1000);
            boolean continueSending = true;
            while (continueSending) {

                  try {
                        serverSocket.send(sendPacket);
                        continueSending = false;
                        
                  } catch (SocketTimeoutException e) {
                        System.out.println(e);
                  }
         
            }


            //envia o pacote
            
      }
}
