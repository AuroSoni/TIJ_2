package tij2_ch10.tij2_ch10.ex15;
import static custom_tools.print.Print.print;
import tij2_ch10.tij2_ch10.ex14.*;

abstract class Abstract{
    private static long counter=0;
    public final long id=counter++;

    void solidify(){
        print("abstract.solidify()");
    }
}
/**
 * Modify the previous exercise by creating an abstract class and inheriting that into the derived class.
 */
public class Exercise15 extends Abstract implements New{
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
        print("Exercise15.solidify()");
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
        Exercise15 ex15=new Exercise15();
        print("m1 : ");
        m1(ex15);
        print("\nm2 : ");
        m2(ex15);
        print("\nm3 : ");
        m3(ex15);
        print("\nm4 : ");
        m4(ex15);
        ex15.solidify();
    }
}