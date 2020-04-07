package experiments.decoupling.interface_processor;
import static custom_tools.tools.print.Print.print;

/**
 * Apply class is just crated to use the static process method which 
 * First returns a string by name()
 * Second calls the process method on the object s.
 */
public class Apply {   
    public static void process(Processor p, Object s) {     
        print("Using Processor " + p.name());     
        print(p.process(s));   
    } 
}