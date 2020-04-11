package tij2_ch12.tij2_ch12.ex8;
import tij2_ch12.tij2_ch12.ex1.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Modify Exercise l so it uses an Iterator to move through the List while calling hop( ). 
 */
public class Exercise8 {
    public static List<Gerbil> aGerbils= new ArrayList<>();
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            aGerbils.add(new Gerbil());
        }
        Iterator<Gerbil> it= aGerbils.iterator();
        while(it.hasNext()){
            it.next().hop();
        }
    }
}