package Server;
public class Question {

    private int questionNumber;
    private String name;
    private String answer1;
    private String answer2;
    private String answer3;
    private int rightAnswer;
    
    public Question(int questionNumber, String name, String answer1, String answer2, String answer3, int rightAnswer) {
        this.questionNumber = questionNumber;
        this.name = name;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.rightAnswer = rightAnswer;
    }
    public boolean validateQuestion(int userAnswer) {
        return (userAnswer==rightAnswer);
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public String toString() {

        return (name +  "\n" + answer1 + "\n" + answer2 + "\n" + answer3 );
    }
    
}