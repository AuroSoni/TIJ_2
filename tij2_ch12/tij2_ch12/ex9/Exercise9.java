package tij2_ch12.tij2_ch12.ex9;
import static custom_tools.tools.print.Print.*;
import java.util.*;

interface Selector {   
    boolean end();   
    Object current();   
}  
 
class Sequence {   
    private static List<Object>  items;    
    public Sequence() { 
        items=new ArrayList<>();
    }   
    public void add(Object x) {            
        items.add(x);   
    }   
    private static class SequenceSelector implements Selector {  
        private static Iterator<Object> it=items.iterator();       
        public boolean end() { 
            return !it.hasNext(); 
        }     
        public Object current() { 
            return it.next(); 
        }  
    }   
    public Selector selector() {     
        return new SequenceSelector();   
    }
}

/**
 * Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
 */
public class Exercise9 {
    public static int no=10;
    public static void main(String[] args) {
        Sequence sequence = new Sequence();     
        for(int i = 0; i < no; i++)       
        sequence.add(Integer.toString(i));     
        final Selector selector = sequence.selector(); 
        print("Selector");    
        while(!selector.end()) {       
            printnb(selector.current() + " ");           
        }    
    }
}