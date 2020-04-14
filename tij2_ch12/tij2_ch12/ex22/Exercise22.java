package tij2_ch12.tij2_ch12.ex22;
import static custom_tools.print.Print.*;
import java.util.HashSet;
import java.util.Iterator;

class Word{
    String word;
    public int count=1;
    Word(String w){
        this.word=w;
        if(Word.has(this)){
            this.modify(w);
        }
        else{
            set.add(this);
        }
    }
    public static boolean has(Word word){
        for (Word w : set) {
            if(w.equals(word))return true;
        }
        return false;
    }
    public static HashSet<Word> set=new HashSet<>();

    public void modify(String word){
        Iterator<Word> it=set.iterator();
        while(it.hasNext()){
            Word newWord= it.next();
            if(newWord.word==word){
                newWord.count++;
            }
        }
    }

    @Override
    public boolean equals(Object w1){
        return (this.word==((Word)w1).word);
    };

    @Override
    public String toString(){
        return word + " : "+count;
    }
}

/**
 * Modify the previous exercise so that it uses a class containing a String and a count field 
 * to store each different word, and a Set of these objects to maintain the list of words. 
 */
public class Exercise22 {
    public static void main(String[] args) {
        new Word("Auro");
        new Word("Aatmaj");
        new Word("Mummy");
        new Word("Papa");
        new Word("Auro");
        print(Word.set);
    }
}