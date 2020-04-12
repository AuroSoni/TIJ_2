package experiments.application_framework;

import java.util.*;
    
public class Controller {   
    // A class from java.util to hold Event objects:   
    private List<Event> eventList = new LinkedList<Event>();  
    ListIterator<Event> li; 
    public void addEvent(Event c) { 
        li=eventList.listIterator(eventList.size());
        li.add(c); 
    }   
    // public void run() {     
    //     while(eventList.size() > 0)       
    //     // Make a copy so you’re not modifying the list       
    //     // while you’re selecting the elements in it:       
    //     for(Event e : new ArrayList<Event>(eventList))         
    //     if(e.ready()) {           
    //         System.out.println(e);           
    //         e.action();           
    //         eventList.remove(e);         
    //     }       
    // }  
    
    /**
    * (Ch12)Ex 13: In the innerclasses/GreenhouseController.java example, the class Controller uses an ArrayList. 
    * Change the code to use a LinkedList instead, and use an Iterator to cycle through the set of events.
    */
    public void run(){
        int i=0;
        li=eventList.listIterator(i);
        while(li.hasNext()){
            i=li.nextIndex();
            Event f=li.next();
            if(f.ready()) {           
                System.out.println(f);           
                f.action();    
                try{       
                    li.remove();
                }
                catch(Exception e){  //to escape ConcurrentModificationException and IllegalStateException.
                    li=eventList.listIterator(i);
                    li.next();
                    li.remove();
                }
            }
        }
    }
} 