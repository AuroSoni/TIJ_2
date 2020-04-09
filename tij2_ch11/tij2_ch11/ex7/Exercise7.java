package tij2_ch11.tij2_ch11.ex7;

/**
 * Create a class with a private field and a private method. 
 * Create an inner class with a method that modifies the outer-class field and calls the outer-class method. 
 * In a second outer-class method, create an object of the inner class and call its method, 
 * then show the effect on the outer-class object. 
 */
public class Exercise7 {
    public static void main(String[] args) {
        Outer o= new Outer();
        o.call(5);
    }
}