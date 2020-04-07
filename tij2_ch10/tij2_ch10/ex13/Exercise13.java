package tij2_ch10.tij2_ch10.ex13;
import static custom_tools.tools.print.Print.print;

interface base{
    public String name();
}

interface d1 extends base{
    int ID_1=1;
    void getID_1();
}

interface d2 extends base{
    int ID_2=2;
    void getID_2();
}

interface diamond extends d1, d2{
    int NO=3;
    void getNO();
}

/**
 * Create an interface, and inherit two new interfaces from that interface. 
 * Multiply inherit a third interface from the second two.
 */
public class Exercise13 implements diamond{

    @Override
    public void getID_1() {
        print("ID_1 : "+ID_1);
    }

    @Override
    public void getID_2() {
        print("ID_2 : "+ID_2);
    }

    @Override
    public void getNO() {
        print("NO : "+NO);
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    public static void main(String[] args) {
        diamond d=new Exercise13();
        print(d.name());
        d.getID_1();
        d.getID_2();
        d.getNO();
    }

}