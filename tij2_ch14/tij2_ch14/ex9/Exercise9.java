package tij2_ch14.tij2_ch14.ex9;

import static custom_tools.print.Print.*;

/**
 * Using the documentation for java.util.regex.Pattern as a resource, 
 * replace all the vowels in Splitting.knights with underscores.
 */
public class Exercise9 {
    public static String SPLITTING_KNIGHT="Then, when you have found the shrubbery, you must " +     
                                          "cut down the mightiest tree in the forest... " +  "with... a herring!";
    public static void main(String[] args) {
        print(SPLITTING_KNIGHT.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "_"));
    }
}