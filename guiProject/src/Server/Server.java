package Server;
import java.io.*;
import java.net.*;
import java.util.*;

class Server {
      public static DatagramSocket serverSocket;
      public static DatagramPacket receivePacket;
      public static Question a;

      
      public static String receivePacket() throws IOException {

            byte[] dataComing = new byte[1024];

            receivePacket = new DatagramPacket(dataComing, dataComing.length);

            serverSocket.receive(receivePacket);


            return (new String (receivePacket.getData()));
      }
      public static void sendPacket(String text) throws IOException {

            byte[] dataGoing = text.getBytes();

            InetAddress IPAddress = receivePacket.getAddress();

            //int port = receivePacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(dataGoing, dataGoing.length, IPAddress, 4444);

                  try {
                        serverSocket.send(sendPacket);
                  } catch (Exception e) {
                  }

      }
      public static void confirm() throws IOException {

            byte[] dataGoing = "/".getBytes();

            InetAddress IPAddress = receivePacket.getAddress();

            //int port = receivePacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(dataGoing, dataGoing.length, IPAddress, 4444);

                  try {
                        serverSocket.send(sendPacket);
                  } catch (SocketTimeoutException e) {
                  }

      }


      public static void main(String args[])  throws IOException {
            System.out.println("Server Novo");
            serverSocket = new DatagramSocket(3333);
            boolean resultado = false;
            int run = 1;
            Game jogo = new Game();
            Scanner scanner;
            
            while(true) {
                 scanner = new Scanner(receivePacket());  
                 String text = scanner.nextLine();
                  switch (text) {
                      case "00": 
                          confirm();
                        return;
                      case "01": 
                        if (run == 1) {
                              run++;
                              jogo = new Game();
                              jogo.loadQuestions(scanner.nextLine());
                        }
                        confirm();
                        break;
 
                      case "02": 
                        if (run==2) {  
                              run++;     
                              a = jogo.getRandomQuestion();
                        }
                        if (a==null) {
                              sendPacket("gameOver\n");
                              run = 1;
                            
                        }
                        else sendPacket(a.toString() + "\n");
                        break;
 
                      case "03": 
                      
                      if (run==3) {
                              run = 2;
                              int resposta = Character.getNumericValue(scanner.nextLine().charAt(0));
                              resultado = jogo.answerQuestion(a, resposta);
                        }

                        sendPacket(resultado + "\n" + jogo.getPlayer1Points() + "\n" + jogo.getPlayer1Fire() + "\n" );      
                        break;
                  }
             }
                   
       }
}
