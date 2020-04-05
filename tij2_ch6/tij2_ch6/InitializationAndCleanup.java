package tij2_ch6.tij2_ch6;

/**
 * This class is a solution class for all the problems in chapter 6
 * Initialization and Cleanup of TIJ2.
 */
public class InitializationAndCleanup{

    /**
     * Create a class with a finalize( ) method that prints a message. 
     * In main( ), create an object of your class. There is no default constructor for this class.
     */
    public class Exercise11{
        int i=10;

        /**
         * Constructor for class {@link Exercise11}
         * @param x specifies the value of {@link Exercise11#i}.
         */
        public Exercise11(int x){
            i=x;
        }

        /**
         * To check the state of object esp. {@link Exercise11#i} before cleanup.
         */
        protected void finalize(){
            if(i!=0)System.out.println("i!=0 "+i);
        }

        /**
         * Changes the field {@link Exercise11#i} to zero.
         */
        public void toZero(){
            System.out.println("Object brought to the right state : "+i);
            i=0;
        }
    }

    /**
     * Constructor for class {@link Exercise11}
     * @param x specifies the value of {@link Exercise11#i}
     * @return a reference to a newly  created Exercise11 object.
     */
    public Exercise11 exercise11(int x){
        return new Exercise11(x);
    }
    
}