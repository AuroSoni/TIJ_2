package tij2_ch11.tij2_ch11_main;

import static custom_tools.tools.print.Print.print;

import tij2_ch11.tij2_ch11.ex1.Exercise1;
import tij2_ch11.tij2_ch11.ex2.Exercise2;
import tij2_ch11.tij2_ch11.ex3.Exercise3;

public class InnerClasses {
    public static void main(String[] args) {
        print("Running Exercise 1 : ");
        Exercise1.main(args);

        print("\nRunning Exercise 2 and 4 : ");
        Exercise2.main(args);

        print("\nRunning Exercise 3 & 5: ");
        Exercise3.main(args);
    }
}