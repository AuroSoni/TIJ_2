package tij2_ch10.tij2_ch10.ex4;
import static custom_tools.tools.print.Print.print;

abstract class Base{
    abstract public String what();
}

class Derived1 extends Base{
    @Override
    public String what(){
        return "Derived1";
    }
    static void m1(Base b){
        print("Derived1.m1()");
        print((b).what());
    } 
}

/**
 * Create an abstract class with no methods. Derive a class and add a method. 
 * Create a static method that takes a reference to the base class, 
 * downcasts it to the derived class, and calls the method. 
 * In main( ), demonstrate that it works. Now put the abstract declaration 
 * for the method in the base class, thus eliminating the need for the downcast.
 */
public class Exercise4 {
    public static void main(String[] args) {
        Derived1.m1(new Derived1());
    }
}