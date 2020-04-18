package tij2_ch13.tij2_ch13.ex12;

import static custom_tools.print.Print.*;

import tij2_ch13.tij2_ch13.ex12.Sequence.TooManyItems;

/**
 * Modify innerclasses/Sequence.java so that it throws an appropriate exception
 * if you try to put in too many elements.
 */
public class Exercise12 {

    public static void main(String[] args) {
        Sequence seq = new Sequence(10);
        while(true){
            try {
                seq.add("New");
            } catch (TooManyItems e) {
                e.printStackTrace();
                break;
            }
        }
        print(seq);
    }
}