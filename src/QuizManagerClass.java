/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nanxinyu
 */
public class QuizManagerClass {
    public static QuestionBase[] questions;
    public static int questionCount=0;
    public static int score=0;
    public static int currentIndex=-;
    
    public static int calculatePercentage(int score, int total) {
        return (score*100)/total;
    }
    
    public static void loadQuestions() {
        
        try {
            BufferedReader br=new BufferedReader(new FileReader("question.txt"));
            
            String line;
            int count=0;
            while((line=br.readLine()) != null) {
                count++;
            }
            br.close();
            
            questions =new QuestionBase[count];
            
            br=new Bufferedreader(new FileReader("question.txt"));
            int index=0;
            
            while ((line = br.readLine()) != null) {
                String[] parts=line.split(",");
                
                String q=parts[0];
                String[] options={parts[1], parts[2], parts[3], parts[4]};
                int correct=Integer.parseInt(parts[5]);
                
                questions[index]=new QuestionClass(q, options, correct);
                index++
            }
            
            questionCount=count;
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void saveScore() {
        try {
            BufferedWriter bw=new BifferedWriter(new FileWriter("scores.txt", true));
            bw.write("Score: "+score+"/"+questionCount);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
