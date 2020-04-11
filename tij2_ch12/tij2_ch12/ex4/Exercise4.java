package tij2_ch12.tij2_ch12.ex4;

import static custom_tools.tools.print.Print.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class Generator{
    private static int current=0;
    static String[] avengers={"Captain America","Iron  Man","Thor","War Machine","Black Widow","Hawkeye"};
    static String next(){
        if(current>=avengers.length)
        current=0;
        return avengers[current++];
    }
    static Collection<String> generate(Collection<String> collection,int i){
        for (int j = 0; j < i; j++) {
            collection.add(next());
        }
        return collection;
    }
}

/**
 * Create a generator class that produces character names (as String objects)
 * from your favorite movie (you can use Snow White or Star Wars as a fallback) 
 * each time you call next( ), and loops around to the beginning of the character list
 * when it runs out of names. Use this generator to fill an array, an ArrayList, a LinkedList,
 * a HashSet, a LinkedHashSet, and a TreeSet, then print each container.
 */
public class Exercise4 {
    private static int i=10;
    public static void main(String[] args) {
        print(Arrays.asList(Generator.avengers));
        print(Generator.generate(new ArrayList<String>(), i));
        print(Generator.generate(new LinkedList<String>(), i));
        print(Generator.generate(new HashSet<String>(), i));
        print(Generator.generate(new LinkedHashSet<String>(), i));
        print(Generator.generate(new TreeSet<String>(), i));
    }
}