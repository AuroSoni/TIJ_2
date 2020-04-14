package tij2_ch12.tij2_ch12.ex24;
import static custom_tools.print.Print.*;
import java.util.Arrays;
import java.util.LinkedHashMap;

import custom_tools.map_utility.MapUtility;

class Sample{
    public static int counter=1;
    private final int id=counter++;
    public String toString(){
        return "Sample"+id;
    }
}
/**
 * Fill a LinkedHashMap with String keys and objects of your choice.
 * Now extract the pairs, sort them based on the keys, and reinsert them into the Map.
 */
public class Exercise24 {
    public static void main(String[] args) {
        MapUtility<String,Sample> mu=new MapUtility<String,Sample>() {
        };
        LinkedHashMap<String,Sample> map=mu.fill(Arrays.asList("Auro","Aatmaj","Mummy","Papa"), Arrays.asList(new Sample(),new Sample(),new Sample(),new Sample()));
        print(map);
        map=mu.sortByKeyString(map);
        print(map);
    }   
}