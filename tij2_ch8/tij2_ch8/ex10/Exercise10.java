package tij2_ch8.ex10;

class Component1{
    int cno;
    String cname;
    Component1(String name){
        tij2_ch8.tools.tools.print("Component1()");
        cno=1;
        cname=name;
    }
    String print(){
        return "C1: "+cno+" "+cname;
    }
}

class Component2{
    int cno;
    String cname;
    Component2(String name){
        tij2_ch8.tools.tools.print("Component2()");
        cno=2;
        cname=name;
    }
    String print(){
        return "C2: "+cno+" "+cname;
    }
}

class Component3{
    int cno;
    String cname;
    Component3(String name){
        tij2_ch8.tools.tools.print("Component3()");
        cno=3;
        cname=name;
    }
    String print(){
        return "C3: "+cno+" "+cname;
    }
}

class Root{
    protected Component1 c1;
    protected Component2 c2;
    protected Component3 c3;

    Root(String name1,String name2, String name3){
        tij2_ch8.tools.tools.print("Root()");
        c1=new Component1(name1);
        c2=new Component2(name2);
        c3=new Component3(name3);
    }

    protected String print(){
        return "Root(): \n"+c1.print()+"\t"+c2.print()+"\t"+c3.print();
    }
}

/**
 * Modify the previous exercise so that each class only has non-default constructors.
 */
public class Exercise10 extends Root{
    Component1 ca;
    Component2 cb;
    Component3 cc;

    public Exercise10(String name1,String name2, String name3,String namea, String nameb,String namec){
        super(name1,name2,name3);
        tij2_ch8.tools.tools.print("Exercise9()");
        ca=new Component1(namea);
        cb=new Component2(nameb);
        cc=new Component3(namec);
    }

    public String print(){
        return "Exercise10(): \n"+super.print()+"\n"+ca.print()+"\t"+cb.print()+"\t"+cc.print();
    }
}