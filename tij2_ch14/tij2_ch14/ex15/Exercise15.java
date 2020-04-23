package tij2_ch14.tij2_ch14.ex15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import custom_tools.myio.TextFile;
import static custom_tools.print.Print.*;


/**
 * Modify JGrep.java(aka Exercise15) to accept flags as arguments (e.g.,
 * Pattern.CASE_INSENSITIVE, Pattern.MULTILINE).
 */
public class Exercise15 {
    public static void main(String[] args) throws Exception {     
        if(args.length < 2) {       
            print("Usage: java JGrep file regex");       
            System.exit(0);     
        }     
        Pattern p = Pattern.compile(args[1],Integer.valueOf(args[2]));     
        // Iterate through the lines of the input file:     
        int index = 0;     
        Matcher m = p.matcher("");
        for(String line : new TextFile(args[0])) {       
            m.reset(line);       
            while(m.find())         
            print(index++ + ": "+m.group() +": " + m.start());     
        }
    }   
}