package tij2_ch12.tij2_ch12.ex14;
import static custom_tools.tools.print.Print.*;
import java.util.*;

/**
 * Create an empty LinkedList<Integer>. 
 * Using a Listlterator, add Integers to the List by always inserting them in the middle of the List. 
 */
public class Exercise14 {
    static List<Integer> list;
    static ListIterator<Integer> listIterator;
    public static final int MAX=100;
    public static void add(List<Integer> li,int i){
        int index= (int) Math.round(li.size() / 2.0);
        listIterator=li.listIterator(index);
        listIterator.add(i);
    }
    public static void main(String[] args) {
        Random rand=new Random();
        list=new LinkedList<>();
        List<Integer> sample =new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            sample.add(rand.nextInt(MAX));
        }
        printList(sample);
        list.clear();
        for (int i = 0; i < 10; i++) {
            Exercise14.add(list,sample.get(i));
            printList(list);
        }
        printList(list);
    }

    public static void printList(List<Integer> li){
        ListIterator<Integer> iterator=li.listIterator();
        while(iterator.hasNext()){
            printnb(iterator.next()+" ");
        }
        print(" ");
    }
}