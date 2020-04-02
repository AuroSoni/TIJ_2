package tij2_ch8.ex1;

/**
 * Create a simple class. Inside a second class, define a reference to an object of the first class. 
 * Use lazy initialization to instantiate this object. 
 */
public class Exercise1{
    protected int no=0;
    private Question1 q1;
    public Question1 getQuestion(int i){
        if(q1==null){
            return new Question1(i);
        }
        else return q1;
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