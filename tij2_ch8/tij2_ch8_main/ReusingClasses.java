package tij2_ch8_main;

import tij2_ch8.ex1.Exercise1;
import tij2_ch8.ex10.Exercise10;
import tij2_ch8.ex11.Exercise11;
import tij2_ch8.ex12.Exercise12;
import tij2_ch8.ex13.Exercise13;
import tij2_ch8.ex18.Exercise18;
import tij2_ch8.ex2.*;
import tij2_ch8.ex3.Exercise3;
import tij2_ch8.ex5.Exercise5;
import tij2_ch8.ex6.Exercise6;
import tij2_ch8.ex7.Exercise7;
import tij2_ch8.ex8.Exercise8;
import tij2_ch8.ex9.Exercise9;
import static tij2_ch8.tools.tools.print;

import tij2_ch8.ex20.Exercise20;

public class ReusingClasses{
    public static void main(final String[] args) {

        final Exercise1 ex1 = new Exercise1();
        print("Hello");
        print("Running Exercise 1");
        ex1.setQuestion(2);
        ex1.setQuestion(3);

        print("\nRunning Exercise 2");
        final e2 ex2 = new e2();
        print(ex2.toString());
        ex2.scrub();
        print(ex2.toString());
        ex2.sterilize();
        print(ex2.toString());

        print("\nRunning Exercise 3 and 4");
        final Exercise3 ex3 = new Exercise3();
        print("QNo = " + ex3.getqno());

        print("\nRunning Exercise 5");
        final Exercise5 ex5 = new Exercise5();
        print(ex5.toString());

        print("\nRunning Exercise 6");
        final Exercise6 ex6 = new Exercise6();
        print(ex6.toString());

        print("\nRunning Exercise 7");
        final Exercise7 ex7 = new Exercise7(1, 2);
        print(ex7.toString());

        print("\nRunning Exercise 8");
        final Exercise8 ex8_nd = new Exercise8(1);
        print(ex8_nd.toString());
        final Exercise8 ex8_d = new Exercise8();
        print(ex8_d.toString());

        print("\nRunning Exercise 9");
        final Exercise9 ex9 = new Exercise9();
        print(ex9.toString());

        print("\nRunning Exercise 10");
        final Exercise10 ex10 = new Exercise10("1", "2", "3", "a", "b", "c");
        print(ex10.print());

        print("\nRunning Exercise 11");
        Exercise11.main(args);

        print("\nRunning Exercise 12");
        final Exercise12 ex12 = new Exercise12();
        try{
            print("Dont forget exception handling while cleanup");
        }finally{
            ex12.dispose();
        }

        print("\nRunning Exercise 13");
        Exercise13.main(args);

        print("\nExercise14 is too easy to be done.");

        print("\nExercise15 is already done.");

        print("\nExercise16 is done. My version needs some research. God Level.");

        print("\nExercise 17 is pending.");

        print("\nRunning Exercise 18");
        Exercise18.main(args);
        print("Exercise18()\t"+"final\t"+"static final");

        print("Exercise19 done through exercise18.");

        print("\nRunning Exercise 20");
        Exercise20.main(args);
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