package tij2_ch12.tij2_ch12;

import java.util.*;

import static custom_tools.print.Print.*;
import experiments.polymorphism.Shape;
import tij2_ch12.tij2_ch12.ex31.Exercise31;

class NonCollectionSequence extends Exercise31 {
    NonCollectionSequence(int i) {
        super(i);
    }

    public Iterable<Shape> reversed() {
        return new Iterable<Shape>(){        
            @Override
            public Iterator<Shape> iterator() {
                return new Iterator<Shape>(){
                    private int current = shapes.length-1; 
                    @Override
                    public Shape next() {
                        return shapes[current--];
                    }
                
                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }
                };
            }
        }; 
    }   
    public Iterable<Shape> randomized(){
        return new Iterable<Shape>(){
            @Override
            public Iterator<Shape> iterator() {
                return new Iterator<Shape>(){
                    List<Shape> list=new ArrayList<>();
                    int index=0;
                {
                    list.addAll(Arrays.asList(shapes));
                    Collections.shuffle(list);
                }
                    @Override
                    public Shape next() {
                        return list.get(index++);
                    }
                
                    @Override
                    public boolean hasNext() {
                        return index<shapes.length;
                    }
                };
            }
        };
    }
}

/**
 * Following the example of MultilterableClass, add reversed( ) and randomized( ) methods to 
 * NonCollectionSequence.java, as well as making NonCollectionSequence implement Iterable, 
 * and show that all the approaches work in foreach statements. 
 */
public class Exercise32 {
    public static void main(String[] args) {
        NonCollectionSequence nSequence=new NonCollectionSequence(10);
        for (Shape shape : nSequence) {
            printnb(shape);
        }
        print(" ");
        for (Shape shape : nSequence.reversed()) {
            printnb(shape);
        }
        print(" ");
        for (Shape shape : nSequence.randomized()) {
            printnb(shape);
        }
        print(" ");
    }
}