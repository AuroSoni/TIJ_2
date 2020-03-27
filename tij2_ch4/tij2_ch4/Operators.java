package tij2_ch4;

/**
 * This class is a solution to all the exercises in chapter 4 <b>Operators</b> in TIJ2.
 */
public class Operators{

    /**
     * Write a program that uses the short and normal form of print statement.
     */
    public static class Exercise1{

        /**
         * Calls the java.lang.System.out.println
         * @param s accepts string value
         */
        public static void print(String s){
            System.out.println(s);
        }
    }

    /**
     * Used to demonstrate aliasing
     */
    public class Exercise2{
        public float f=0;
    }

    /**
     * Constructor for {@link Exercise2} class.
     * @param f a floating point number
     * @return a reference to {@link Exercise2} object
     */
    public Exercise2 exercise2(float f){
        Exercise2 ex=new Exercise2();
        ex.f=f;
        return ex;
    }
}