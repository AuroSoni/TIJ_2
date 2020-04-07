package experiments.decoupling.interface_processor;

import java.util.Arrays;

/**
 * This is how the client would now use the Processor interface.
 * Making the class abstract is the need of design.
 * @see experiments.decoupling.Processor
 * @see experiments.decoupling.interface_processor.Processor
 * @see experiments.decoupling.interface_processor.FilterProcessor
 */
public abstract class StringProcessor implements Processor {
    public String name() {     
        return getClass().getSimpleName();   
    }   
    public abstract String process(Object input);   
    public static String s = "If she weighs the same as a duck, she’s made of wood";   
    public static void main(String[] args) {     
        Apply.process(new Upcase(), s);     
        Apply.process(new Downcase(), s);     
        Apply.process(new Splitter(), s);   
    } 
}  
 
class Upcase extends StringProcessor {   
    public String process(Object input) { 
        // Covariant return     
        return ((String)input).toUpperCase();   
    } 
} 
 
class Downcase extends StringProcessor {   
    public String process(Object input) {     
        return ((String)input).toLowerCase();   
    } 
} 
 
class Splitter extends StringProcessor {   
    public String process(Object input) {     
        return Arrays.toString(((String)input).split(" "));   
    }  
} 