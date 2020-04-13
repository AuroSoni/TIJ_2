package tij2_ch11.tij2_ch11.ex19;
import static custom_tools.print.Print.print;

class DoubleInner{
    private int a;
    class Inner{
        private int b;
        class Inner2{
            void set(){
                a=1;
                b=2;
            }
            void get(){
                print(a,b);
            }
        }
    }
}

class DoubleNested{
    private static int c;
    static class Nested{
        private static int d;
        static class Nested2{
            void get(){
                print(c,d);
            }
            void set(){
                c=3;
                d=4;
            }
        }
    }
}

/**
 * Create a class containing an inner class that itself contains an inner class. 
 * Repeat this using nested classes. Note the names of the .class files produced by the compiler.
 */
public class Exercise19 {
    public static void main(String[] args) {
    DoubleInner d = new DoubleInner();
    DoubleInner.Inner i=d.new Inner();
    DoubleInner.Inner.Inner2 i2= i.new Inner2();
    i2.set();
    i2.get();

    DoubleNested.Nested.Nested2 n= new DoubleNested.Nested.Nested2();
    n.set();
    n.get();
    } 
}