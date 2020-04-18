package tij2_ch13.tij2_ch13.ex14;

/**
 * Show that OnOffSwitch.java(aka Exercise14) can fail by throwing a RuntimeException inside the try block.
 */
public class Exercise14 {
    private static Switch sw = new Switch();   
    public static void f() throws OnOffException1,OnOffException2 {
        throw new RuntimeException();
    }   
    public static void main(String[] args) {     
        try {       
            sw.on();       
            // Code that can throw exceptions...       
            f();       
            sw.off();     
        } catch(OnOffException1 e) {       
            System.out.println("OnOffException1");       
            sw.off();     
        } catch(OnOffException2 e) {       
            System.out.println("OnOffException2");       
            sw.off();     
        }   
    }
}