package tij2_ch3;

/**EverythingIsAnObject
 * This class is based on exercises in TIJ2 chapter 3
 */
public class EverythingIsAnObject{

    /**
    * Create a class containing an int and a char 
    * that are not initialized, and print their values 
    * to verify that Java performs default initialization. 
    * <hr>
    */ 
    public class Exercise1{
        public int i;
        public char c;
    }

    /**
     * Contructor for the inner class {@link Exercise1}
     * @return A default initialised object for {@link Exercise1}
     * @param null accepts no parameters
     */
    public Exercise1 c1(){
        return new Exercise1();
    }

}