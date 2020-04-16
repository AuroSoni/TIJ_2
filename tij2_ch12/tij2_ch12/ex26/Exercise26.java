package tij2_ch12.tij2_ch12.ex26;
import java.util.*;

import tij2_ch12.tij2_ch12.ex25.Exercise25;

import static custom_tools.print.Print.*;

/**
 * Take the resulting Map from the previous exercise and re-create the order of the words 
 * as they appeared in the original file. 
 */
public class Exercise26 {
    static HashMap<String,ArrayList<Integer>> map;
    static LinkedList<String> linkedList=new LinkedList<>();
    static boolean flag;
    Exercise26(){
        Exercise25.instantiate();
        map=Exercise25.map;
    }
    public int assign_word_limit(HashMap<String,ArrayList<Integer>> m){
        int i=0;
        Iterator<String> it=map.keySet().iterator();
        while(it.hasNext()){
            i+=m.get(it.next()).size();
        }
        return i;
    }
    public static boolean find(ArrayList<Integer> aList,int i){
        boolean flag=false;
        for (Integer integer : aList) {
            if(integer==i){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Exercise26 ex26=new Exercise26();
        long word_limit = ex26.assign_word_limit(map);
        print(word_limit);
        for(int i=0;i<word_limit;i++){
            for (String string : map.keySet()) {
                if(find(map.get(string),i)){
                    linkedList.add(string);
                    break;
                }
            }
        }
        print(linkedList);
    }
}