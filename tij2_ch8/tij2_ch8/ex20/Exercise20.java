package tij2_ch8.tij2_ch8.ex20;
import static tij2_ch8.tij2_ch8.tools.tools.print;

class WithFinals {   
    // Identical to "private" alone:   
    private final void f() { 
        print("WithFinals.f()"); 
    }   
    // Also automatically "final":   
    private void g() { 
        print("WithFinals.g()"); 
    } 
    WithFinals(){
        f();
        g();
    }
} 
class OverridingPrivate extends WithFinals {
    //@Override   
    private final void f() {     
        print("OverridingPrivate.f()");   
    }   
    private void g() {     
        print("OverridingPrivate.g()");   
    }
    OverridingPrivate(){
        f();
        g();
    } 
} 
 
class OverridingPrivate2 extends OverridingPrivate {   
    public final void f() {     
        print("OverridingPrivate2.f()");   
    }   
    public void g() {     
        print("OverridingPrivate2.g()");   
    } 
} 
 
public class Exercise20 {   
    public static void main(final String[] args) {
        final OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // You can upcast:
        final OverridingPrivate op = op2;
        // But you can’t call the methods:
        // ! op.f();
        // ! op.g();
        // Same here:
        final WithFinals wf = op2;
        //! wf.f();     
        //! wf.g();   
        print(op,wf);
    } 
}