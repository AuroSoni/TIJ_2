package tij2_ch8.tij2_ch8.ex1;
import static tij2_ch8.tij2_ch8.tools.tools.print;

/**
 * Create a simple class. Inside a second class, define a reference to an object of the first class. 
 * Use lazy initialization to instantiate this object. 
 */
public class Exercise1{
    protected int no=0;
    private Question1 q1;
    public void setQuestion(int i){
        if(q1==null){
            print("Q1 is null till here");
            q1= new Question1(i);
        }
        else{
            print("Q1 already initialised "+q1.qno+" "+q1.question);
        } 
    }
}

class Question1{
    int qno;
    String question;
    Question1(int i){
        qno=i;
        question= "This is the question. ";
    }
}