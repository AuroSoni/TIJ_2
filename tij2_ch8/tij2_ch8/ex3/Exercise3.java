package tij2_ch8.ex3;

class Art {   
    Art() { 
        System.out.println("Art constructor"); 
    } 
} 
 
class Drawing extends Art {   
    Drawing() { 
        System.out.println("Drawing constructor"); 
    } 
}

/**
 *  Even if you don’t create a constructor for Exercise3( ), 
 * the compiler will synthesize a default constructor for you that calls the base class constructor. 
 */
public class Exercise3 extends Drawing{
    int qno=3;
    public int getqno(){
        return qno;
    }
}
