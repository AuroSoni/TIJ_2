package tij2_ch8_main;
import tij2_ch8.ex1.Exercise1;
import tij2_ch8.ex2.*;

public class ReusingClasses{
    public static void main(String[] args) {

        Exercise1 ex1=new Exercise1();
        System.out.println("Hello");
        System.out.println("Running Exercise 1");
        ex1.setQuestion(2);
        ex1.setQuestion(3);
        
        System.out.println("\nRunning Exercise 2");
        e2 ex2=new e2();
        System.out.println(ex2.toString());
        ex2.scrub();
        System.out.println(ex2.toString());
        ex2.sterilize();
        System.out.println(ex2.toString());
    }
}
/**
 * Inherit a new class from class Exercise2. Override scrub( ) and add a new method called sterilize( ). 
 */
class e2 extends Exercise2{
    @Override
    public void scrub() {
        // TODO Auto-generated method stub
        append(" e2.scrub()");
        super.scrub();
    }

    public void sterilize(){
        append(" sterilize()");
    }
}