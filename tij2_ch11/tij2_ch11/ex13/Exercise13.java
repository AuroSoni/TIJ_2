package tij2_ch11.tij2_ch11.ex13;
import tij2_ch11.tij2_ch11.ex9.Face;
import static custom_tools.print.Print.print;

/**
 * Repeat Exercise 9 using an anonymous inner class.  
 */
public class Exercise13 {
    public static boolean faceStatus=false;
    public static Face genFace(){
        return new Face(){
        
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
        };
    }

    public static void main(String[] args) {
        Face f= Exercise13.genFace();
        f.look();
        f.wash();
        f.look();
        f.smudge();
        f.look();
    }
}