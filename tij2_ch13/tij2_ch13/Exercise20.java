package tij2_ch13.tij2_ch13;

class BaseballException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}

class UmpireArgument extends BaseballException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
}

class Foul extends BaseballException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}

class Strike extends BaseballException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}
 
abstract class Inning {   
    public Inning() throws BaseballException {}   
    public void event() throws BaseballException {     
        // Doesn’t actually have to throw anything   
    }   
    public abstract void atBat() throws Strike, Foul, UmpireArgument;   
    public void walk() {} // Throws no checked exceptions 
} 
 
class StormException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}

class RainedOut extends StormException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}

class PopFoul extends Foul {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}
 
interface Storm {   
    public void event() throws RainedOut;   
    public void rainHard() throws RainedOut; 
} 
 
/**
 * Modify StormyInning.java by adding an UmpireArgument exception type and methods that throw this exception. Test the modified hierarchy. 
 */
public class Exercise20 extends Inning implements Storm { 

    // OK to add new exceptions for constructors, but you must deal with the base constructor exceptions:   
    public Exercise20() throws RainedOut, BaseballException {}   

    public Exercise20(String s) throws Foul, BaseballException {}   

    // Regular methods must conform to base class: 
    //! void walk() throws PopFoul {} //Compile error   

    // Interface CANNOT add exceptions to existing methods from the base class: 
    //! public void event() throws RainedOut {}  

    // If the method doesn’t already exist in the base class, the exception is OK:   
    public void rainHard() throws RainedOut {}  

    // You can choose to not throw any exceptions, even if the base version does:  
    @Override 
    public void event(){}   //MACHAXXXXXXXXXXXXX CASE

    // Overridden methods can throw inherited exceptions:   
    public void atBat() throws PopFoul,UmpireArgument {
        throw new UmpireArgument();
    }   
    public static void main(String[] args) {     
        try {       
            Exercise20 si = new Exercise20();       
            si.atBat();     
        } catch(PopFoul e) {       
            System.out.println("Pop foul");    
        } catch(RainedOut e) {       
            System.out.println("Rained out");     
        } catch(BaseballException e) {       
            System.out.println("Generic baseball exception");     
        }     
        // Strike not thrown in derived version.     
        try {       
            // What happens if you upcast?       
            Inning i = new Exercise20();       
            i.atBat();       
            // You must catch the exceptions from the base-class version of the method:     
        } catch(Strike e) {       
            System.out.println("Strike");     
        } catch(Foul e) {       
            System.out.println("Foul");     
        } catch(RainedOut e) {       
            System.out.println("Rained out");     
        } catch(BaseballException e) {    
            System.out.println(e.getClass().getSimpleName());   
            System.out.println("Generic baseball exception");     
        }   
    } 
}
