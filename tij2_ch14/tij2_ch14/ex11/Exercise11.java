package tij2_ch14.tij2_ch14.ex11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static custom_tools.print.Print.*;

/**
 * Apply the regular expression  
 * (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b  
 * to  
 * "Arline ate eight apples and one orange while Anita hadn’t any" 
 */
public class Exercise11 {
    public static void main(String[] args) {
        String s="Arline ate eight apples and one orange while Anita hadn’t any" ;
        String regex="(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        Pattern p= Pattern.compile(regex);
        Matcher m= p.matcher(s);
        print(s+" has : ");
        while (m.find()) {
            printnb("["+m.group()+"] in ("+m.start()+","+m.end()+")\t");
        }
    }
}