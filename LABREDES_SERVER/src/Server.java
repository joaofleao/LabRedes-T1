import java.io.*;
import java.net.*;
import java.util.*;
public class Server extends javax.swing.JFrame {

    /**
     * Creates new form Server
     */
    public Server() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Server Running");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
        
            serverSocket = new DatagramSocket(3333);
            System.out.println("Teste");
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
                              System.exit(0);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
