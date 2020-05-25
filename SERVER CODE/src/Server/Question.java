package Server;

public class Question {

    /**
     * Declaração das variaveis globais que serão utilizadas
     */
    private int questionNumber;
    private String name;
    private String answer1;
    private String answer2;
    private String answer3;
    private int rightAnswer;

    /**
     * Ciração do objeto Question
     */
    public Question(int questionNumber, String name, String answer1, String answer2, String answer3, int rightAnswer) {
        this.questionNumber = questionNumber;
        this.name = name;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.rightAnswer = rightAnswer;
    }

    /**
     * Receber a resposta certa para correção
     */
    public int getRightAnswer() {
        return rightAnswer;
    }

    /**
     * Receber número da questão
     */
    public int getQuestionNumber() {
        return questionNumber;
    }

    /**
     * Conversão do objeto para String
     */
    public String toString() {

        return (name + "\n" + answer1 + "\n" + answer2 + "\n" + answer3);
    }

}