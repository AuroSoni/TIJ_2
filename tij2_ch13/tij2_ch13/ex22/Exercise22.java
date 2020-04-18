package tij2_ch13.tij2_ch13.ex22;

import tij2_ch13.tij2_ch13.Naughty;
import static custom_tools.print.Print.*;

import java.util.ArrayList;

class WrongDispose extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public WrongDispose(){
        super();
    }
    public WrongDispose(String string){
        super(string);
    }
}

class FailingDispose extends WrongDispose{

    public FailingDispose(){
        super();
    }
    public FailingDispose(String string) {
        super(string);
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;

}

class Dispose{
    static int counter=0;
    private final int id;
    Dispose(){
        id=counter++;
    }
    Dispose(int i) throws WrongDispose {
        print("Creating Dispose "+i);
        if (i>=counter) {
            id=i;
            counter=i;
        } else {
            id=-1;
            throw new WrongDispose();
        }
    }
    public void dispose(){
        print("Disposing "+this);
    }

    int getId(){
        return id;
    }
    public String toString(){
        return "["+id+"]";
    }
}

class FailingConstructor{
    public int id;
    ArrayList<Dispose> list=new ArrayList<>();
    FailingConstructor(int id) throws Naughty{
        print("Creating Failing Constructor "+id);
        if(id>10)
        throw new Naughty("Invalid id");
        this.id=id;
        try {
            list.add(new Dispose(id));
            try{
                Dispose disp=new Dispose(id-1);
                list.add(disp);
                disp.dispose();
            }
            catch(WrongDispose e){
                print(e.getClass().getSimpleName()+" "+(id-1));
            }
            finally{
                for (Dispose dispose : list) {
                    if(dispose.getId()==id)
                    dispose.dispose();
                }
            }
        } catch (WrongDispose e) {
            print(e.getClass().getSimpleName()+" "+id);
        }
    }

    public void dispose() throws FailingDispose{
        if(list.size()<2){
            throw new FailingDispose("List " +list.size()+" is wrongly created");
        }
        for (Dispose dispose : list) {
            dispose.dispose();
            id=0;
            print("Disposing "+this.toString());
        }
    }

    public String toString(){
        return this.getClass().getSimpleName()+" "+id;
    }
}
/**
 * Create a class called FailingConstructor with a constructor that might fail 
 * partway through the construction process and throw an exception. 
 * In main( ), write code that properly guards against this failure. 
 *
 * (Ex23)Add a class with a dispose( ) method to the previous exercise. 
 * Modify FailingConstructor so that the constructor creates one of these 
 * disposable objects as a member object, after which the constructor might 
 * throw an exception, after which it creates a second disposable member object. 
 * Write code to properly guard against failure, and in main( ) verify that all possible 
 * failure situations are covered. 
 * 
 * (Ex24)Add a dispose( ) method to the FailingConstructor class and write code to properly use this class. 
 */
public class Exercise22 {
    public static void main(String[] args) {
        int i=11;
        while(true){
            try{
                FailingConstructor fc=new FailingConstructor(i--);
                try{
                    print(fc.toString()+" created");
                    break;
                }
                finally{
                    try {
                        fc.dispose();
                    } catch (FailingDispose e) {
                        print(e.getMessage());
                        for (Dispose dispose : fc.list) {
                            dispose.dispose();
                        }
                    }
                }
            }
            catch(Naughty n){
                print(n.getMessage()+" "+(i+1));
            }
        }
    }
}