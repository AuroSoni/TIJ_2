package tij2_ch11.tij2_ch11.ex26;
import static custom_tools.tools.print.Print.*;

class WithInner{
    private int a;
    class Inner{
        private int b=0;
        Inner(int b){
            this.b+=b;
            print("b : "+this.b);
        }
        void modify(int a){
            WithInner.this.a=a;
        }
        int get(){
            return a;
        }
    }
}
/**
 * Create a class with an inner class that has a non-default constructor (one that takes arguments). 
 * Create a second class with an inner class that inherits from the first inner class. 
 */
public class Exercise26 extends WithInner.Inner{

    Exercise26(WithInner withInner, int b) {
        withInner.super(b);
        print("Creating Exercise()");
    }
    public static void main(String[] args) {
        WithInner w=new WithInner();
        Exercise26 ex26=new Exercise26(w, 10);
        ex26.modify(3);
        print("a : "+ex26.get());
    }

}