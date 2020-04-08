package tij2_ch11.tij2_ch11.ex6;
import static custom_tools.tools.print.Print.print;

/**
 * Create an interface with at least one method, in its own package. 
 * Create a class in a separate package. Add a protected inner class that implements the interface. 
 * In a third package, inherit from your class and, inside a method, return an object of the protected inner class, 
 * upcasting to the interface during the return. 
 */
public class Exercise6 extends OuterClass{
    Interface gen(){
        print(this);
        return this.new InnerClass();          //Awesome!!!
    }
    public static void main(String[] args) {
        Exercise6 ex6=new Exercise6();
        ex6.gen().name();
        
    }

    public String toString(){
        return "Exercise6";
    }
}