package tij2_ch12.tij2_ch12.ex1;
import static custom_tools.print.Print.*;

public class Gerbil{
    static int counter=0;
    int gerbilNumber;
    public Gerbil(){
        gerbilNumber=counter++;
    }
    public void hop(){
        print("Gerbil "+gerbilNumber+" is hopping.");
    }
}
