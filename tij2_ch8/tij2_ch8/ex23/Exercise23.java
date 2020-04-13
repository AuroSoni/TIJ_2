package tij2_ch8.tij2_ch8.ex23;
import static custom_tools.print.Print.*;

class General{
    public static int message(String s,int i){
        print(s);
        return i;
    }
    public static String message(String s,String init){
        print(s);
        return init;
    }
}
class  B1{
    protected static String id;
    int obj;
    int a=General.message("a initialised", 1);
    int b;
    B1(){
        id+=General.message("B1 id initialised", "B1\t");
        obj=General.message("Obj Initialised", 2);
    }
}

class D1 extends B1{
    private static int d;
    static String s;
    static{
        d=General.message("D1 d initialised", 0);
        s=General.message("D1 s initialised", "Hi");
    }

    int e;
    int f;
    {
        e=General.message("D1 e initialised", d+1);
        f=General.message("D1 f initialised", d+2);
    }
    D1(){
        id+=General.message("D1 id initialised","D1\t");
    }
}

final class D2 extends D1{
    static int g;
    private int f=General.message("D2 f initialised", 0);
    D2(int i){
        g=General.message("D2 g initialised", i+f);
        id+=General.message("D2 id initialised", "D2\t");
    }
}

class case_A extends B1{
    static int j;
    case_A(){
        j=General.message("A j initialised", 10);
    }
    public static void main(String[] args) {
        print("Starting A.main()");
        new case_A();
    }
}

class case_B extends D1{
    public static void main(String[] args) {
        print("Starting B.main()");
        new case_B();
    }
}

class case_C {
    public static void main(String[] args) {
        print("Starting C.main()");
        D2 d2 =new D2(5);
        print("d2: "+d2);
    }
}

/**
 * Prove that class loading takes place only once. 
 * Prove that loading may be caused by either the creation of the 
 * first instance of that class or by the access of a static member.
 */
public class Exercise23 {
    public static void main(String[] args) {
        print("Now Starting main()");
        char case_='v';
        switch(case_){
            case 'A':
                case_A.main(args);
                break;
            case 'B':
                case_B.main(args);
                break;
            case 'c':
                case_C.main(args);
                break;
            default:
                print(new D2(10).toString(),D2.id);
        }
    }
}