/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nanxinyu
 */
public class QuestionClass {
    private String questionText;
    private String[] options;
    private int correctIndex;
    private String feedback;
    public static final int DEFAULT_CORRECT_INDEX=0;

    public QuestionClass (String questionText, String[] options, int correctIndex, String feedback) {
        this.questionText=questionText;
        this.options=options;
        this.correctIndex=DEFAULT_CORRECT_INDEX;
        this.feedback=feedback;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return questionText;
    }


    public String getFeedback() {
        return feedback;
    }
    
    @Override
    public String toString() {
        return "Ethical Dilemma Question";
    }
    
    @Override
    public String toString() {
        return questionText+" "+Arrays.toString(options);
    }
}