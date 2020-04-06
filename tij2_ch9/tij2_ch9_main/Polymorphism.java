package tij2_ch9.tij2_ch9_main;
import static custom_tools.tools.print.Print.print;

import tij2_ch9.tij2_ch9.ex1.Exercise1;
import tij2_ch9.tij2_ch9.ex2.Exercise2;
import tij2_ch9.tij2_ch9.ex5.Exercise5;
import tij2_ch9.tij2_ch9.ex9.Exercise9;

public class Polymorphism {
    public static void main(String[] args) {
        
        print("\nRunning Exercise 1 : ");
        Exercise1.main(args);

        print("\nRunning Exercise 2,3 and 4 : ");
        Exercise2.main(args);

        print("\nRunning Exercise 5 : ");
        Exercise5.main(args);

        print("\nRunning Exercise 9 : ");
        Exercise9.main(args);
    }
}