package tij2_ch11.tij2_ch11.ex16;
import static custom_tools.tools.print.Print.print;

interface Cycle{
    void move();
}

interface CycleFactory{
    Cycle generate();
}

class Unicycle implements Cycle{
    private static int WHEELS=1;
    @Override
    public void move(){
        print("Uniycle.move()","WHEELS : "+WHEELS);
    }
    public static CycleFactory cycleFactory=new CycleFactory(){
    
        @Override
        public Cycle generate() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle{
    private static int WHEELS=2;
    @Override
    public void move(){
        print("Bicycle.move()","WHEELS : "+WHEELS);
    }
    public static CycleFactory cycleFactory=new CycleFactory(){
    
        @Override
        public Cycle generate() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle{
    private static int WHEELS=3;
    @Override
    public void move(){
        print("Tricycle.move()","WHEELS : "+WHEELS);
    }
    public static CycleFactory cycleFactory=new CycleFactory(){
    
        @Override
        public Cycle generate() {
            return new Tricycle();
        }
    };
}

/**
 * Modify the solution to Exercise 18 from the Interfaces chapter to use anonymous inner classes. 
 */
public class Exercise16 {
    private static void ride(CycleFactory cf){
        Cycle cycle=cf.generate();
        cycle.move();
    }
    public static void main(String[] args) {
        ride(Unicycle.cycleFactory);
        ride(Bicycle.cycleFactory);
        ride(Tricycle.cycleFactory);
    }
}