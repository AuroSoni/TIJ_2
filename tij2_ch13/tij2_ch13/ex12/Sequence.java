package tij2_ch13.tij2_ch13.ex12;

interface Selector {
    boolean end();

    Object current();

    void next();
}

interface ReverseSelector {
    boolean start();

    Object current();

    void previous();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items=new Object[size];
        while (items.length <= size) {
            try {
                add("Default");
            } catch (TooManyItems e) {
                e.printStackTrace();
            }
        } 
    }   

    public void add(Object x) throws TooManyItems{     
        if(items.length>=15)
        throw new TooManyItems();

        if(next < items.length)       
        items[next++] = x;   
        else{
            Object[] tmp=new Object[items.length+1];
            int j=0;
            for (Object object : items) {
                tmp[j]=object;
                j++;
            }
            tmp[j]=x;
            items=tmp;
        }
    }   

    public String toString(){
        StringBuilder sBuilder=new StringBuilder();
        for (Object object : items) {
            sBuilder.append(object.toString()+ " ");
        }
        return sBuilder.toString();
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

    class TooManyItems extends Exception{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        TooManyItems() {
            super();
        }
        TooManyItems(String msg){
            super(msg);
        }
    }
}