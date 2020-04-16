package tij2_ch12.tij2_ch12.ex31;

import java.util.Iterator;

import static custom_tools.print.Print.*;
import experiments.polymorphism.RandomShapeGenerator;
import experiments.polymorphism.Shape;

/**
 * Modify polymorphism/shape/RandomShapeGenerator.java(modified version is
 * Exercise31) to make it Iterable. You’ll need to add a constructor that takes
 * the number of elements that you want the iterator to produce before stopping.
 * Verify that it works.
 */
public class Exercise31 extends RandomShapeGenerator implements Iterable<Shape> {
    int last_index=0;
    Shape[] shapes=new Shape[10];
    Exercise31(int i){
        last_index=i;

        print("Hello");
        for (int j = 0; j < 10; j++) {
            shapes[j]=next();
        }
    }
    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            int index=0;
            @Override
            public boolean hasNext() {
                return index<last_index;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }
        };
    }
    public static void main(String[] args) {
        Exercise31 ex31=new Exercise31(5);
        Iterator<Shape> it=ex31.iterator();
        while (it.hasNext()) {
            printnb(it.next()+" ");
        }
        print(" ");
    }
}