package tij2_ch13.tij2_ch13.ex15;

import tij2_ch13.tij2_ch13.ex14.Switch;
import tij2_ch13.tij2_ch13.ex14.*;

/**
 * Show that WithFinally.java(aka Exercise15) doesn’t fail by throwing a RuntimeException inside the try block.  
 */
public class Exercise15 {   
    static Switch sw = new Switch();   
    public static void main(String[] args) {     
        try {       
            sw.on();       
            // Code that can throw exceptions...       
            Exercise14.f();     
        } catch(OnOffException1 e) {       
            System.out.println("OnOffException1");     
        } catch(OnOffException2 e) {       
            System.out.println("OnOffException2");     
        } finally {       
            sw.off();     
        }   
    } 
} 