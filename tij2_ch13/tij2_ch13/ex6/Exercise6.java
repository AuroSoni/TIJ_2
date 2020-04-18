package tij2_ch13.tij2_ch13.ex6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;
import static custom_tools.print.Print.*;

class Exception1 extends Exception{

	private static final long serialVersionUID = 1L;
	Exception1(){
        super();
    }
    Exception1(String msg){
        super(msg);
    }
    public String getMessage() {
        Logger logger=Logger.getLogger("Exception1");
        StringWriter sWriter=new StringWriter();
        logger.severe(sWriter.toString());
        return "Logging done "+super.getMessage();
    }
}

class Exception2 extends Exception{
    
    private static final long serialVersionUID = 1L;
    static Logger logger=Logger.getLogger("Exception2");
    Exception2(){
        StringWriter sWriter=new StringWriter();
        printStackTrace(new PrintWriter(sWriter));
        logger.severe(sWriter.toString());
    }
}

/**
 * Create two exception classes, each of which performs its own logging automatically. Demonstrate that these work. 
 */
public class Exercise6 {
    public static void main(String[] args) {
        try {
            throw new Exception1();
        } 
        catch (Exception1 e) {
            print("Caught Ex1");
            e.printStackTrace();
        }
        try {
            throw new Exception2();
        } 
        catch (Exception2 e) {
            print("Caught Ex2");
            System.err.println(e);
        }
    }
}