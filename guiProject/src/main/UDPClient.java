/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author joaof
 */
public class UDPClient extends javax.swing.JFrame {

    public static DatagramSocket clientSocket;
    
    
    public UDPClient() throws SocketException {
        initComponents();
        setLocationRelativeTo(null);
        question.setVisible(false);
        drawCard.setVisible(false);
        endGame.setVisible(false);
        gameRules.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respostas = new javax.swing.ButtonGroup();
        question = new javax.swing.JPanel();
        resposta1 = new javax.swing.JRadioButton();
        resposta2 = new javax.swing.JRadioButton();
        resposta3 = new javax.swing.JRadioButton();
        pergunta = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        endGame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        goBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        finalScore = new javax.swing.JLabel();
        drawCard = new javax.swing.JPanel();
        draw = new javax.swing.JButton();
        pontsLabel = new javax.swing.JLabel();
        pointsVariable = new javax.swing.JLabel();
        pontsLabel1 = new javax.swing.JLabel();
        sequenceVariable = new javax.swing.JLabel();
        resultMessage = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        startGame1 = new javax.swing.JButton();
        rules1 = new javax.swing.JButton();
        gameRules = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        respostas.add(resposta1);
        resposta1.setText("resposta1");
        resposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resposta1ActionPerformed(evt);
            }
        });

        respostas.add(resposta2);
        resposta2.setText("resposta2");

        respostas.add(resposta3);
        resposta3.setText("resposta3");

        pergunta.setText("pergunta");

        send.setText("Enviar");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout questionLayout = new javax.swing.GroupLayout(question);
        question.setLayout(questionLayout);
        questionLayout.setHorizontalGroup(
            questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pergunta)
                    .addComponent(resposta1)
                    .addComponent(resposta2)
                    .addComponent(resposta3)
                    .addComponent(send))
                .addGap(309, 309, 309))
        );
        questionLayout.setVerticalGroup(
            questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(pergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resposta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resposta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resposta3)
                .addGap(18, 18, 18)
                .addComponent(send)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jLabel1.setText("As perguntas acabaram!");

        goBack.setText("Voltar ao Menu");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        jLabel3.setText("Pontuação Final:");

        finalScore.setText("number");

        javax.swing.GroupLayout endGameLayout = new javax.swing.GroupLayout(endGame);
        endGame.setLayout(endGameLayout);
        endGameLayout.setHorizontalGroup(
            endGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endGameLayout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addGroup(endGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(goBack)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(finalScore))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        endGameLayout.setVerticalGroup(
            endGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endGameLayout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(finalScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goBack)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        draw.setText("Sortear Pergunta");
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });

        pontsLabel.setText("Pontuação:");

        pointsVariable.setText("0");

        pontsLabel1.setText("Sequencia de Acertos:");

        sequenceVariable.setText("0");

        resultMessage.setText(" ");

        javax.swing.GroupLayout drawCardLayout = new javax.swing.GroupLayout(drawCard);
        drawCard.setLayout(drawCardLayout);
        drawCardLayout.setHorizontalGroup(
            drawCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawCardLayout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(drawCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(resultMessage)
                    .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(drawCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(drawCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drawCardLayout.createSequentialGroup()
                        .addComponent(pontsLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sequenceVariable))
                    .addGroup(drawCardLayout.createSequentialGroup()
                        .addComponent(pontsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pointsVariable)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        drawCardLayout.setVerticalGroup(
            drawCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(drawCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontsLabel)
                    .addComponent(pointsVariable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(drawCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontsLabel1)
                    .addComponent(sequenceVariable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(resultMessage)
                .addGap(18, 18, 18)
                .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jLabel2.setText("T1 Labredes");

        startGame1.setText("Jogar");
        startGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGame1ActionPerformed(evt);
            }
        });

        rules1.setText("Instruções");
        rules1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rules1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(startGame1)
                    .addComponent(rules1)
                    .addComponent(jLabel2))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(startGame1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rules1)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        jLabel4.setText("Instruções");

        back.setText("Voltar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel5.setText("Regra 1:");

        jLabel6.setText("Regra 3:");

        jLabel7.setText("Regra 2:");

        javax.swing.GroupLayout gameRulesLayout = new javax.swing.GroupLayout(gameRules);
        gameRules.setLayout(gameRulesLayout);
        gameRulesLayout.setHorizontalGroup(
            gameRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameRulesLayout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addGroup(gameRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(back)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        gameRulesLayout.setVerticalGroup(
            gameRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameRulesLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(51, 51, 51)
                .addComponent(back)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(endGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(gameRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(endGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(gameRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        String escolha = "";
        if (resposta1.isSelected()) {
            escolha = "0";
        }
        else if (resposta2.isSelected()) {
            escolha = "1";
        }
        else if (resposta3.isSelected()) {
            escolha = "2";
        }
        String dataReceived = "";
        
        try {
            sendData(("03\n" + escolha + "\n"), InetAddress.getByName("localhost"));
            dataReceived = receiveData(clientSocket);
        }
        catch (Exception e) {}
        
        Scanner scanner = new Scanner(dataReceived);
        
        
        String result = scanner.nextLine();
        System.out.println(result);
  
        if (result.equals("true")) {
            resultMessage.setText("Parabéns! Você Acertou");
        }
        else {
            resultMessage.setText("Que Pena! Você Errou");
        }
        
        pointsVariable.setText(scanner.nextLine());
        sequenceVariable.setText(scanner.nextLine());
        
       
        question.setVisible(false);
        drawCard.setVisible(true);
        
    }//GEN-LAST:event_sendActionPerformed

    private void resposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resposta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resposta1ActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
    endGame.setVisible(false);
    menu.setVisible(true);
        
        
    }//GEN-LAST:event_goBackActionPerformed

    private void drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawActionPerformed
        drawCard.setVisible(false);
        question.setVisible(true);
        
        String sentence = "";
        try {
            sendData("02\n", InetAddress.getByName("localhost"));
            sentence = receiveData(clientSocket);
        }
        catch (Exception e) {}

        Scanner scanner = new Scanner(sentence);
        
        sentence = scanner.nextLine();
        if (sentence.equals("gameOver")){
            endGame.setVisible(true);
            finalScore.setText(scanner.nextLine());
            question.setVisible(false);
            
        }else {
            pergunta.setText(sentence);
            resposta1.setText(scanner.nextLine());
            resposta2.setText(scanner.nextLine());
            resposta3.setText(scanner.nextLine());
        }
        
       
    }//GEN-LAST:event_drawActionPerformed

    private void startGame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGame1ActionPerformed
        resultMessage.setText(" ");
        pointsVariable.setText("0");
        sequenceVariable.setText("0");
        
        menu.setVisible(false);
        drawCard.setVisible(true);
        try {
            sendData("01\n", InetAddress.getByName("localhost"));
        }
        catch (Exception e) {}
    }//GEN-LAST:event_startGame1ActionPerformed

    private void rules1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rules1ActionPerformed
        menu.setVisible(false);
        gameRules.setVisible(true);
    }//GEN-LAST:event_rules1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        menu.setVisible(true);
        gameRules.setVisible(false);
    }//GEN-LAST:event_backActionPerformed
   
    
 
    private static String receiveData(DatagramSocket clientSocket) throws Exception{
      //criar array de 1024
      byte[] dataComing = new byte[1024];

      // declara o pacote a ser recebido
      DatagramPacket receivePacket = new DatagramPacket(dataComing, dataComing.length);

      // recebe o pacote do servidor
      clientSocket.receive(receivePacket);

      //retorna o texto recebido string com texto
      return new String (receivePacket.getData());

   }
   
   
   private static boolean sendData(String text, InetAddress IPAddress) throws Exception {
         //criar array de 1024
         byte[] dataGoing = text.getBytes();

         // cria pacote com o dado, o endereço do server e porta do servidor
         DatagramPacket sendPacket = new DatagramPacket(dataGoing, dataGoing.length, IPAddress, 3333);
         
         clientSocket.send(sendPacket);

         return true;
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton draw;
    private javax.swing.JPanel drawCard;
    private javax.swing.JPanel endGame;
    private javax.swing.JLabel finalScore;
    private javax.swing.JPanel gameRules;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel pergunta;
    private javax.swing.JLabel pointsVariable;
    private javax.swing.JLabel pontsLabel;
    private javax.swing.JLabel pontsLabel1;
    private javax.swing.JPanel question;
    private javax.swing.JRadioButton resposta1;
    private javax.swing.JRadioButton resposta2;
    private javax.swing.JRadioButton resposta3;
    private javax.swing.ButtonGroup respostas;
    private javax.swing.JLabel resultMessage;
    private javax.swing.JButton rules1;
    private javax.swing.JButton send;
    private javax.swing.JLabel sequenceVariable;
    private javax.swing.JButton startGame1;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param args
     * 
     */
    public static void main(String args[]) throws Exception{
        System.out.println("Client");
          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UDPClient().setVisible(true);
                } catch (SocketException ex) {
                    Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });     

        clientSocket = new DatagramSocket();     
        
    }

}
