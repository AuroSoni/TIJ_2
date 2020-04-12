package tij2_ch12.tij2_ch12.ex12;

import static custom_tools.tools.print.Print.*;

import java.util.*;

class ListCreator{
    private static final int MAX=100;

    public static List<Integer> genList(List<Integer> li,int j,Random rand){
        if(!li.isEmpty())li.clear();
        for (int i = 0; i < j; i++) {
            li.add(rand.nextInt(MAX));
        }
        return li;
    }

    public static void printList(List<Integer> li){
        ListIterator<Integer> it=li.listIterator();
        print("Forward : ");
        while(it.hasNext()){
            printnb(it.next()+"  ");
        }
        print("\nBackward : ");
        while(it.hasPrevious()){
            printnb(it.previous()+"  ");
        }
        print(" ");
    }
}

/**
 * Create and populate a List<Integer>. Create a second List<Integer> of the same size as the first, 
 * and use ListIterators to read elements from the first List and insert them into the second in reverse order. 
 * (You may want to explore a number of different ways to solve this problem.
 */
public class Exercise12 {
    public static final int NO=10;
    public static void main(String[] args) {
        Random rand =new Random();
        List<Integer> myList1= ListCreator.genList(new ArrayList<>(), NO, rand);
        List<Integer> myList2= ListCreator.genList(new ArrayList<>(), NO, rand);
        print("My List 1 : ");
        ListCreator.printList(myList1);
        print("My List 2 : ");
        ListCreator.printList(myList2);

        ListIterator<Integer> li1=myList1.listIterator(0);
        ListIterator<Integer> li2=myList2.listIterator(NO);
        while(li1.hasNext()){
            li2.previous();
            int i=li1.next();
            li2.set(i);
        }
        print("My List 1 : ");
        ListCreator.printList(myList1);
        print("My List 2 : ");
        ListCreator.printList(myList2);
    }
}