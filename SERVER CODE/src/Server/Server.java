package Server;

import java.io.*;
import java.net.*;
import java.util.*;

class Server {
      /**
       * Declaração das variáveis globais que seriam utilizadas
       */
      public static DatagramSocket serverSocket;
      public static DatagramPacket receivePacket;
      public static Question a;

      /**
       * receber pacote de dados do cliente
       */
      public static String receivePacket() throws IOException {

            byte[] dataComing = new byte[1024];

            receivePacket = new DatagramPacket(dataComing, dataComing.length);

            serverSocket.receive(receivePacket);

            return (new String(receivePacket.getData()));
      }

      /**
       * enviar pacote de dados para o cliente
       */
      public static void sendPacket(String text) throws IOException {

            byte[] dataGoing = text.getBytes();

            InetAddress IPAddress = receivePacket.getAddress();

            // int port = receivePacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(dataGoing, dataGoing.length, IPAddress, 4444);

            try {
                  serverSocket.send(sendPacket);
            } catch (Exception e) {
            }

      }

      /**
       * Método main, onde é processado os dados que são recebidos do cliente e
       * chamados os métodos de envio de pacotes
       */
      public static void main(String args[]) throws IOException {
            serverSocket = new DatagramSocket(3333);
            boolean resultado = false;
            int run = 1;
            Game jogo = new Game();
            Scanner scanner;

            while (true) {
                  scanner = new Scanner(receivePacket());
                  String text = scanner.nextLine();
                  switch (text) {
                        case "00": // fechar o Server
                              sendPacket("/");
                              serverSocket.close();
                              return;
                        case "01": // criar um novo jogo
                              if (run == 1) {
                                    run++;
                                    jogo = new Game();
                                    jogo.loadQuestions(scanner.nextLine());
                              }
                              sendPacket("/");
                              break;

                        case "02": // enviar pergunta aleatória para o cliente
                              if (run == 2) {
                                    run++;
                                    a = jogo.getRandomQuestion();
                              }
                              if (a == null) {
                                    sendPacket("gameOver\n");
                                    run = 1;

                              } else
                                    sendPacket(a.toString() + "\n");
                              break;

                        case "03": // verificar se cliente enviou a resposta correta

                              if (run == 3) {
                                    run = 2;
                                    int resposta = Character.getNumericValue(scanner.nextLine().charAt(0));
                                    resultado = jogo.answerQuestion(a, resposta);
                              }

                              sendPacket(resultado + "\n" + jogo.getPlayerPoints() + "\n" + jogo.getPlayerStreak()
                                          + "\n");
                              break;
                  }
            }

      }
}
