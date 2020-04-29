package tij2_ch15.tij2_ch15.ex10;

import static custom_tools.print.Print.*;

/**
 * Write a program to determine whether an array of char is a primitive type or a true Object. 
 */
public class Exercise10 {
    public static void main(String[] args) {
        char[] chars="Aatmaj".toCharArray();
        print("chars[] : "+chars.getClass());
        print("SuperClass : "+chars.getClass().getSuperclass());
        print("int[]  : "+int[].class);
        print("char[][][] : "+char[][][].class);
        print("String[][] : "+String[][].class);
        // char c='0';
        // print(c.getClass());
    }
}