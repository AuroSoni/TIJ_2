package tij2_ch14.tij2_ch14.ex14;

import java.util.Arrays;
import static custom_tools.print.Print.*;

/**
 * Rewrite SplitDemo(aka Exercise14) using String.split( ).
 */
public class Exercise14 {
    public static void main(String[] args) {     
        String input = "This!!unusual use!!of exclamation!!points";     
        print(Arrays.toString(input.split("!!")));     
        // Only do the first three:     
        print(Arrays.toString(input.split("!!", 3)));   
    }
}