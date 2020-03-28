package tij2_ch4;

import java.util.Random;

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

    /**
     * Create a class called Dog containing two Strings: name and says. 
     * In main( ), create two dog objects with names 'spot' (who says, 'Ruff!'') 
     * and 'scruffy' (who says, 'Wurf!''). Then display their names and what they say. 
     * For Exercises 5 and 6.
     */
    public class Dog{
        public String name;
        public String says;
        Dog(String n,String s){
            name=n;
            says=s;
        }
    }
    
    /**
     * public accessible contructor for {@link Dog}
     * @param n String for name
     * @param s String for says
     * @return a {@link Dog} Object with {@link Dog#name} and {@link Dog#says} initialised
     */
    public Dog build_dog(String n,String s){
        return new Dog(n,s);
    }

    /**
     * Produces a random coin flip. Solution for Exercise 7.
     * @return true if heads false if tails.
     */
    public boolean coinFlip(){
        Random r=new Random();
        return r.nextBoolean();
    }
}