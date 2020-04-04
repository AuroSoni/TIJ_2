package tij2_ch8.ex13;
import static tij2_ch8.tools.tools.print;

class base{
    protected int overload=1;
    void overload(int i){
        print("overload1()"+overload+1);
    }
    void overload(float f){
        print("overload2()"+overload+2);
    }
    void overload(double d){
        print("overload3()"+overload+3);
    }
    void override(int i){
        overload+=i;
        print("overload: "+overload);
    }
}

/**
 * Create a class with a method that is overloaded three times. 
 * Inherit a new class, add a new overloading of the method, 
 * and show that all four methods are available in the derived class.
 */
public class Exercise13 extends base{
    void overload(){
        print("overload()"+overload);
    }
    @Override
    void override(int i){
        overload*=i;
        print("overload: "+overload);
    }

    public static void main(String[] args) {
        Exercise13 ex13=new Exercise13();
        print("overloading!!!");
        ex13.overload(2);
        ex13.overload(2.0f);
        ex13.overload(2.0d);
        ex13.overload();
        ex13.override(3);
    }
}