package tij2_ch14.tij2_ch14_main;

import static custom_tools.print.Print.*;

import java.util.regex.Pattern;

import tij2_ch12.tij2_ch12.ex7.Exercise7;
import tij2_ch14.tij2_ch14.ex3.Exercise3;
import tij2_ch14.tij2_ch14.ex4.Exercise4;
import tij2_ch14.tij2_ch14.ex6.Exercise6;
import tij2_ch14.tij2_ch14.ex8.Exercise8;
import tij2_ch14.tij2_ch14.ex9.Exercise9;
import tij2_ch14.tij2_ch14.ex1.Exercise1;
import tij2_ch14.tij2_ch14.ex10.Exercise10;
import tij2_ch14.tij2_ch14.ex11.Exercise11;
import tij2_ch14.tij2_ch14.ex12.Exercise12;
import tij2_ch14.tij2_ch14.ex13.Exercise13;
import tij2_ch14.tij2_ch14.ex14.Exercise14;
import tij2_ch14.tij2_ch14.ex15.Exercise15;
import tij2_ch14.tij2_ch14.ex2.Exercise2;

public class Strings {
    public static void main(String[] args) {
        print("Running Exercise 1 : ");
        Exercise1.main(args);

        print("\nRunning Exercise 2 : ");
        Exercise2.main(args);

        print("\nRunning Exercise 3 : ");
        Exercise3.main(args);

        print("\nRunning Exercise 4 : ");
        Exercise4.main(args);

        print("\nRunning Exercise 6 : ");
        Exercise6.main(args);

        print("\nRunning Exercise 7 : ");
        Exercise7.main(args);

        print("\nRunning Exercise 8 : ");
        Exercise8.main(args);

        print("\nRunning Exercise 9 : ");
        Exercise9.main(args);

        print("\nRunning Exercise 10 : ");
        Exercise10.main(args);

        print("\nRunning Exercise 11 : ");
        Exercise11.main(args);

        print("\nRunning Exercise 12 : ");
        Exercise12.main(args);

        print("\nRunning Exercise 13 : ");
        Exercise13.main(args);

        print("\nRunning Exercise 14 : ");
        Exercise14.main(args);

        print("\nRunning Exercise 15 : ");
        try {
            Exercise15.main(new String[] { "tij2_ch14\\tij2_ch14\\ex15\\Exercise15.java", "\\b[Ssct]\\w+",
                    String.valueOf(Pattern.CASE_INSENSITIVE) });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}