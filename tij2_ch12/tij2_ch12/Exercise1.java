package tij2_ch12.tij2_ch12;
import static custom_tools.tools.print.Print.*;

import java.util.ArrayList;

class Gerbil{
    static int counter=0;
    int gerbilNumber;
    Gerbil(){
        gerbilNumber=counter++;
    }
    void hop(){
        print("Gerbil "+gerbilNumber+" is hopping.");
    }
}

/**
 * Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor. 
 * Give it a method called hop( ) that displays which gerbil number this is, and that it’s hopping. 
 * Create an ArrayList and add Gerbil objects to the List. Now use the get( ) method to move through 
 * the List and call hop( ) for each Gerbil.
 */
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> aGerbils=new ArrayList<>();
        for(int i=0;i<10;i++){
            aGerbils.add(new Gerbil());
        }
        for (Gerbil gerbil : aGerbils) {
            gerbil.hop();
        }
    }
}