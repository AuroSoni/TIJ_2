package experiments.decoupling;

import java.util.Arrays;
import static custom_tools.tools.print.Print.print;

/**
 * Implementing processor as a class restricts its reusability.
 * For eg, we couldnt use Apply.process() for Different  kinds of Filters that are
 * derive from the class {@link experiments.decoupling.filters.Filter}
 * @see experiments.decoupling.interface_processor.Processor
 */
public class Processor {
    public String name() {     
        return getClass().getSimpleName();   
    }   
    Object process(Object input) { 
        return input; 
    } 
}  
 
class Upcase extends Processor {   
    String process(Object input) { 
        // Covariant return     
        return ((String)input).toUpperCase();   
    } 
} 
 
class Downcase extends Processor {   
    String process(Object input) {     
        return ((String)input).toLowerCase();   
    } 
} 
 
class Splitter extends Processor {   
    String process(Object input) {     
        // The split() argument divides a String into pieces:     
        return Arrays.toString(((String)input).split(" "));   } }  
 
class Apply {   
    public static void process(Processor p, Object s) {     
        print("Using Processor " + p.name());     //polymorphic
        print(p.process(s));                      //polymorphic
    }   
    public static String s = "Disagreement with beliefs is by definition incorrect";  
    
    /**
     * Creating a method that behaves differently(aka process()) depending on the 
     * argument object that you pass it is called the Strategy design pattern. 
     * The method(process()) contains the fixed part of the algorithm to be performed, 
     * and the Strategy contains the part that varies. 
     * The Strategy is the object that you pass in, and it contains code to be executed. 
     * Here, the Processor object is the Strategy, and in main( ) 
     * you can see three different Strategies applied to the String s.
     * @param args default
     */
    public static void main(String[] args) {     
        process(new Upcase(), s);       //Upcase Strategy
        process(new Downcase(), s);     //Downcase Strategy
        process(new Splitter(), s);     //Splitter Strategy
    } 
}