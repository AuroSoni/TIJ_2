package tij2_ch3.tij2_ch3;

/**EverythingIsAnObject
 * This class is based on exercises in TIJ2 chapter 3
 */
public class EverythingIsAnObject{

    /**
    * Create a class containing an int and a char 
    * that are not initialized, and print their values 
    * to verify that Java performs default initialization. 
    */ 
    public class Exercise1{
        public int i;
        public char c;
    }

    /**
     * Contructor for the inner class {@link Exercise1}
     * @return A default initialised object for {@link Exercise1}
     */
    public Exercise1 c1(){
        return new Exercise1();
    }

    /**
     * Creates a "Hello, World!"
     * program that simply displays the statement
     */
    public static class Exercise2{

        /**
         * Method to print "Hello, World!".
         */
        public static void sayHello(){
            System.out.println("Hello, World!");
        }
    }
}