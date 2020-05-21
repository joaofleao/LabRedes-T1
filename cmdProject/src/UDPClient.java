import java.io.*;
import java.net.*;
import java.util.*;

class UDPClient {
   public static void main(String args[]) throws Exception {
      //declaracao do socket cliente
      do {
         System.out.println("Olá, para começar pressione 'Enter'");
         
         Scanner keyboard = new Scanner(System.in);
         keyboard.nextLine();

         DatagramSocket clientSocket = new DatagramSocket();

         sendData("iniciar", clientSocket, InetAddress.getByName("localhost"));

         while (true) {
            String question = receiveData(clientSocket);
            if(question.equals("")) {
               System.out.println("As perguntas acabaram!, Obrigado por jogar!");
               break;
            }
            System.out.println(question);
            
            System.out.println("Digite a letra da alternativa correta");
            String toSend = keyboard.nextLine();
            toSend = toSend.toLowerCase();
            switch(toSend) {
               case "a": toSend = "0"; break;
               case "b": toSend = "1"; break;
               case "c": toSend = "2"; break;
            }
            sendData(toSend, clientSocket, InetAddress.getByName("localhost"));

            System.out.println(receiveData(clientSocket));

            keyboard.nextLine();
            sendData("continuar", clientSocket, InetAddress.getByName("localhost"));
         }
         clientSocket.close();

      } while(true);

   }
   public static String format(String text) throws IOException {
      Scanner scanner = new Scanner(text);
      int code = Integer.parseInt(scanner.nextLine());
      
      if (code==-1) return "";

      String formatted = "";
      for (int i = code; i>0; i-- ) {
         formatted = formatted + "\n" + scanner.nextLine();
      }
      
      return formatted;

   }
   
   private static String receiveData(DatagramSocket clientSocket) throws Exception{
      //criar array de 1024
      byte[] dataComing = new byte[1024];

      // declara o pacote a ser recebido
      DatagramPacket receivePacket = new DatagramPacket(dataComing, dataComing.length);

      // recebe o pacote do servidor
      clientSocket.receive(receivePacket);

      //retorna o texto recebido string com texto
      return format(new String (receivePacket.getData()));

   }
   
   
   private static boolean sendData(String text, DatagramSocket clientSocket, InetAddress IPAddress) throws Exception {
         //criar array de 1024
         byte[] dataGoing = text.getBytes();

         // cria pacote com o dado, o endereço do server e porta do servidor
         DatagramPacket sendPacket = new DatagramPacket(dataGoing, dataGoing.length, IPAddress, 3333);
         
         clientSocket.send(sendPacket);

         return true;
   }
}
