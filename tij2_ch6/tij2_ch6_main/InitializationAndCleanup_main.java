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
        
        System.out.println("Exercise 10 is similar to Exercise 11. ");
        System.out.println("Running Exercise 11 : ");
        Exercise11 obj11=obj.exercise11(10);
        obj.exercise11(11);
        obj11.toZero();
        System.gc();
        System.runFinalization();//Calling System.gc( ) and System.runFinalization( ) in sequence will probably 
                                 //but not necessarily call your finalizer (The behavior of finalize has been uncertain from one version of JDK to another.) 
        
        System.out.println("Exercise 12 issimilar to Exercise 11. ");
    }
}