package tij2_ch10.tij2_ch10.ex16;

import static custom_tools.tools.print.Print.print;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class Sequence {
    static final char[] CHARS=new String("abcdef").toCharArray();
    public static char[] generate(int j){
        Random rand = new Random();
        char[] cBuffer = new char[j+1];
        for(int i=0; i<j;i++){
            cBuffer[i]=CHARS[rand.nextInt(CHARS.length)];
        }
        cBuffer[j]=' ';                                 //Works as a delimiter
        return cBuffer;
    }
}

class SequenceAdapter extends Sequence implements Readable {
    //extending Sequence wasn't necessary.

    int count; 

    public SequenceAdapter(int count){
        this.count=count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count--==0) return -1;
        char[] temp=generate(6);
        cb.put(temp);                                  //Where I was lacking. How to init the CharBuffer with char[].
        return temp.length;
    }
    
}

/**
 * Create a class that produces a sequence of chars. 
 * Adapt this class so that it can be an input to a Scanner object. 
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner s= new Scanner(new SequenceAdapter(6));
        while(s.hasNext()) 
        print(s.next());
    }
}