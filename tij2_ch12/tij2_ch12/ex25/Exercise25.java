package tij2_ch12.tij2_ch12.ex25;
import static custom_tools.print.Print.*;
import java.util.*;

import custom_tools.map_utility.MapUtility;
import custom_tools.myio.TextFile;

/**
 * Create a Map<String,ArrayList<Integer>>. Use net.mindview.TextFile to open a text file and 
 * read it in a word at a time (use "\\W+" as the second argument to the TextFile constructor). 
 * Count the words as you read them in, and for each word in the file, record in the ArrayList<Integer> 
 * the word count associated with that word—this is, in effect, the location in the file where that word was found. 
 */
public class Exercise25 {
    static int word_count=0;
    public static void main(String[] args) {
        MapUtility<String,ArrayList<Integer>>mu=new MapUtility<String,ArrayList<Integer>>() {
        };
        LinkedList<String> wordList=new LinkedList<>();
        wordList.addAll(new TextFile("C:/Users/aurok/OneDrive/Documents/Consider the discrete time description of a multidimensional System.docx","\\W+"));
        HashMap<String,ArrayList<Integer>>map=mu.fill(wordList, new ArrayList<>());
        Iterator<String> it=wordList.iterator();
        while(it.hasNext()){
            String s=it.next();
            word_count++;
            ArrayList<Integer> list=map.get(s);
            if(list==null){
                list=new ArrayList<>();
            }
            list.add(word_count);
            map.put(s, list);
        }
        print(map);
    }
}