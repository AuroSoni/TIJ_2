package tij2_ch13.tij2_ch13_main;
import static custom_tools.print.Print.*;

import tij2_ch13.tij2_ch13.ex1.Exercise1;
import tij2_ch13.tij2_ch13.ex2.Exercise2;
import tij2_ch13.tij2_ch13.ex3.Exercise3;

public class ErrorHandlingWithExceptions{
    public static void main(String[] args) {

        print("Runing Exercise 1 : ");
        Exercise1.main(args);

        print("\nRuning Exercise 2 : ");
        Exercise2.main(args);

        print("\nRuning Exercise 3 : ");
        Exercise3.main(args);
    }
}