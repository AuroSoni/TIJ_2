package tij2_ch6_main;
import tij2_ch6.InitializationAndCleanup;
import tij2_ch6.InitializationAndCleanup.Exercise11;

/**
 * This class employs the main() method to execute the code in {@link tij2_ch6.InitializationAndCleanup}.
 */
public class InitializationAndCleanup_main{

    /**
     * The main method to execute the classes in {@link tij2_ch6.InitializationAndCleanup}.
     * @param args none used
     */
    public static void main(String[] args) {
        InitializationAndCleanup obj = new InitializationAndCleanup();
        
        Exercise11 obj11=obj.exercise11(10);
        obj.exercise11(11);
        obj11.toZero();
        System.gc();
    }
}