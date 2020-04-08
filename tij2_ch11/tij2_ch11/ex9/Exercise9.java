package tij2_ch11.tij2_ch11.ex9;
import static custom_tools.tools.print.Print.print;

interface Smudge{
    /**
    * Smudge Face
    */
    void smudge();
}
interface Wash{
    /**
    * Wash face
    */
    void wash();
}
interface Face extends Smudge,Wash{
    /**
     * tells face status
     */
    void look(); 
}


/**
 * Create an interface with at least one method, and implement that 
 * interface by defining an inner class within a method, 
 * which returns a reference to your interface. 
 */
public class Exercise9 {
    private static boolean faceStatus=false;
    private static Face genFace(){
        class NewFace implements Face{

            @Override
            public void look() {
                if(faceStatus)
                    print("Fresh Face looking in the mirror");
                else
                    print("Weary Face looking in the mirror");
            }

            @Override
            public void wash() {
                print("Washing Face");
                faceStatus=true;
            }

            @Override
            public void smudge() {
                print("Smudging Face");
                faceStatus=false;
            }
        }
        
        NewFace face=new NewFace();
        return face;
    }
    /**
     * Repeat the previous exercise(Ex9) but define the inner class within a scope within a method.
     */
    private static void getMuddy(){
        if(faceStatus){
            class SmudgeFace implements Smudge{
                @Override
                public void smudge() {
                    print("Smudging face");
                    faceStatus=false;
                }
            }
            new SmudgeFace().smudge();
        }
        else{
            print("Face already Smudged");
        }
    }
    
    /**
    * Repeat the previous exercise(Ex9) but define the inner class within a scope within a method.
    */
    private static void getFresh(){
        if(!faceStatus){
            class WashFace implements Wash{
                @Override
                public void wash() {
                    print("Washing face");
                    faceStatus=true;
                }
            }
            new WashFace().wash();
        }
        else{
            print("Face already Washed");
        }
    }
    public static void main(String[] args){
        Face f=Exercise9.genFace();
        f.wash();
        f.look();
        f.smudge();
        f.look();
        Exercise9.getMuddy();
        f.look();
        Exercise9.getFresh();
        f.look();
        Exercise9.getMuddy();
        f.look();
    }
}