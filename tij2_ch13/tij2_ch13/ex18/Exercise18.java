package tij2_ch13.tij2_ch13.ex18;

class VeryImportantException extends Exception {   
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String toString() {
        return "A very important exception!";   
    } 
} 
 
class HoHumException extends Exception {   
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String toString() {
        return "A trivial exception";   
    } 
} 

class InsignificantException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public String toString(){
        return "An insignificant exception";
    }
}
 
/**
 * Add a second level of exception loss to LostMessage.java so that the HoHumException 
 * is itself replaced by a third exception.  
 */
public class Exercise18 {   
    void f() throws VeryImportantException {     
        throw new VeryImportantException();   
    }   
    void dispose() throws HoHumException {     
        throw new HoHumException();   
    }   
    void cleanup() throws InsignificantException{
        throw new InsignificantException();
    }
    public static void main(String[] args) {     
        try {       
            Exercise18 lm = new Exercise18();       
            try {      
                try {
                    lm.f();
                } 
                finally{
                    lm.cleanup();
                }          
            } finally {         
                lm.dispose();       
            }     
        } catch(Exception e) {       
            System.out.println(e);     
        }   
    } 
}