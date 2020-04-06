package tij2_ch9.tij2_ch9.ex13;
import static custom_tools.tools.print.Print.print;

class Shared {   
    private int refcount = 0;   
    private static long counter = 0;   
    private final long id = counter++;   
    public Shared() {      
        print("Creating " + this);  
    }
    public void addRef() { 
        refcount++; 
    }   
    protected void dispose() {     
        if(--refcount == 0){ 
            print("Disposing " + this);
            --counter;
        }
    }   
    public String toString() { 
        return "Shared " + id; 
    }
    protected void finalize(){
        print("finalize()");
        if(refcount!=0)
        print(this+" not cleaned up propery");
        if(counter!=0)
        print("Dangling Shared remains");
    } 
} 
 
class Composing {   
    private Shared shared;   
    private static long counter = 0;   
    private final long id = counter++;   
    public Composing(Shared shared) {     
        print("Creating " + this);     
        this.shared = shared;     
        this.shared.addRef();   
    }   
    protected void dispose() {     
        print("disposing " + this);     
        shared.dispose();   
    }   
    public String toString() { 
        return "Composing " + id; 
    } 
    protected void finalize(){
        print("Composing.finalize()");
        shared.finalize();
    }
} 

/**
 * Add a finalize( ) method to ReferenceCounting.java 
 * to verify the termination condition (see the Initialization & Cleanup chapter). 
 */
public class Exercise13 {
    public static void main(String[] args) {     
        Shared shared = new Shared();     
        Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared) };
        for(Composing c : composing) c.dispose();
        System.gc();
        System.runFinalization();
        new Shared();
        System.gc();
        System.runFinalization();
    }
}