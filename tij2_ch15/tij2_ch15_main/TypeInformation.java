package tij2_ch15.tij2_ch15_main;

import static custom_tools.print.Print.*;

import tij2_ch15.tij2_ch15.ex3.Exercise3;
import tij2_ch15.tij2_ch15.ex5.Exercise5;
import tij2_ch15.tij2_ch15.ex6.Exercise6;
import tij2_ch15.tij2_ch15.ex7.Exercise7;
import tij2_ch15.tij2_ch15.ex8.Exercise8;
import tij2_ch15.tij2_ch15.ex1.Exercise1;
import tij2_ch15.tij2_ch15.ex10.Exercise10;

public class TypeInformation {
    public static void main(String[] args) {

        print("Running Exercise 1 and 2 : ");
        Exercise1.main(args);

        print("\nRunning Exercise 3 and 4 : ");
        Exercise3.main(args);

        print("\nRunning Exercise 5 : ");
        Exercise5.main(args);

        print("\nRunning Exercise 6 : ");
        Exercise6.main(args);

        print("\nRunning Exercise 7 : ");
        Exercise7.main(new String[]{"Gum","Candy","Gum","Juice"});

        print("\nRunning Exercise 8 and 9 : ");
        Exercise8.main(new String[]{"tij2_ch15.tij2_ch15.ex6.Triangle","tij2_ch10.tij2_ch10.ex14.Exercise14","tij2_ch10.tij2_ch10.ex13.Exercise13"});
        
        print("\nRunning Exercise 10 : ");
        Exercise10.main(args);
    }
}