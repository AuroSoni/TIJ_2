package tij2_ch11.tij2_ch11.ex3;
import static custom_tools.tools.print.Print.print;

class Outer{
    private String name;
    Outer(String name){
        this.name=name;
    }
    class Inner{
        Inner(){
            print("Inner()");
        }
        public String toString(){
            return name;
        }
    }
    Inner inner(){
        return new Inner();
    }
}

/**
 * Modify Exercise 1 so that Outer has a private String field (initialized by the constructor), 
 * and Inner has a toString( ) that displays this field. 
 * Create an object of type Inner and display it. 
 */
public class Exercise3 {
    public static void main(String[] args) {
        Outer o=new Outer("Auro");
        Outer.Inner i= o.inner();
        print(i.toString());
    }
}