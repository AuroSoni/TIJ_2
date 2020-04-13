package tij2_ch11.tij2_ch11.ex20;
import static custom_tools.print.Print.print;

interface Nested{
    String toString();
    class Inner{
        void say(){
            print("Hello!!!");
        }
    }
}
/**
 * Create an interface containing a nested class. 
 * Implement this interface and create an instance of the nested class
 */
public class Exercise20 implements Nested{
    @Override
    public String toString(){
        return "Exercise20";
    }
    static Inner i = new Inner();
    public static void main(String[] args) {
        i.say();
        print(new Inner().toString());
    }
}