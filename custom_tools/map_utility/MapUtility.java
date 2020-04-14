package custom_tools.map_utility;
import java.util.*;
import static custom_tools.print.Print.*;

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
}