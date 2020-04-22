package tij2_ch14.tij2_ch14.ex7;

import static custom_tools.print.Print.*;

/**
 * Using the documentation for java.util.regex.Pattern as a resource, 
 * write and test a regular expression that checks a sentence to see 
 * that it begins with a capital letter and ends with a period.
 */
public class Exercise7 {
    public static String REGEX="[A-Z].*\\.";
    public static void check(String string){
        boolean b=false;
        //b=s.matches("\\p{javaUpperCase}.*\\.");
        b=string.matches(REGEX);
        print("\""+string+"\""+" : " +b);
    }
    public static void main(String[] args) {
        print("Regex : "+REGEX);
        check("Hello Auro.");
        check("Hello Auro...");
        check("hello Auro.");
        check("Hello Auro");
        check(" ello Auro.");
    }
}