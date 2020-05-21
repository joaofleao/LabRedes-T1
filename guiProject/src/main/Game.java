package main;

import java.io.*;
import java.util.*;

public class Game { 

    
    private boolean difficulty;
    private List<Question> perguntas;

    private int player1Points;
    private List<Integer> player1Questions;
    private int player1Fire;


    public Game(boolean difficulty) {
        this.difficulty = difficulty;
        perguntas = new ArrayList<Question>();
        player1Questions = new ArrayList<Integer>();
        player1Points = 0;
        player1Fire = 0;
    }

    public boolean answerQuestion(Question a, int answer) {
        boolean result = (a.getRightAnswer()==answer);
        if (result) {
            player1Points = player1Points+10+player1Fire;
            player1Fire++;
        }
        else {
            player1Fire = 0;
        }
        player1Questions.add(a.getQuestionNumber());
        
        
        return result;
    }
    public int getPlayer1Fire() {
        return player1Fire;
    }
    public int getPlayer1Points() {
        return player1Points;
    }
    public Question getRandomQuestion() {
        if(perguntas.size() == player1Questions.size()) return null;
        
        int number = 0;
        Random rand = new Random(); 
        
        do {
            number = rand.nextInt(perguntas.size()); 
        }
        while (player1Questions.contains(number));

        return perguntas.get(number);

    }

    public void questions() throws FileNotFoundException {

            Scanner file = new Scanner(new File("test.txt"));
            
            for (int i = 0; file.hasNextLine(); i++) {
                String pergunta = file.nextLine();
                String opcao1 = file.nextLine();
                String opcao2 = file.nextLine();
                String opcao3 = file.nextLine();
                String resposta = file.nextLine();
            
                perguntas.add(new Question(i, pergunta, opcao1, opcao2, opcao3, Integer.parseInt(resposta)));
            }
    }
    
}