package tij2_ch4_main;

import tij2_ch4.Operators;
import tij2_ch4.Operators.Exercise2;

/**
 * Implements the main method to run the objects in {@link tij2_ch4}
 */
public class Operators_main{

    /**
    * Program execution begins here
    * @param args
    */
    public static void main(String[] args) {
        Operators ex=new Operators();

        System.out.println("Running Exercise 1 : ");
        Operators.Exercise1.print("This is the string passed");

        System.out.println("Running Exercise 2 : ");
        Exercise2 ex2_1=ex.exercise2((float) 5.0);
        Exercise2 ex2_2=ex.exercise2((float) 7.0);
        System.out.println("ex2_1 : "+ex2_1.f+"\t"+"ex2_2 : "+ex2_2.f);
        ex2_2=ex2_1;
        System.out.println("ex2_1 : "+ex2_1.f+"\t"+"ex2_2 : "+ex2_2.f);
        ex2_1.f=10;
        System.out.println("ex2_1 : "+ex2_1.f+"\t"+"ex2_2 : "+ex2_2.f);
    }
}