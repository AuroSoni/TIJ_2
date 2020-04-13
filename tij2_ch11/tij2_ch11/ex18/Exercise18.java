package tij2_ch11.tij2_ch11.ex18;

import static custom_tools.print.Print.print;

class Outer{
    private static int a=0;
    static class Nested{
        void setA(int i){
            a=i;
        }
        int getA(){
            return a;
        }
        public String toString(){
            return "Outer.Nested";
        }
    }
}

/**
 * Create a class containing a nested class. 
 * In main( ), create an instance of the nested class.
 */
public class Exercise18 {
    public static void main(String[] args) {
        Outer.Nested n=new Outer.Nested();
        print(n.toString());
    }
}