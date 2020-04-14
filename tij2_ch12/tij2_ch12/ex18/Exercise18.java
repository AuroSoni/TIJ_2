package tij2_ch12.tij2_ch12.ex18;
import static custom_tools.print.Print.*;
import java.util.*;

abstract class MapUtility<T, V> {
    
    public List<Integer> intList(int size){
        LinkedList<Integer> li=new LinkedList<>();
        for(int i=0;i<size;i++){
            li.add(i);
        }
        return li;
    }

    public List<Character> charList(int size){
        int ref=(int)'a';
        if(size>52){
            print("charList: Size out of bounds");
            return null;
        }
        LinkedList<Character> li=new LinkedList<>();
        for (int i = 0; i < size; i++) {
            li.add((char)ref);
            ref++;
        }
        return li;
    }
    public HashMap<T,V> fill(List<T> t,List<V> v){
        HashMap<T,V> map =new HashMap<>();
        if(t.size()!=v.size()){
            print("Incompatible lists supplied");
            return null;
        }
        ListIterator<T> li_t=t.listIterator();
        ListIterator<V> li_v=v.listIterator();
        while(li_t.hasNext()){
            map.put(li_t.next(), li_v.next());
        }
        return map;
    }

    // public LinkedHashMap<T,V> sortByKey(HashMap<T,V> map){
    //     LinkedHashMap<T,V> returnMap=new LinkedHashMap<>();
    //     Set<T> list=map.keySet();
    //     Iterator<T> it=list.iterator();
    //     while(true){
    //         try{
    //             T v=it.next();
    //             //v<it.next();
    //         }
    //         catch(Exception e){
    //             break;
    //         }
    //     }
    //     return returnMap;
    // }
}

/**
 * Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. 
 * Extract the pairs, sort by key, and place the result into a LinkedHashMap. 
 * Show that the insertion order is maintained.
 */
public class Exercise18 {
    public static void main(String[] args) {
        MapUtility<Character,Integer> mUtility=new MapUtility<Character,Integer>() {
        };
        HashMap<Character,Integer> mHashMap=mUtility.fill(mUtility.charList(30), mUtility.intList(30));
        print(mHashMap);
    }
}