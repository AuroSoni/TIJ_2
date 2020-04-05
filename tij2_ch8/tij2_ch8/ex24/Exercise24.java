package tij2_ch8.tij2_ch8.ex24;
import static tij2_ch8.tij2_ch8.tools.tools.print;

class Insect {   
    private int i = 9;   
    protected int j;   
    Insect() {     
        print("i = " + i , "j = " + j);     
        j = 39;   
    }   
    private static int x1 = printInit("static Insect.x1 initialized");   
    static int printInit(String s) {
        print(s);     
        return 47;   
    }
    public int getx1(){
        return x1;
    } 
} 
 
class Beetle extends Insect {   
    private int k = printInit("Beetle.k initialized");
    protected int l=printInit("Beetle.l initialised");   
    public Beetle() {     
        print("k = " + k); 
        print("l= "+l);    
        print("j = " + j);   
    }   
    private static int x2 = printInit("static Beetle.x2 initialized");   
    public static void main(String[] args) {     
        print("Beetle constructor");     
        Beetle b = new Beetle(); 
        print(b);  
    } 
    public int getx2(){
        return x2;
    }
}

/**
 * In Beetle.java, inherit a specific type of beetle from class Beetle, 
 * following the same format as the existing classes. 
 * Trace and explain the output. 
 */
public class Exercise24 extends Beetle{
    private int m = printInit("Exercise24.l initialised");
    protected int n= printInit("Exercise24.n initialised");
    Exercise24(){
        print("m= "+m,"n= "+n,"l= "+l,"j= "+j);
    }
    private static int x3 = printInit("static Exercise.x3 initialised");
    public static void main(String[] args) {
        print("Exercise24 consttructor");
        Exercise24 ex24 = new Exercise24();
        print(ex24);
        Beetle.main(args);
    }
    public int getx3(){
        return x3;
    }
}
