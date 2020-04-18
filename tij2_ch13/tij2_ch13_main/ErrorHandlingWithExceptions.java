package tij2_ch13.tij2_ch13_main;
import static custom_tools.print.Print.*;

import tij2_ch13.tij2_ch13.ex4.Exercise4;
import tij2_ch13.tij2_ch13.ex5.Exercise5;
import tij2_ch13.tij2_ch13.ex6.Exercise6;
import tij2_ch13.tij2_ch13.ex8.Exercise8;
import tij2_ch13.tij2_ch13.ex9.Exercise9;
import tij2_ch13.tij2_ch13.Naughty;
import tij2_ch13.tij2_ch13.ex1.Exercise1;
import tij2_ch13.tij2_ch13.ex10.Exercise10;
import tij2_ch13.tij2_ch13.ex12.Exercise12;
import tij2_ch13.tij2_ch13.ex14.Exercise14;
import tij2_ch13.tij2_ch13.ex15.Exercise15;
import tij2_ch13.tij2_ch13.ex16.Exercise16;
import tij2_ch13.tij2_ch13.ex2.Exercise2;
import tij2_ch13.tij2_ch13.ex3.Exercise3;

public class ErrorHandlingWithExceptions {
    public static void main(String[] args) {

        print("Runing Exercise 1 : ");
        Exercise1.main(args);

        print("\nRuning Exercise 2 : ");
        Exercise2.main(args);

        print("\nRuning Exercise 3 and 7: ");
        Exercise3.main(args);

        print("\nRuning Exercise 4 : ");
        Exercise4.main(args);

        print("\nRuning Exercise 5 : ");
        Exercise5.main(args);

        print("\nRuning Exercise 6 : ");
        Exercise6.main(args);

        print("\nRuning Exercise 8 : ");
        try {
            Exercise8.main(args);
        } catch (Naughty e) {
            e.printStackTrace();
        }

        print("\nRuning Exercise 9 and 13 : ");
        Exercise9.main(args);

        print("\nRuning Exercise 10 and 11 : ");
        Exercise10.main(args);

        print("\nRuning Exercise 12 : ");
        Exercise12.main(args);

        print("\nRuning Exercise 14 : ");
        Exercise14.main(args);

        print("\nRuning Exercise 15 : ");
        Exercise15.main(args);

        print("\nRuning Exercise 16 : ");
        Exercise16.main(args);
    }
}