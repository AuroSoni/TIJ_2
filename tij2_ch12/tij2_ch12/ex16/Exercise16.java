package tij2_ch12.tij2_ch12.ex16;

import static custom_tools.print.Print.*;
import custom_tools.map_utility.*;
import java.util.*;
import custom_tools.myio.TextFile;

/**
 * Create a Set of the vowels. Working from UniqueWords.Java, 
 * count and display the number of vowels in each input word, 
 * and also display the total number of vowels in the input file.  
 */
public class Exercise16 extends MapUtility<Character,Integer>{
    private static long total_vowels=0;
    public static void main(String[] args) {
        MapUtility<Character,Integer> mu=new MapUtility<Character,Integer>() {
        };
        
        HashSet<Character> vowels=new HashSet<>();
        Collections.addAll(vowels,'a','e','i','o','u','A','E','I','O','U');
        /**
         * (Ex20)Modify Exercise 16 so that you keep a count of the occurrence of each vowel.
         */
        LinkedHashMap<Character,Integer> vowelCount=mu.fill(vowels, Arrays.asList(0,0,0,0,0,0,0,0,0,0));
        HashSet<String> words=new HashSet<>();
        for (String word : new TextFile("tij2_ch12/tij2_ch12/Exercise16.java","\\W+"))  {
            if(!words.contains(word)){
                int vowels_in_word=0;
                printnb(word + " : ");
                for(char c : word.toCharArray()){
                    if(vowels.contains(c)){
                        vowels_in_word++;
                        int i = vowelCount.get(c);
                        vowelCount.put(c, ++i);
                    }
                }
                words.add(word);
                printnb(String.valueOf(vowels_in_word));
                print(" ");
                total_vowels+=vowels_in_word;
            }
        }
        print("Total Vowels : "+total_vowels);
        print("Vowel Count : ");
        print(vowelCount);
    }
}