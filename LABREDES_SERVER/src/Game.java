import java.io.*;
import java.util.*;

public class Game {
    /**
     * Declaração das variaveis que serão utilizadas globalmente
     */
    private List<Question> perguntas;
    private int playerPoints;
    private List<Integer> playerQuestions;
    private int playerStreak;

    /**
     * Criação do objeto Game
     */
    public Game() {
        perguntas = new ArrayList<Question>();
        playerQuestions = new ArrayList<Integer>();
        playerPoints = 0;
        playerStreak = 0;
    }

    /**
     * Método de comparação da resposta recebida (pelo cliente) com a resposta
     * correta
     */
    public boolean answerQuestion(Question a, int answer) {
        boolean result = (a.getRightAnswer() == answer);
        if (result) {
            playerPoints = playerPoints + 10 + playerStreak;
            playerStreak++;
        } else {
            playerStreak = 0;
        }
        playerQuestions.add(a.getQuestionNumber());

        return result;
    }

    /**
     * Receber modificador de sequencia do jogador
     */
    public int getPlayerStreak() {
        return playerStreak;
    }

    /**
     * Receber pontuação atual do jogador
     */
    public int getPlayerPoints() {
        return playerPoints;
    }

    /**
     * Escolha de uma pergunta aleatória da lista de perguntas carregadas
     */
    public Question getRandomQuestion() {
        if (perguntas.size() == playerQuestions.size())
            return null;

        int number = 0;
        Random rand = new Random();

        do {
            number = rand.nextInt(perguntas.size());
        } while (playerQuestions.contains(number));

        return perguntas.get(number);

    }

    /**
     * Carrgear as questões baseadas na dificuldade escolhida pelo aluno
     */
    public void loadQuestions(String difficulty) throws FileNotFoundException {
        String name = "./easy.txt";
        if (difficulty.equals("true"))
            name = "./hard.txt";

        Scanner file = new Scanner(new File(name));

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