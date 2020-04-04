package tij2_ch8.ex3;
import static tij2_ch8.tools.tools.print;

class Art {   
    Art() { 
        print("Art constructor"); 
    } 
} 
 
class Drawing extends Art {   
    Drawing() { 
        print("Drawing constructor"); 
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
