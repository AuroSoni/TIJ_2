package tij2_ch8.tij2_ch8.ex9;
import static custom_tools.print.Print.*;

class Component1{
    int cno;
    Component1(){
        print("Component1()");
        cno=1;
    }
}

class Component2{
    int cno;
    Component2(){
        print("Component2()");
        cno=2;
    }
}

class Component3{
    int cno;
    Component3(){
        print("Component3()");
        cno=3;
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
}
/**
 * Create a class called Root that contains an instance of each of the classes 
 * (that you also create) named Component1, Component2, and Component3. 
 * Derive a class Stem(aka Exercise9) from Root that also contains an instance of each “component.” 
 * All classes should have default constructors that print a message about that class. 
 */
public class Exercise9 extends Root{
    Component1 ca;
    Component2 cb;
    Component3 cc;

    public Exercise9(){
        print("Exercise9()");
        ca=new Component1();
        cb=new Component2();
        cc=new Component3();
    }
}