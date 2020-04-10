package tij2_ch11.tij2_ch11;
import static custom_tools.tools.print.Print.*;

interface Selector {   
    boolean end();   
    Object current();   
    void next(); 
}  

interface ReverseSelector{
    boolean start();
    Object current();
    void previous();
}
 
class Sequence {   
    private Object[] items;   
    private int next = 0;  
    public Sequence(int size) { 
        items = new Object[size]; 
    }   
    public void add(Object x) {     
        if(next < items.length)       
        items[next++] = x;   
    }   
    private class SequenceSelector implements Selector {     
        private int i = 0;     
        public boolean end() { 
            return i == items.length; 
        }     
        public Object current() { 
            return items[i]; 
        }     
        public void next() { 
            if(i < items.length) i++; 
        }   
    }   
    public Selector selector() {     
        return new SequenceSelector();   
    }    

    private class ReverseSequenceSelector implements ReverseSelector{
        private int i=items.length-1;
        @Override
        public boolean start() {
            return i<0;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void previous() {
            if(i>=0)i--;
        }
    }
    public ReverseSelector reverseSelector(){
        return new ReverseSequenceSelector();
    }
}

/**
 * Implement reverseSelector( ) in Sequence.java
 */
public class Exercise22 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);     
        for(int i = 0; i < 10; i++)       
        sequence.add(Integer.toString(i));     
        Selector selector = sequence.selector(); 
        print("Selector");    
        while(!selector.end()) {       
            printnb(selector.current() + " ");       
            selector.next();     
        } 
        print("\nReverse Selector");
        ReverseSelector revSelector = sequence.reverseSelector();
        while(!revSelector.start()){
            printnb(revSelector.current()+" ");
            revSelector.previous();
        }
    }
    
}