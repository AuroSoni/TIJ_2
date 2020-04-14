package tij2_ch12.tij2_ch12.ex23;
import java.util.*;
import static custom_tools.print.Print.*; 

/**
 * Starting with Statistics.java, create a program that runs the test repeatedly 
 * and looks to see if any one number tends to appear more than the others in the results.
 */
public class Exercise23 {
    public static void main(String[] args) {     
        Random rand = new Random(47);     
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();     
        for(int i = 0; i < 1000000; i++) {       
            // Produce a number between 0 and 20:       
            int r = rand.nextInt(20);       
            Integer freq = m.get(r);       
            m.put(r, freq == null ? 1 : freq + 1);
        }
        print("Map : ",m);
        List<Integer> list=new LinkedList<>();
        list.addAll(m.values());
        Collections.sort(list);
        LinkedHashMap<Integer,Integer> t=new LinkedHashMap<>();
        for (Integer integer : list) {
            for(Integer s : m.keySet()){
                if(m.get(s)==integer){
                    t.put(s, integer);
                    break;
                }
            }
        }
        print("Sorted Map : ",t);
    }
}