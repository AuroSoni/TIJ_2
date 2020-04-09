package tij2_ch11.tij2_ch11.ex12;
import tij2_ch11.tij2_ch11.ex7.Outer;
import static custom_tools.tools.print.Print.print;


/**
 * Repeat {@link tij2_ch11.tij2_ch11.ex7.Exercise7} using an anonymous inner class. 
 */
public class Exercise12 {
    private static Outer anoymous(){
        return new Outer(){
            {
                print("Anoymous Outer Object Created");
                this.call(5);
            }
        };
    }
    public static void main(String[] args) {
        Outer o=anoymous();
        print(o.toString());
    }
}