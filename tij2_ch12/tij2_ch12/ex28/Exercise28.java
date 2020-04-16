package tij2_ch12.tij2_ch12.ex28;
import static custom_tools.print.Print.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Fill a PriorityQueue (using offer( )) with Double values created using java.util.Random, 
 * then remove the elements using poll( ) and display them.  
 */
public class Exercise28 {
    public static void main(String[] args) {
        PriorityQueue<Double> queue=new PriorityQueue<>(Collections.reverseOrder());
        Random rand =new Random();
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextDouble());
        }
        while (!queue.isEmpty()) {
            printnb(queue.poll() + "  ");
        }
        print(" ");
    }
}