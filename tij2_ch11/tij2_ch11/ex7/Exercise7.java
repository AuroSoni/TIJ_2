package tij2_ch11.tij2_ch11.ex7;
import static custom_tools.tools.print.Print.print;

class Outer{
    private int field;
    private void say(){
        print("Outer.say()");
    }
    class Inner{
        private int ref=0;
        private Inner(){
            print("Creating Inner Object");
        }
        private void modify(int i){
            field=i;
            print("Inner.modify(): "+field,"Calling say().");
            say();
        }
    }
    void call(int j){
        //! ref++;
        print("Outer.call()");
        Inner i=new Inner();
        i.modify(j);
        print("ref: "+i.ref++);     //Outer class has access to all private fields and methods of Inner class.
    }
}

/**
 * Create a class with a private field and a private method. 
 * Create an inner class with a method that modifies the outer-class field and calls the outer-class method. 
 * In a second outer-class method, create an object of the inner class and call its method, 
 * then show the effect on the outer-class object. 
 */
public class Exercise7 {
    public static void main(String[] args) {
        Outer o= new Outer();
        o.call(5);
    }
}