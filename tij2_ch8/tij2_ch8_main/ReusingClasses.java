package tij2_ch8_main;
import tij2_ch8.ex1.Exercise1;

public class ReusingClasses{
    public static void main(String[] args) {

        Exercise1 ex1=new Exercise1();
        System.out.println("Hello");
        System.out.println("Running Exercise 1");
        ex1.setQuestion(2);
        ex1.setQuestion(3);
        
    }
}