package tij2_ch8.ex2;

class Cleanser {   
    private String s = "Cleanser";   
    public void append(String a) { s += a; }   
    public void dilute() { append(" dilute()"); }   
    public void apply() { append(" apply()"); }   
    public void scrub() { append(" scrub()"); }   
    public String toString() { return s; }   
    public static void main(String[] args) {     
        Cleanser x = new Cleanser();     
        x.dilute(); 
        x.apply(); 
        x.scrub();     
        System.out.println(x);   
    } 
}  

/**
 * Inherit a new class from class Exercise2. Override scrub( ) and add a new method called sterilize( ). 
 */
public class Exercise2 extends Cleanser {   
    // Change a method:   
    public void scrub() {     
        append(" Detergent.scrub()");     
        super.scrub(); 
        // Call base-class version   
    }   
    // Add methods to the interface:   
    public void foam() { append(" foam()"); }   
    // Test the new class:   
    public static void main(String[] args) {     
        Exercise2 x = new Exercise2();  
        x.dilute();     
        x.apply();     
        x.scrub();     
        x.foam();     
        System.out.println(x);     
        System.out.println("Testing base class:");     
        Cleanser.main(args);   
    }  
}