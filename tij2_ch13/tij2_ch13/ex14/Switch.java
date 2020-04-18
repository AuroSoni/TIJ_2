package tij2_ch13.tij2_ch13.ex14;

import static custom_tools.print.Print.*;

public class Switch {   
    private boolean state = false;   
    public boolean read() { 
        return state; 
    }   
    public void on() { 
        state = true; 
        print(this); 
    }   
    public void off() { 
        state = false; 
        print(this); 
    }   
    public String toString() { 
        return state ? "on" : "off"; 
    } 
}