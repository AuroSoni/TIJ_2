package tij2_ch12.tij2_ch12.ex3;

import static custom_tools.print.Print.*;

import java.util.ArrayList;
import java.util.List;

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
 
class UnlimitedSequence {   
    private List<Object> items=new ArrayList<>();   

    public void add(Object x) {     
        items.add(x);
    }   
    private class SequenceSelector implements Selector {     
        private int i = 0;     
        public boolean end() { 
            return i == items.size(); 
        }     
        public Object current() { 
            return items.get(i); 
        }     
        public void next() { 
            if(i < items.size()) i++; 
        }   
    }   
    public Selector selector() {     
        return new SequenceSelector();   
    }    

    private class ReverseSequenceSelector implements ReverseSelector{
        private int i=items.size()-1;
        @Override
        public boolean start() {
            return i<0;
        }

        @Override
        public Object current() {
            return items.get(i);
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
 * Modify innerclasses/Sequence.java so that you can add any number of elements to it.
 */
public class Exercise3 {
    public static int no=10;
    public static void main(String[] args) {
        UnlimitedSequence sequence = new UnlimitedSequence();     
        for(int i = 0; i < no; i++)       
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