package tij2_ch14.tij2_ch14;

import java.util.Scanner;
import static custom_tools.print.Print.*;

/**
 * Create a class that contains int, long, float and double and String fields. 
 * Create a constructor for this class that takes a single String argument, 
 * and scans that string into the various fields. 
 * Add a toString( ) method and demonstrate that your class works correctly. 
 */
public class Exercise20 {
    int i;
    long l;
    float f;
    double d;
    String s;
    static final String SOURCE="123 239749823 3423.53 437.346327 Chavalo";
    Exercise20(Scanner scanned){
        i=scanned.nextInt();
        l=scanned.nextLong();
        f=scanned.nextFloat();
        d=scanned.nextDouble();
        s=scanned.nextLine();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(SOURCE);
        print(new Exercise20(input));
    }
    public String toString(){
        StringBuilder data=new StringBuilder();
        data.append(String.format("%-7s : "+"%10d", "Int",i));
        data.append("\n");
        data.append(String.format("%-7s : "+"%10d", "Long",l));
        data.append("\n");
        data.append(String.format("%-7s : "+"%10.2f", "Float",f));
        data.append("\n");
        data.append(String.format("%-7s : "+"%10.5f", "Double",d));
        data.append("\n");
        data.append(String.format("%-7s : "+"%10s", "String",s));
        data.append("\n");
        return data.toString();
    }
}