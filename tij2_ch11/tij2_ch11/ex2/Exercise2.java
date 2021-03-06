package tij2_ch11.tij2_ch11.ex2;

import java.util.Random;

import static custom_tools.print.Print.print;

interface Selector {   
    boolean end();   
    Object current();   
    void next();
    Sequence ref();
}  
 
class Sequence {   
    private Object[] items;   
    private int next = 0;   
    public Sequence(int size) { 
        items = new Object[size]; 
    }   
    public void add(Object x) {     
        if(next < items.length) items[next++] = x;   
    }   
    
    class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }
        @Override
        public Object current() {
            return items[i];
        }
        @Override
        public void next() {
            if (i < items.length)
                i++;
        }

        /**
         * Ex4 : Add a method to the class Sequence.SequenceSelector that produces the
         * reference to the outer class Sequence.
         */
        @Override
        public Sequence ref() {
            return Sequence.this;
        }
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
    
    public Selector selector() {
        return new SequenceSelector();
    }
}

class Items {
    String string;

    Items(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }
}

/**
 * Create a class that holds a String, and has a toString( ) method that
 * displays this String. Add several instances of your new class to a Sequence
 * object, then display them.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Sequence sequence= new Sequence(10);
        Random rand =new Random();
        for(int i=0;i<10;i++){
            Items item=new Items("NO"+(i+1)+": "+rand.nextInt(100));
            sequence.add(item);
        }
        Selector s= sequence.selector();
        while(!s.end()){
            print(s.current());
            s.next();
        }
        print("\nExercise 4: ",s.ref());
    }
}