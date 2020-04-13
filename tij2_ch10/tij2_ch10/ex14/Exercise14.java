package tij2_ch10.tij2_ch10.ex14;
import static custom_tools.print.Print.print;

class concrete{
    private static long counter=0;
    public final long id=counter++;

    void solidify(){
        print("concrete.solidify()");
    }
}

/**
 * Create three interfaces, each with two methods. 
 * Inherit a new interface that combines the three, adding a new method. 
 * Create a class by implementing the new interface and also inheriting from a concrete class. 
 * Now write four methods, each of which takes one of the four interfaces as an argument. 
 * In main( ), create an object of your class and pass it to each of the methods.
 */
public class Exercise14 extends concrete implements New{

    @Override
    public void kill() {
        print("kill");
    }

    @Override
    public void desynchronise() {
        print("desynchronise");
    }

    @Override
    public void heal() {
        print("heal");
    }

    @Override
    public void incarnate() {
        print("incarnate");
    }

    @Override
    public void say() {
        print("say");
    }

    @Override
    public void talk() {
        print("talk");
    }

    @Override
    public void start() {
        print("start");
    }

    @Override
    public void solidify(){
        print("Exercise14.solidify()");
        super.solidify();
    }

    static void m1(I1 i1){
        i1.kill();
        i1.desynchronise();
    }

    static void m2(I2 i2){
        i2.incarnate();
        i2.heal();
    }

    static void m3(I3 i3){
        i3.talk();
        i3.say();
    }

    static void m4(New n){
        n.start();
        m1(n);
        m2(n);
        m3(n);
    }
    public static void main(String[] args) {
        Exercise14 ex14=new Exercise14();
        print("m1 : ");
        m1(ex14);
        print("\nm2 : ");
        m2(ex14);
        print("\nm3 : ");
        m3(ex14);
        print("\nm4 : ");
        m4(ex14);
        ex14.solidify();
    }
}