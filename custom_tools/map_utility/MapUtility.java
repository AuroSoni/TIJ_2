package custom_tools.map_utility;
import java.util.*;
import static custom_tools.print.Print.*;

public abstract class MapUtility<T, V> {
    
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
    public Collection<Integer> zeroTs(int i){
        Collection<Integer> zeroList=new LinkedList<>();
        for (int j = 0; j < i; j++) {
            zeroList.add(0);   //To be modified
        }
        return zeroList;
    }
    // public Collection<V> zeroTs(int i){
    //     Collection<V> zeroList=new LinkedList<>();
    //     for (int j = 0; j < i; j++) {
    //         zeroList.add(null);   //To be modified
    //     }
    //     return zeroList;
    // }
    public LinkedHashMap<T, V> fill(Collection<T> t, Collection<V> v,Type z) {
        if(z==Type.ALLDEFAULT){
            //Do sth
        }
        LinkedHashMap<T,V> map =new LinkedHashMap<>();
        if(t.size()<v.size()){
            print("Incompatible lists supplied");
            return null;
        }
        Iterator<T> li_t=t.iterator();
        Iterator<V> li_v=v.iterator();
        while(li_t.hasNext()){
            if(li_v.hasNext()){
                map.put(li_t.next(), li_v.next());
            }
            else{
                map.put(li_t.next(), null);
            }
        }
        return map;
    }
    public LinkedHashMap<T, V> fill(Collection<T> t, Collection<V> v){
        return this.fill(t, v,Type.NORMAL);
    }
}