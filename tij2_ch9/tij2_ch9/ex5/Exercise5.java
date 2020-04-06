package tij2_ch9.tij2_ch9.ex5;
import static custom_tools.tools.print.Print.print;

enum Level{
    NOOB,BEGINNER,INTERMEDIATE,PROFESSIONAL,GOD;
}

class Cycle{
    void level(Level l){
        print("Cycle.level(): "+l);
    }
    int wheels(){
        return 0;
    }
}

class Unicycle extends Cycle{
    @Override
    void level(Level l){
        print("Unicycle.level(): "+l);
    }
    @Override
    int wheels(){
        return 1;
    }
}

class Bicycle extends Cycle{
    @Override
    void level(Level l){
        print("Bicycle.level(): "+l);
    }
    @Override
    int wheels(){
        return 2;
    }
}

class Tricycle extends Cycle{
    @Override
    void level(Level l){
        print("Tricycle.level(): "+l);
    }
    @Override
    int wheels(){
        return 3;
    }
}

/**
 * Starting from Exercise 1, add a wheels( ) method in Cycle, 
 * which returns the number of wheels. 
 * Modify ride( ) to call wheels( ) and verify that polymorphism works. 
 */
public class Exercise5 {
    public static void ride(Cycle c){
        c.level(Level.NOOB);
        print("wheels: "+c.wheels());
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