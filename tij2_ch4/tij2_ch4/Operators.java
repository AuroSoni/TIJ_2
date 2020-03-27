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

    /**
     * This method represents aliasing during method calls. 
     * The field f of {@link Exercise2} is set to f.
     * @param ex2 An {@link Exercise2} Object.
     * @param f a floating point number
     * @see Exercise2
     */
    public void exercise3(Exercise2 ex2,float f){
        ex2.f=f;
    }

    /**
     * 
     * @param dist distance travelled
     * @param time time taken
     * @return returns speed
     */
    public double exercise4(double dist,double time){
        return dist/time;
    }
}