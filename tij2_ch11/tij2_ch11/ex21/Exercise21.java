package tij2_ch11.tij2_ch11.ex21;
import static custom_tools.print.Print.print;

interface Inter{
    class Nested{
        static void method(Inter f){
            print("f()");
            f.say();
        }
    }
    void say();
}

/**
 * Create an interface that contains a nested class that has a static method 
 * that calls the methods of your interface and displays the results. 
 * Implement your interface and pass an instance of your implementation to the method.
 */
public class Exercise21 implements Inter{

    @Override
    public void say() {
        print("say()");
    }
    public static void main(String[] args) {
        Exercise21 ex21 = new Exercise21();
        //Nested n= new Nested();
        Nested.method(ex21);
    }

}