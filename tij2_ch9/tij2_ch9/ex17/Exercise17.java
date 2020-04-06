package tij2_ch9.tij2_ch9.ex17;
import static custom_tools.tools.print.Print.print;

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
    void balance(){
        print("Unicycle.balance()");
    }
}

class Bicycle extends Cycle{
    @Override
    void level(Level l){
        print("Bicycle.level(): "+l);
    }
    void balance(){
        print("Bicycle.balance()");
    }
}

class Tricycle extends Cycle{
    @Override
    void level(Level l){
        print("Tricycle.level(): "+l);
    }
}

/**
 * Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and Bicycle, 
 * but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle. 
 * Try to call balance( ) on each element of the array and observe the results. 
 * Downcast and call balance( ) and observe what happens. 
 */
public class Exercise17 {
    public static void main(String[] args) {
        Cycle[] cycles={new Unicycle(),new Bicycle(),new Tricycle()};
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        //! ((Tricycle)cycles[2]).balance();
    }
}