package tij2_ch10.tij2_ch10.ex9;
import static custom_tools.tools.print.Print.print;

/**
 * Modify Musics.java by adding a Playable interface. 
 * Move the play( ) declaration from Instrument to Playable. 
 * Add Playable to the derived classes by including it in the implement s list. 
 * Change tune( ) so that it takes a Playable instead of an Instrument. 
 */
interface Playable{
        // Cannot have method definitions:   
        void play(Note n); 
}
enum Note{
    C_SHARP,C_MIDDLE,C_FLAT;
}

abstract class Instrument {   
    // Compile-time constant:   
    int VALUE = 5; // static & final   
    // Automatically public   
    void adjust(){
        print(this+".adjust");
    }
    
    public abstract String toString();
} 
 
class Wind extends Instrument implements Playable{   
    @Override
    public void play(Note n) {     
        print(this + ".play() " + n);   
    }   
    @Override
    public String toString() { 
        return "Wind"; 
    }   
} 
 
class Percussion extends Instrument implements Playable{   
    @Override
    public void play(Note n) {     
        print(this + ".play() " + n);   
    }   
    @Override
    public String toString() { 
        return "Percussion"; 
    }   
} 
 
class Stringed extends Instrument implements Playable{   
    @Override
    public void play(Note n) {     
        print(this + ".play() " + n);   
    }   
    @Override
    public String toString() { 
        return "Stringed"; 
    }   
} 
 
class Brass extends Wind {   
    public String toString() { 
        return "Brass"; 
    } 
}  
 
class Woodwind extends Wind {   
    public String toString() { 
        return "Woodwind"; 
    } 
} 

/**
 * Refactor Musics.java by moving the common methods in Wind, Percussion and Stringed into an abstract class. 
 */
public class Exercise9 {   
    // Doesn’t care about type, so new types   
    // added to the system still work right:   
    static void tune(Playable i) {     
        // ...     
        i.play(Note.C_MIDDLE);   
    }   
    static void tuneAll(Playable[] e) {     
        for(Playable i : e) tune(i);   
    }    
    public static void main(String[] args) {     
        // Upcasting during addition to the array:     
        Playable[] orchestra = {new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};     
        tuneAll(orchestra);   
    }
} 
