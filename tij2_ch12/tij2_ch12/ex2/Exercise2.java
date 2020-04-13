package tij2_ch12.tij2_ch12.ex2;
import static custom_tools.print.Print.*;
import java.util.*;

/**
 * Modify SimpleCollection.java(aka Exercise2) to use a Set for c. 
 */
public class Exercise2 {
    public static void main(String[] args) {
        Collection<Integer> set=new HashSet<>();
        for(int i=0;i<10;i++){
            print("Add "+i+" : "+set.add(i));
        }
        print("Add "+9+" : "+set.add(9));
        for (Integer integer : set) {
            printnb(integer," ");
        }
    }
}