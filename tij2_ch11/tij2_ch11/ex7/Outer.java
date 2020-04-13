package tij2_ch11.tij2_ch11.ex7;
import static custom_tools.print.Print.print;

public class Outer{
    private int field;
    private void say(){
        print("Outer.say()");
    }
    class Inner{
        private int ref=0;
        private Inner(){
            print("Creating Inner Object");
        }
        private void modify(int i){
            field=i;
            print("Inner.modify(): "+field,"Calling say().");
            say();
        }
    }
    protected void call(int j){
        //! ref++;
        print("Outer.call()");
        Inner i=new Inner();
        i.modify(j);
        print("ref: "+i.ref++);     //Outer class has access to all private fields and methods of Inner class.
    }
}