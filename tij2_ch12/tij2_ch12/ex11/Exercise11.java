package tij2_ch12.tij2_ch12.ex11;
import static custom_tools.tools.print.Print.*;
import java.util.*;

/**
 * Write a method that uses an Iterator to step through a Collection and print the toString( ) 
 * of each object in the container. Fill all the different types of Collections with objects 
 * and apply your method to each container. 
 */
public class Exercise11 implements Comparable<Exercise11>{
    private static final int NO = 10;
    private static int counter=0;
    public final int id=counter++;
    static Iterator<Exercise11> it;

    public String toString(){
        return this.getClass().getSimpleName()+" : "+id;
    }

    public static Iterator<Exercise11> initialize(Collection<Exercise11> collection){
        for(int i=0;i<NO;i++){
            collection.add(new Exercise11());
        }
        counter=0;
        return collection.iterator();
    }

    public static void show(Iterator<Exercise11> it){
        while(it.hasNext()){
            printnb(it.next()+" ");
        }
    }

    public static void main(String[] args) {
        print("ArrayList : ");
        show(initialize(new ArrayList<>()));
        print("\nLinkedList : ");
        show(initialize(new LinkedList<>()));
        print("\nHashSet : ");
        show(initialize(new HashSet<>()));
        print("\nLinkedHashSet : ");
        show(initialize(new LinkedHashSet<>()));
        print("\nTreeSet : ");
        show(initialize(new TreeSet<>()));         //Runtime Exception
        print(" ");
    }

    @Override
    public int compareTo(Exercise11 o) {
        if(o==null)throw new NullPointerException();
        int val=Integer.compare(this.id, o.id);
        return val;
    }
}