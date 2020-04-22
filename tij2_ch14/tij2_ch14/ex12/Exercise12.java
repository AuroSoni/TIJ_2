package tij2_ch14.tij2_ch14.ex12;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static custom_tools.print.Print.*;

/**
 * Modify Groups.java to count all of the unique words that do not start with a capital letter.
 */
public class Exercise12 {
    static Collection<String> set=new LinkedHashSet<>();
    static public final String POEM = "Twas brillig, and the slithy toves\n" + "Did gyre and gimble in the wabe.\n" +     
                                      "All mimsy were the borogoves,\n" + "And the mome raths outgrabe.\n\n" +     
                                      "Beware the Jabberwock, my son,\n" + "The jaws that bite, the claws that catch.\n" +     
                                      "Beware the Jubjub bird, and shun\n" + "The frumious Bandersnatch.";   
    public static void main(String[] args) {     
        Matcher m = Pattern.compile("\\b((\\p{javaLowerCase})\\w*)").matcher(POEM);     
        
        while(m.find()) {                 
            set.add(m.group());
        }   
        print(set);
    } 
}