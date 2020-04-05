package tij2_ch8.tij2_ch8.ex12;
import static tij2_ch8.tij2_ch8.tools.tools.print;

class Component1{
    int cno;
    Component1(){
        print("Component1()");
        cno=1;
    }
    void dispose(){
        print("Cleaning Component1()");
    }
}

class Component2{
    int cno;
    Component2(){
        print("Component2()");
        cno=2;
    }
    void dispose(){
        print("Cleaning Component2()");
    }
}

class Component3{
    int cno;
    Component3(){
        print("Component3()");
        cno=3;
    }
    void dispose(){
        print("Cleaning Component3()");
    }
}

class Root{
    protected Component1 c1;
    protected Component2 c2;
    protected Component3 c3;

    Root(){
        print("Root()");
        c1=new Component1();
        c2=new Component2();
        c3=new Component3();
    }
    void dispose(){
        c3.dispose();
        c2.dispose();
        c1.dispose();
        print("Cleaning Root()");
    }
}

/**
 * Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9. 
 */
public class Exercise12 extends Root{
    Component1 ca;
    Component2 cb;
    Component3 cc;

    public Exercise12(){
        print("Exercise12()");
        ca=new Component1();
        cb=new Component2();
        cc=new Component3();
    }
    public void dispose(){
        cc.dispose();
        cb.dispose();
        ca.dispose();
        print("Cleaning Exercise12()");
        super.dispose();
    }
}