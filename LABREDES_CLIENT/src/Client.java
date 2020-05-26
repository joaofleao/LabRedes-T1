

import java.io.IOException;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import sun.security.x509.IPAddressName;

public class Client extends javax.swing.JFrame {

    //////////////////////////////////////////////////////////////////////////////////////////// AUTO-GENERATED CODE /////////////////////////////////////////////////////////////////////////////////////////
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup difficulty;
    private javax.swing.JButton draw;
    private javax.swing.JPanel drawCardItem;
    private javax.swing.JPanel drawCardScreen;
    private javax.swing.JRadioButton easy;
    private javax.swing.JButton endGameButton;
    private javax.swing.JPanel endGameScreen;
    private javax.swing.JLabel finalScore;
    private javax.swing.JPanel gameRulesScreen;
    private javax.swing.JButton goBack;
    private javax.swing.JRadioButton hard;
    private javax.swing.JLabel instructionsTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuScreen;
    private javax.swing.JLabel pergunta;
    private javax.swing.JPanel pointsItem;
    private javax.swing.JLabel pointsVariable;
    private javax.swing.JLabel pontsLabel;
    private javax.swing.JLabel pontsLabel1;
    private javax.swing.JPanel questionItem;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respostas = new javax.swing.ButtonGroup();
        difficulty = new javax.swing.ButtonGroup();
        gameRulesScreen = new javax.swing.JPanel();
        instructionsTitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        drawCardScreen = new javax.swing.JPanel();
        questionItem = new javax.swing.JPanel();
        resposta1 = new javax.swing.JRadioButton();
        resposta2 = new javax.swing.JRadioButton();
        resposta3 = new javax.swing.JRadioButton();
        pergunta = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        pointsItem = new javax.swing.JPanel();
        pontsLabel = new javax.swing.JLabel();
        pointsVariable = new javax.swing.JLabel();
        pontsLabel1 = new javax.swing.JLabel();
        sequenceVariable = new javax.swing.JLabel();
        endGameButton = new javax.swing.JButton();
        drawCardItem = new javax.swing.JPanel();
        draw = new javax.swing.JButton();
        resultMessage = new javax.swing.JLabel();
        menuScreen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        startGame1 = new javax.swing.JButton();
        rules1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        easy = new javax.swing.JRadioButton();
        hard = new javax.swing.JRadioButton();
        endGameScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        goBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        finalScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        instructionsTitle.setBackground(new java.awt.Color(102, 0, 0));
        instructionsTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        instructionsTitle.setText("Instruções");

        jLabel5.setText("Regra 1: Este é um jogo de perguntas e respostas, responda-as para ganhar pontos.");

        jLabel6.setText("Regra 2: Este jogo possui uma funcionalidade que a cada questão acertada em ");

        jLabel7.setText("Regra 3: O jogo é feito para uma pessoa jogar a fim de ");

        jLabel10.setText("Também é possível definir a dificuldade do jogo entre fácil e difícil.");

        jLabel11.setText("consolidar os conhecimento de laboratório de redes.");

        jLabel12.setText("sequência um modificador é adicionado, e a cada acerto um ponto");

        jLabel13.setText("é adicionado ao mesmo, gerando uma pontuação final maior.");

        back.setText("Voltar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameRulesScreenLayout = new javax.swing.GroupLayout(gameRulesScreen);
        gameRulesScreen.setLayout(gameRulesScreenLayout);
        gameRulesScreenLayout.setHorizontalGroup(gameRulesScreenLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameRulesScreenLayout.createSequentialGroup().addContainerGap(228, Short.MAX_VALUE)
                        .addGroup(gameRulesScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(back).addComponent(instructionsTitle).addComponent(jLabel5)
                                .addComponent(jLabel10).addComponent(jLabel7).addComponent(jLabel11)
                                .addComponent(jLabel6).addComponent(jLabel12).addComponent(jLabel13))
                        .addContainerGap(161, Short.MAX_VALUE)));
        gameRulesScreenLayout.setVerticalGroup(gameRulesScreenLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameRulesScreenLayout.createSequentialGroup().addGap(84, 84, 84)
                        .addComponent(instructionsTitle).addGap(30, 30, 30).addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10)
                        .addGap(40, 40, 40).addComponent(jLabel6).addGap(4, 4, 4)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel13)
                        .addGap(46, 46, 46).addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11)
                        .addGap(34, 34, 34).addComponent(back).addContainerGap(113, Short.MAX_VALUE)));

        respostas.add(resposta1);
        resposta1.setText("resposta1");

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

        javax.swing.GroupLayout questionItemLayout = new javax.swing.GroupLayout(questionItem);
        questionItem.setLayout(questionItemLayout);
        questionItemLayout
                .setHorizontalGroup(questionItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addGroup(questionItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(questionItemLayout.createSequentialGroup().addGap(5, 5, 5)
                                        .addGroup(questionItemLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                .addComponent(pergunta).addComponent(resposta1).addComponent(resposta2)
                                                .addComponent(resposta3).addComponent(send))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));
        questionItemLayout.setVerticalGroup(questionItemLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 234, Short.MAX_VALUE)
                .addGroup(questionItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(questionItemLayout.createSequentialGroup().addContainerGap()
                                .addComponent(pergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18).addComponent(resposta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resposta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resposta3).addGap(18, 18, 18).addComponent(send)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));

        pontsLabel.setText("Pontuação:");

        pointsVariable.setForeground(new java.awt.Color(51, 204, 0));
        pointsVariable.setText("0");

        pontsLabel1.setText("Sequência de Acertos:");

        sequenceVariable.setForeground(new java.awt.Color(255, 102, 0));
        sequenceVariable.setText("0");

        endGameButton.setText(" Finalizar Server e Jogo");
        endGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pointsItemLayout = new javax.swing.GroupLayout(pointsItem);
        pointsItem.setLayout(pointsItemLayout);
        pointsItemLayout.setHorizontalGroup(pointsItemLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pointsItemLayout.createSequentialGroup().addContainerGap()
                        .addGroup(pointsItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pointsItemLayout.createSequentialGroup().addComponent(pontsLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sequenceVariable))
                                .addGroup(pointsItemLayout.createSequentialGroup().addComponent(pontsLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pointsVariable)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 539, Short.MAX_VALUE)
                        .addComponent(endGameButton).addContainerGap()));
        pointsItemLayout.setVerticalGroup(pointsItemLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pointsItemLayout.createSequentialGroup().addGap(13, 13, 13)
                        .addGroup(pointsItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pontsLabel).addComponent(pointsVariable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pointsItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pontsLabel1).addComponent(sequenceVariable))
                        .addContainerGap(13, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        pointsItemLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(endGameButton).addGap(15, 15, 15)));

        draw.setText("Sortear Pergunta");
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });

        resultMessage.setText(" ");

        javax.swing.GroupLayout drawCardItemLayout = new javax.swing.GroupLayout(drawCardItem);
        drawCardItem.setLayout(drawCardItemLayout);
        drawCardItemLayout.setHorizontalGroup(drawCardItemLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 153, Short.MAX_VALUE)
                .addGroup(drawCardItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        drawCardItemLayout.createSequentialGroup().addContainerGap().addGroup(drawCardItemLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(resultMessage).addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));
        drawCardItemLayout
                .setVerticalGroup(drawCardItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 144, Short.MAX_VALUE)
                        .addGroup(drawCardItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(drawCardItemLayout.createSequentialGroup().addGap(33, 33, 33)
                                        .addComponent(resultMessage).addGap(18, 18, 18)
                                        .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(33, Short.MAX_VALUE))));

        javax.swing.GroupLayout drawCardScreenLayout = new javax.swing.GroupLayout(drawCardScreen);
        drawCardScreen.setLayout(drawCardScreenLayout);
        drawCardScreenLayout.setHorizontalGroup(drawCardScreenLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(drawCardScreenLayout.createSequentialGroup().addContainerGap()
                        .addComponent(pointsItem, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                .addGroup(drawCardScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(drawCardScreenLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(questionItem, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(drawCardScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(drawCardScreenLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(drawCardItem, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))));
        drawCardScreenLayout.setVerticalGroup(drawCardScreenLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(drawCardScreenLayout.createSequentialGroup().addContainerGap()
                        .addComponent(pointsItem, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(475, Short.MAX_VALUE))
                .addGroup(drawCardScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(drawCardScreenLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(questionItem, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(drawCardScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(drawCardScreenLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(drawCardItem, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel2.setText("T1 - Laboratório de Redes de Computadores");

        startGame1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Guilherme Rizzotto e João Leão");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("PUCRS");

        difficulty.add(easy);
        easy.setText("Fácil");

        difficulty.add(hard);
        hard.setText("Difícil");

        javax.swing.GroupLayout menuScreenLayout = new javax.swing.GroupLayout(menuScreen);
        menuScreen.setLayout(menuScreenLayout);
        menuScreenLayout
                .setHorizontalGroup(menuScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuScreenLayout.createSequentialGroup().addContainerGap(136, Short.MAX_VALUE)
                                .addGroup(menuScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addGroup(menuScreenLayout.createSequentialGroup().addComponent(easy)
                                                .addGap(8, 8, 8).addComponent(hard))
                                        .addComponent(jLabel8).addComponent(jLabel2).addComponent(jLabel9)
                                        .addComponent(startGame1, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rules1))
                                .addContainerGap(135, Short.MAX_VALUE)));
        menuScreenLayout.setVerticalGroup(menuScreenLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuScreenLayout.createSequentialGroup().addGap(130, 130, 130).addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2)
                        .addGap(18, 18, 18).addComponent(jLabel8).addGap(48, 48, 48)
                        .addGroup(menuScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hard).addComponent(easy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startGame1, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18).addComponent(rules1).addContainerGap(104, Short.MAX_VALUE)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("As perguntas acabaram!");

        goBack.setText("Voltar ao Menu");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Pontuação Final:");

        finalScore.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        finalScore.setForeground(new java.awt.Color(51, 204, 0));
        finalScore.setText("51");

        javax.swing.GroupLayout endGameScreenLayout = new javax.swing.GroupLayout(endGameScreen);
        endGameScreen.setLayout(endGameScreenLayout);
        endGameScreenLayout.setHorizontalGroup(endGameScreenLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(endGameScreenLayout.createSequentialGroup().addContainerGap(328, Short.MAX_VALUE)
                        .addGroup(endGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(goBack).addComponent(jLabel1).addComponent(jLabel3)
                                .addComponent(finalScore))
                        .addContainerGap(327, Short.MAX_VALUE)));
        endGameScreenLayout.setVerticalGroup(endGameScreenLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(endGameScreenLayout.createSequentialGroup().addGap(172, 172, 172).addComponent(jLabel1)
                        .addGap(18, 18, 18).addComponent(jLabel3).addGap(12, 12, 12).addComponent(finalScore)
                        .addGap(18, 18, 18).addComponent(goBack).addContainerGap(203, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 878, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addComponent(gameRulesScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addComponent(drawCardScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addComponent(menuScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()))
                .addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                        .addComponent(endGameScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 557, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addComponent(gameRulesScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addComponent(drawCardScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addComponent(menuScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()))
                .addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                        .addComponent(endGameScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //////////////////////////////////////////////////////////////////////////////////////////// END OF AUTO-GENERATED CODE ////////////////////////////////////////////////////////////////////////////////

    /**
     * Declaração do Socket a ser utilizado e IP
    */
    public static DatagramSocket clientSocket;

    /**
     * Criação do objeto client e definção das telas que devem ser apresentadas no inicio do programa
    */
    public Client() throws SocketException {
        initComponents();
        setLocationRelativeTo(null);
        drawCardScreen.setVisible(false);
        endGameScreen.setVisible(false);
        gameRulesScreen.setVisible(false);
        setResizable(false);
    }

    /**
     * Ação realizada no clique do botão do final do jogo para voltar a tela inicial
    */
    private void endGameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            exchangeData("00\n");
            finishGameActionPerformed(null);

        } catch (Exception e) {

        }
    }

    /**
     * Ação realizada quando o botão de enviar resposta é pressionado
    */
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {
        String escolha = "";

        if (!resposta1.isSelected() && !resposta2.isSelected() && !resposta3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione uma reposta", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (resposta1.isSelected()) {
                escolha = "0";
            } else if (resposta2.isSelected()) {
                escolha = "1";
            } else if (resposta3.isSelected()) {
                escolha = "2";
            }
            respostas.clearSelection();

            String dataReceived = "";

            try {
                dataReceived = exchangeData(("03\n" + escolha + "\n"));

            } catch (Exception e) {
            }

            Scanner scanner = new Scanner(dataReceived);

            String result = scanner.nextLine();

            if (result.equals("true")) {
                resultMessage.setText("Parabéns! Você Acertou");
            } else {
                resultMessage.setText("Que Pena! Você Errou");
            }

            pointsVariable.setText(scanner.nextLine());
            sequenceVariable.setText(scanner.nextLine());

            questionItem.setVisible(false);
            drawCardItem.setVisible(true);
        }
    }

    /**
     * Ação realizada no clique do botão de voltar
    */
    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {
        endGameScreen.setVisible(false);
        menuScreen.setVisible(true);

    }

    /**
     * Ação realizada no clique do botão de sortear uma pergunta
    */
    private void drawActionPerformed(java.awt.event.ActionEvent evt) {
        drawCardItem.setVisible(false);

        String sentence = "";
        try {
            sentence = exchangeData("02\n");
        } catch (Exception e) {
        }

        Scanner scanner = new Scanner(sentence);

        sentence = scanner.nextLine();
        if (sentence.equals("gameOver")) {

            finishGameActionPerformed(null);
        } else {
            questionItem.setVisible(true);

            pergunta.setText(sentence);
            resposta1.setText(scanner.nextLine());
            resposta2.setText(scanner.nextLine());
            resposta3.setText(scanner.nextLine());
        }

    }

    /**
     * Ação realizada no clique do botão de iniciar o jogo
    */
    private void startGame1ActionPerformed(java.awt.event.ActionEvent evt) {
        boolean choice = false;

        if (!easy.isSelected() && !hard.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione uma reposta", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (easy.isSelected()) {
                choice = false;
            } else if (hard.isSelected()) {
                choice = true;
            }

            difficulty.clearSelection();

            resultMessage.setText(" ");
            pointsVariable.setText("0");
            sequenceVariable.setText("0");

            questionItem.setVisible(false);
            menuScreen.setVisible(false);
            drawCardScreen.setVisible(true);
            drawCardItem.setVisible(true);

            try {
                exchangeData("01\n" + choice + "\n");

            } catch (Exception e) {
            }
        }

    }

    /**
     * Ação realizada no clique do botão de verificar as regras
    */
    private void rules1ActionPerformed(java.awt.event.ActionEvent evt) {
        menuScreen.setVisible(false);
        gameRulesScreen.setVisible(true);
    }
    
    /**
     * Ação realizada no clique do botão de voltar da tela de instruções
    */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        menuScreen.setVisible(true);
        gameRulesScreen.setVisible(false);
    }

    /**
     * Ação realizada ao finalizar o jogo depois de responder todas perguntas
    */
    private void finishGameActionPerformed(java.awt.event.ActionEvent evt) {
        drawCardScreen.setVisible(false);
        endGameScreen.setVisible(true);
        finalScore.setText(pointsVariable.getText());
    }


    /**
     * Ação de trocar dados com os servidor 
     * @param text texto a ser enviado para o servidor
     * @return     texto que foi retornado pelo servidor
    */
    private String exchangeData(String text) throws Exception {
        byte[] sendData = text.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("localhost"), 3333);

        byte[] receivedData = new byte[1024];
        DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);

        for (int i = 50; i > 0; i--) {
            try {
                clientSocket.send(sendPacket);
                clientSocket.receive(receivedPacket);

                break;
            } catch (SocketTimeoutException e) {
                System.out.println("Protocolo não enviado, tentando novamente...");
            }
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Conexão perdida, verifique sua conexão de rede e tente novamente",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                        clientSocket.close();
                System.exit(0);
            }
        }

        return new String(receivedPacket.getData());

    }

    /**
     * Método main do projeto, inicia o socket e a interface gráfica
    */

    public static void main(String args[]) throws Exception {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Client().setVisible(true);
                } catch (SocketException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        clientSocket = new DatagramSocket(4444);
        clientSocket.setSoTimeout(100);
    }

}
