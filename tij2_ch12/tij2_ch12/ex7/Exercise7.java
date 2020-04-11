package tij2_ch12.tij2_ch12.ex7;
import static custom_tools.tools.print.Print.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sample{
    private static int counter=0;
    public final int id=counter++;
    public String toString(){
        return String.valueOf(id);
    }
}

/**
 * Create a class, then make an initialized array of objects of your class. 
 * Fill a List from your array. Create a subset of your List by using subList( ), 
 * then remove this subset from your List.  
 */
public class Exercise7 {
    public static void main(String[] args) {
        Sample[] samples = {new Sample(),new Sample(),new Sample(),new Sample(),new Sample(),new Sample()};
        printnb("1 : ",Arrays.asList(samples));
        List<Sample> list = new ArrayList<>(Arrays.asList(samples));
        print("\n2 : "+list);
        List<Sample> sub = list.subList(1, 4);
        print("3 : "+sub);
        list.removeAll(sub);
        print("4 : "+list);
    }
}