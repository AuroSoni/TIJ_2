package tij2_ch11.tij2_ch11.ex11;
import static custom_tools.tools.print.Print.print;

import tij2_ch11.tij2_ch11.ex11.Outer.VisibleInner;
import tij2_ch11.tij2_ch11.ex6.Interface;

class Outer{
    private class Inner implements Interface{
        @Override
        public void name() {
            print("Inner.name()");
        }
    }
    class VisibleInner implements Interface{
        @Override
        public void name(){
            print("VisibleInner.name()");
        }
    }
    Interface genInterface(){
        return new Inner();
    }
    Interface genVisInterface(){
        return new VisibleInner();
    }
}
/**
 * Create a private inner class that implements a public interface. 
 * Write a method that returns a reference to an instance of the private inner class, 
 * upcast to the interface. Show that the inner class is completely hidden by trying to downcast to it. 
 */
public class Exercise11 {
    public static void main(String[] args) {
        Outer o=new Outer();
        Interface invisible=o.genInterface();
        Interface visible=o.genVisInterface();
        invisible.name();
        visible.name();
        VisibleInner vi=o.new VisibleInner();
        vi.name();
        //! Inner in=i.new Inner();
        //! i.name();
    }
}