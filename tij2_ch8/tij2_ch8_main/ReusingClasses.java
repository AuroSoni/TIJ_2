package tij2_ch8_main;

import tij2_ch8.ex1.Exercise1;
import tij2_ch8.ex10.Exercise10;
import tij2_ch8.ex11.Exercise11;
import tij2_ch8.ex12.Exercise12;
import tij2_ch8.ex13.Exercise13;
import tij2_ch8.ex2.*;
import tij2_ch8.ex3.Exercise3;
import tij2_ch8.ex5.Exercise5;
import tij2_ch8.ex6.Exercise6;
import tij2_ch8.ex7.Exercise7;
import tij2_ch8.ex8.Exercise8;
import tij2_ch8.ex9.Exercise9;

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

        System.out.println("\nRunning Exercise 3 and 4");
        Exercise3 ex3=new Exercise3();
        System.out.println("QNo = "+ex3.getqno());

        System.out.println("\nRunning Exercise 5");
        Exercise5 ex5=new Exercise5();
        System.out.println(ex5.toString());

        System.out.println("\nRunning Exercise 6");
        Exercise6 ex6=new Exercise6();
        System.out.println(ex6.toString());

        System.out.println("\nRunning Exercise 7");
        Exercise7 ex7=new Exercise7(1,2);
        System.out.println(ex7.toString());

        System.out.println("\nRunning Exercise 8");
        Exercise8 ex8_nd=new Exercise8(1);
        System.out.println(ex8_nd.toString());
        Exercise8 ex8_d=new Exercise8();
        System.out.println(ex8_d.toString());

        System.out.println("\nRunning Exercise 9");
        Exercise9 ex9=new Exercise9();
        System.out.println(ex9.toString());

        System.out.println("\nRunning Exercise 10");
        Exercise10 ex10=new Exercise10("1","2","3","a","b","c");
        System.out.println(ex10.print());

        System.out.println("\nRunning Exercise 11");
        Exercise11.main(args);

        System.out.println("\nRunning Exercise 12");
        Exercise12 ex12=new Exercise12();
        try{
            System.out.println("Dont forget exception handling while cleanup");
        }finally{
            ex12.dispose();
        }

        System.out.println("\nRunning Exercise 13");
        Exercise13.main(args);

        System.out.println("\nExercise14 is too easy to be done.");
    }
}

/**
 * Inherit a new class from class Exercise2. Override scrub( ) and add a new method called sterilize( ). 
 */
class e2 extends Exercise2{
    @Override
    public void scrub() {
        // Auto-generated method stub
        append(" e2.scrub()");
        super.scrub();
    }

    public void sterilize(){
        append(" sterilize()");
    }
}