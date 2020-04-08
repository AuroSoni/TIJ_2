package tij2_ch10.tij2_ch10.ex18;
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
}

class Bicycle implements Cycle{
    private static int WHEELS=2;
    @Override
    public void move(){
        print("Bicycle.move()","WHEELS : "+WHEELS);
    }
}

class Tricycle implements Cycle{
    private static int WHEELS=3;
    @Override
    public void move(){
        print("Tricycle.move()","WHEELS : "+WHEELS);
    }
}

class UnicycleFactory implements CycleFactory{
    @Override
    public Unicycle generate(){
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory{
    @Override
    public Bicycle generate(){
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory{
    @Override
    public Tricycle generate(){
        return new Tricycle();
    }
}

/**
 * Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. 
 * Create factories for each type of Cycle, and code that uses these factories.
 */
public class Exercise18 {
    static void use(CycleFactory cf){
        Cycle c=cf.generate();
        print(c.getClass().getSimpleName()+" Running ");
        c.move();
    }
    public static void main(String[] args) {
        use(new UnicycleFactory());
        use(new BicycleFactory());
        use(new TricycleFactory());
    }
}