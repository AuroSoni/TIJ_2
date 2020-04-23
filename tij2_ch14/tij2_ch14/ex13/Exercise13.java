package tij2_ch14.tij2_ch14.ex13;

import java.util.regex.*;

import tij2_ch14.tij2_ch14.ex12.Exercise12;

import static custom_tools.print.Print.*;

/**
 * Modify StartEnd.java(aka Exercise13) so that it uses Groups.POEM as input, 
 * but still produces positive outputs for find( ), lookingAt( ) and matches( ).  
 */
public class Exercise13 {   
    public static String input = Exercise12.POEM;  
    private static class Display {     
        private boolean regexPrinted = false;     
        private String regex;     
        Display(String regex) { 
            this.regex = regex; 
        }     
        void display(String message) {       
            if(!regexPrinted) {         
                print(regex);         
                regexPrinted = true;       
            }       
            print(message);     
        }   
    }   
    static void examine(String s, String regex) {     
        Display d = new Display(regex);     
        Pattern p = Pattern.compile(regex);     
        Matcher m = p.matcher(s);     
        while(m.find())       
        d.display("find() ‘" + m.group() + "‘ start = "+ m.start() + " end = " + m.end());     
        if(m.lookingAt()) // No reset() necessary       
        d.display("lookingAt() start = "+ m.start() + " end = " + m.end());     
        if(m.matches()) // No reset() necessary       
        d.display("matches() start = " + m.start() + " end = " + m.end());   
    }   
    public static void main(String[] args) {     
        for(String in : input.split("\n")) {       
            print("input : " + in);       
            for(String regex : new String[]{"\\w*ere\\w*","\\w*ever", "T\\w+", "T.*?."})         
            examine(in, regex);     
        }   
    } 
}