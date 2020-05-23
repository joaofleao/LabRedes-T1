package Server;
import java.io.*;
import java.net.*;
import java.util.*;
class UDPServer {
      public static DatagramSocket serverSocket;
      public static DatagramPacket receivePacket;
      public static Game jogo;
      public static Question a;
      public static Scanner scanner;
      
      
      
      public static void newGame() throws FileNotFoundException, IOException {
          
          if (scanner.nextLine().equals("true"))jogo = new Game(true);
          else jogo = new Game(false);

          jogo.questions();

      } 
      
      public static void drawCard() throws IOException {
            a = jogo.getRandomQuestion();

            if(a==null) {
                sendPacket("gameOver\n" + jogo.getPlayer1Points());
            }
            else {
                sendPacket(a.toString() + "\n");

            }
          
      }
      public static void checkAnswer() throws IOException {
            
            int resposta = Character.getNumericValue(scanner.nextLine().charAt(0));

            boolean resultado = jogo.answerQuestion(a, resposta);

            sendPacket(resultado + "\n" + jogo.getPlayer1Points() + "\n" + jogo.getPlayer1Fire() + "\n" );
      }
      
      public static void main(String args[])  throws IOException {
          
           System.out.println("Server");
           serverSocket = new DatagramSocket(3333);
           
           
           while(true) {
                scanner = new Scanner(receivePacket());  
                String text = scanner.nextLine();

                 switch (text) {
                     case "01": newGame();
                         break;

                     case "02": drawCard();
                         break;

                     case "03": checkAnswer();
                         break;
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

            
      }
}
