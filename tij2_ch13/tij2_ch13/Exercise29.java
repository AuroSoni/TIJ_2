package tij2_ch13.tij2_ch13;

class BaseballException extends RuntimeException {

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
  public Inning() throws BaseballException {
      throw new BaseballException();
  }
  public void event() {
    // Doesn't actually have to throw anything
  }
  public abstract void atBat();
  public void walk() {} // Throws no checked exceptions
}

class StormException extends RuntimeException {

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
  public void event();
  public void rainHard();
}

/**
 * Modify all the exception types in Stormylnning.java(aka Exercise29) so that they extend RuntimeException, 
 * and show that no exception specifications or try blocks are necessary. Remove the ‘//!’ comments and show 
 * how the methods can be compiled without specifications.  
 */
public class Exercise29 extends Inning implements Storm {
  
    public Exercise29() throws RainedOut, BaseballException {}
    public Exercise29(String s) throws Foul, BaseballException {}
  
    public void walk() throws PopFoul {
    }
  
    public void event() throws RainedOut {}
  
    public void rainHard() throws RainedOut {}
    
    public void atBat() {
        throw new PopFoul();
    }
    public static void main(String[] args) {
        try {
            //Exercise29 si = new Exercise29();
            throw new PopFoul();
            //si.atBat();
        } catch(PopFoul e) {
            System.out.println("Pop foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        
        // What happens if you upcast?
        Inning i = new Exercise29();
        i.atBat();
        System.out.println("Strike");
        System.out.println("Foul");
        System.out.println("Rained out");
        System.out.println("Generic baseball exception");
        
    }
}
