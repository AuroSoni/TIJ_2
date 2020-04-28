package tij2_ch15.tij2_ch15_main;

import static custom_tools.print.Print.*;

import tij2_ch15.tij2_ch15.ex3.Exercise3;
import tij2_ch15.tij2_ch15.ex5.Exercise5;
import tij2_ch15.tij2_ch15.ex1.Exercise1;

public class TypeInformation {
    public static void main(String[] args) {

        print("Running Exercise 1 and 2 : ");
        Exercise1.main(args);

        print("\nRunning Exercise 3 and 4 : ");
        Exercise3.main(args);

        print("\nRunning Exercise 5 : ");
        Exercise5.main(args);
    }
}