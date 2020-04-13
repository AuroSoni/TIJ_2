package tij2_ch12.tij2_ch12.ex17;
import static custom_tools.print.Print.*;
import java.util.HashMap;
import java.util.Iterator;

import tij2_ch12.tij2_ch12.ex1.Gerbil;

/**
 * Take the Gerbil class in Exercise 1 and put it into a Map instead, associating each 
 * Gerbil’s name (e.g. "Fuzzy" or "Spot") as a String (the key) for each Gerbil (the value) 
 * you put in the table. Get an Iterator for the keySet( ) and use it to move through the Map, 
 * looking up the Gerbil for each key and printing out the key and telling the Gerbil to hop( ).  
 */
public class Exercise17 {
    public static void main(String[] args) {
        HashMap<String,Gerbil> map = new HashMap<>();
        map.put("A", new Gerbil());
        map.put("B", new Gerbil());
        map.put("C", new Gerbil());
        map.put("D", new Gerbil());

        Iterator<String> it =map.keySet().iterator();
        while(it.hasNext()){
            String s=it.next();
            print(s+" : ");
            map.get(s).hop();
        }
    }
}