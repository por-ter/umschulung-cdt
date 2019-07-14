package javaquiz;

public class Questions {
    
    private int qNum;
    private String question;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private int correctA;
    private int questionPunkte;
    
    // Constructors for questions with 2,3 or 4 possible answers    
    // ---------- ---------- ---------- ---------- ---------- ----------
    
    public Questions(int qNum, String question, String choice1, String choice2,
            String choice3, String choice4, int correctA, int questionPunkte){
        this(qNum, question, choice1, choice2, choice3, correctA, questionPunkte);
        this.choice4=choice4;
    }    
    public Questions(int qNum, String question, String choice1, String choice2,
            String choice3, int correctA, int questionPunkte){
        this(qNum, question, choice1, choice2, correctA, questionPunkte);
        this.choice3=choice3;
    }    
    public Questions(int qNum, String question, String choice1, String choice2,
            int correctA, int questionPunkte){
        this(qNum, question, choice1, correctA, questionPunkte);
        this.choice2=choice2;
    } 
    
    public Questions(int qNum, String question, String choice1,
            int correctA, int questionPunkte){
        this.qNum=qNum;
        this.question=question;
        this.choice1=choice1;
        this.correctA=correctA;
        this.questionPunkte=questionPunkte;
    }
    
    // All possible getters
    // ---------- ---------- ---------- ---------- ---------- ----------
    public int getqNum() {
        return qNum;
    }
    public String getQuestion() {
        return question;
    }
    public String getChoice1() {
        return choice1;
    }
    public String getChoice2() {
        return choice2;
    }
    public String getChoice3() {
        return choice3;
    }
    public String getChoice4() {
        return choice4;
    }
    public int getCorrectA() {
        return correctA;
    }
    public int getQuestionPunkte() {
        return questionPunkte;
    }
    
    // String method
    //---------- ---------- ---------- ---------- ---------- ----------
    @Override
    public String toString(){
        return String.format("---------- ---------- ---------- ---------- "
                + "---------- ----------\nQuestion # %d \nFor %s points: \n%s \n1:\t%s \n2:\t%s "
                + "\n3:\t%s \n4:\t%s\n---------- ---------- ---------- ---------- "
                + "---------- ----------\n",
                qNum, questionPunkte, question, choice1, choice2, choice3, choice4);
    }
    
    

}
