package tij2_ch9.tij2_ch9.ex1;
import static custom_tools.print.Print.print;

enum Level{
    NOOB,BEGINNER,INTERMEDIATE,PROFESSIONAL,GOD;
}

class Cycle{
    void level(Level l){
        print("Cycle.level(): "+l);
    }
}

class Unicycle extends Cycle{
    @Override
    void level(Level l){
        print("Unicycle.level(): "+l);
    }
}

class Bicycle extends Cycle{
    @Override
    void level(Level l){
        print("Bicycle.level(): "+l);
    }
}

class Tricycle extends Cycle{
    @Override
    void level(Level l){
        print("Tricycle.level(): "+l);
    }
}

/**
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. 
 * Demonstrate that an instance of each type can be upcast to Cycle via a level( ) method.
 */
public class Exercise1{

    public static void ride(Cycle c){
        c.level(Level.NOOB);
    }

    public static void main(String[] args) {
        Tricycle t=new Tricycle();
        Bicycle b=new Bicycle();
        Unicycle u=new Unicycle();
    
        print("Upcasting Unicycle : ");
        ride(u);
        print("Upcasting Bicycle : ");
        ride(b);
        print("Upcasting Tricycle : ");
        ride(t);
    }
}