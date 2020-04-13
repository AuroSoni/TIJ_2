package tij2_ch11.tij2_ch11.ex6;
import static custom_tools.print.Print.print;

public class OuterClass {
    OuterClass(){
        print("OuterClass()");
    }

    protected class InnerClass implements Interface{
        @Override
        public void name(){
            print("InnerClass.name()");
        }
    }

    public String toString(){
        return "OuterClass";
    }
}