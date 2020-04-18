package tij2_ch13.tij2_ch13.ex19;

import static custom_tools.print.Print.*;

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
 * Repair the problem in LostMessage.java by guarding the call in the finally clause. 
 */
public class Exercise19 {
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
            Exercise19 lm = new Exercise19();       
            try {      
                try {
                    lm.f();
                } 
                finally{
                    try{
                        lm.cleanup();
                    }
                    catch(InsignificantException e){
                        print(e);
                    }
                }          
            } finally {         
                try {
                    lm.dispose(); 
                } catch (HoHumException e) {
                    print(e);
                }      
            }     
        } catch(Exception e) {       
            print(e);     
        }   
    } 
}