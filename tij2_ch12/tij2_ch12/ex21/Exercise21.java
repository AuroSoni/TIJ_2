package tij2_ch12.tij2_ch12.ex21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import static custom_tools.print.Print.*;
import custom_tools.map_utility.MapUtility;
import custom_tools.myio.TextFile;

/**
 * Using a Map<String,Integer>, follow the form of UniqueWords.java to create a program that counts 
 * the occurrence of words in a file. Sort the results using Collections.sort( ) with a second argument
 * of String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the result. 
 */
public class Exercise21 {
    public static void main(String[] args) {
        MapUtility<String,Integer> mu=new MapUtility<String,Integer>() {
        };
        List<String> food=new ArrayList<>(new TextFile("C:/Users/aurok/OneDrive/Documents/Consider the discrete time description of a multidimensional System.docx","\\W+"));
        Collections.sort(food,String.CASE_INSENSITIVE_ORDER);
        LinkedHashMap<String,Integer> map=mu.fill(food,mu.zeroTs(food.size()));
        Iterator<String> it=food.iterator();
        while(it.hasNext()){
            String word=it.next();
            int i= map.get(word);
            map.put(word, ++i);
        }
        print(map);
    }
}