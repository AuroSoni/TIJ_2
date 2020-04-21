package tij2_ch14.tij2_ch14.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Repair InfiniteRecursion.java(aka Exercise2).
 */
public class Exercise2 {
    public String toString() {     
        return " Exercise2 address: " + super.toString() + "\n";   
    }   
    public static void main(String[] args) {     
        List<Exercise2> v = new ArrayList<Exercise2>();     
        for(int i = 0; i < 10; i++)       
        v.add(new Exercise2());     
        System.out.println(v);   
    } 
}