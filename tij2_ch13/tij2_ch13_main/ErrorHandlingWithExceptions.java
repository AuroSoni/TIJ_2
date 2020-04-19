package tij2_ch13.tij2_ch13_main;

import static custom_tools.print.Print.*;

import tij2_ch13.tij2_ch13.ex4.Exercise4;
import tij2_ch13.tij2_ch13.ex5.Exercise5;
import tij2_ch13.tij2_ch13.ex6.Exercise6;
import tij2_ch13.tij2_ch13.ex8.Exercise8;
import tij2_ch13.tij2_ch13.ex9.Exercise9;
import tij2_ch13.tij2_ch13.ex20.Exercise20;
import tij2_ch13.tij2_ch13.ex25.Exercise25;
import tij2_ch13.tij2_ch13.ex26.Exercise26;
import tij2_ch13.tij2_ch13.ex27.Exercise27;
import tij2_ch13.tij2_ch13.ex28.Exercise28;
import tij2_ch13.tij2_ch13.ex29.Exercise29;
import tij2_ch13.tij2_ch13.Exercise30;
import tij2_ch13.tij2_ch13.Naughty;
import tij2_ch13.tij2_ch13.ex1.Exercise1;
import tij2_ch13.tij2_ch13.ex10.Exercise10;
import tij2_ch13.tij2_ch13.ex12.Exercise12;
import tij2_ch13.tij2_ch13.ex14.Exercise14;
import tij2_ch13.tij2_ch13.ex15.Exercise15;
import tij2_ch13.tij2_ch13.ex16.Exercise16;
import tij2_ch13.tij2_ch13.ex17.Exercise17;
import tij2_ch13.tij2_ch13.ex18.Exercise18;
import tij2_ch13.tij2_ch13.ex19.Exercise19;
import tij2_ch13.tij2_ch13.ex2.Exercise2;
import tij2_ch13.tij2_ch13.ex21.Exercise21;
import tij2_ch13.tij2_ch13.ex22.Exercise22;
import tij2_ch13.tij2_ch13.ex3.Exercise3;

public class ErrorHandlingWithExceptions {
    public static void main(String[] args) {

        print("Running Exercise 1 : ");
        Exercise1.main(args);

        print("\nRunning Exercise 2 : ");
        Exercise2.main(args);

        print("\nRunning Exercise 3 and 7: ");
        Exercise3.main(args);

        print("\nRunning Exercise 4 : ");
        Exercise4.main(args);

        print("\nRunning Exercise 5 : ");
        Exercise5.main(args);

        print("\nRunning Exercise 6 : ");
        Exercise6.main(args);

        print("\nRunning Exercise 8 : ");
        try {
            Exercise8.main(args);
        } catch (Naughty e) {
            e.printStackTrace();
        }

        print("\nRunning Exercise 9 and 13 : ");
        Exercise9.main(args);

        print("\nRunning Exercise 10 and 11 : ");
        Exercise10.main(args);

        print("\nRunning Exercise 12 : ");
        Exercise12.main(args);

        print("\nRunning Exercise 14 : ");
        Exercise14.main(args);

        print("\nRunning Exercise 15 : ");
        Exercise15.main(args);

        print("\nRunning Exercise 16 : ");
        Exercise16.main(args);

        print("\nRunning Exercise 17 : ");
        Exercise17.main(args);

        print("\nRunning Exercise 18 : ");
        Exercise18.main(args);

        print("\nRunning Exercise 19 : ");
        Exercise19.main(args);

        print("\nRunning Machaxx Exercise 20 : ");
        Exercise20.main(args);

        print("\nRunning Exercise 21 : ");
        Exercise21.main(args);

        print("\nRunning Exercise 22,23 and 24: ");
        Exercise22.main(args);

        print("\nRunning Exercise 25 : ");
        Exercise25.main(args);

        print("\nRunning Exercise 26 : ");
        try {
            Exercise26.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }

        print("\nRunning Exercise 27 : ");
        Exercise27.main(args);

        print("\nRunning Exercise 28 : ");
        Exercise28.main(args);

        print("\nRunning Exercise 29 : ");
        Exercise29.main(args);

        print("\nRunning Exercise 30 : ");
        Exercise30.main(args);
    }
}