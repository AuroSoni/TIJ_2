package tij2_ch14.tij2_ch14.ex8;

import static custom_tools.print.Print.*;

/**
 * Split the string Splitting.knights on the words "the" or “you."  
 */
public class Exercise8 {
    public static String SPLITTING_KNIGHT="Then, when you have found the shrubbery, you must " +     
                                          "cut down the mightiest tree in the forest... " +  "with... a herring!";
    public static void main(String[] args) {
        print(SPLITTING_KNIGHT.split("(the)|(you)"));
    }
}