package tij2_ch13.tij2_ch13;

import static custom_tools.print.Print.*;

class Annoyance extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}
class Sneeze extends Annoyance {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}

/**
 * Modify Human.java(aka Exercise30) so that the exceptions inherit from RuntimeException. 
 * Modify main( ) so that the technique in TurnOffChecking.java is used to handle the different types of exceptions. 
 */
public class Exercise30 {
    public static void main(String[] args) {
        // Catch the exact type:
        try {
            throw new RuntimeException(new Sneeze());
        } catch(RuntimeException e){
            try {
                throw e.getCause();
            }catch(Sneeze s) {
                print("Caught Sneeze "+s);
            } catch(Annoyance a) {
                print("Caught Annoyance "+a);
            } catch (Throwable e1) {
                print("Caught Throwable "+e1);
            }
        }
            
        try {
            throw new RuntimeException(new Sneeze());
        } catch (Exception e) {
            // Catch the base type:
            try {
                throw e.getCause();
            } catch(Annoyance a) {
                print("Caught Annoyance "+a);
            } catch(Throwable e1){
                print("Caught Throwable "+e1);
            }
        }

        try {
            throw new RuntimeException(new Sneeze());
        } catch (Exception e) {
            // Catch the base type:
            try {
                throw e.getCause();
            } catch(Throwable e1){
                print("Caught Throwable "+e1);
            }
        }
    }
}
