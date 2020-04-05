package tij2_ch8.tij2_ch8.ex8;
import static tij2_ch8.tij2_ch8.tools.tools.print;

class Base{
    int base_size;
    Base(int base){
        base_size=base;
        print("Running Base Constructor");
    }
}

/**
 * Create a base class with only a non-default constructor, 
 * and a derived class with both a default (no-arg) and non-default constructor. 
 * In the derived-class constructors, call the base-class constructor. 
 */
public class Exercise8 extends Base{
    public Exercise8(int base){
        super(base);
        print("non-default contructor");
    }
    public Exercise8(){
        super(0);
        print("default constructor");
    }
}