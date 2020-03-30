package tij2_ch3_main;

import java.math.BigInteger;

import tij2_ch3.EverythingIsAnObject;
import tij2_ch3.EverythingIsAnObject.Exercise1;

/**
 * Implements the main method to execute classes in {@link tij2_ch3}
 */
public class EverythingIsAnObject_main {
    public static void main(String[] args) {
        EverythingIsAnObject ex=new EverythingIsAnObject();

        System.out.println("Running Exercise 1 : ");
        Exercise1 ex1=ex.c1();
        System.out.println("Default int : "+ex1.i);
        System.out.println("Default char : "+ex1.c);

        pause(BigInteger.valueOf(5));
        
        System.out.println("Running Exercise 2 : ");
        EverythingIsAnObject.Exercise2.sayHello();

        pause(BigInteger.valueOf(5));
    }

    /**
     * Used to introduce a delay via while loop.
     * @param a not null
     * @return null
     * @deprecated
     */
    protected static void pause(BigInteger a) {
        BigInteger j=BigInteger.valueOf(100000000);
        while(j.compareTo(BigInteger.valueOf(0))>0){
            j=j.subtract(BigInteger.valueOf(1));
        }
    } 
}