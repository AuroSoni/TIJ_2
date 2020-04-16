package tij2_ch12.tij2_ch12.ex27;
import static custom_tools.print.Print.*;

import java.util.LinkedList;
import java.util.Queue;

class Command{
    static int counter=0;
    final int id=counter++;
    String command;
    Command(){
        command="DO";
    }
    void operation(){
        printnb(command, " ",id);
        print(" ");
    }
}

class Order{
    static Queue<Command> fill(Queue<Command> cmd,int size){
        for (int i = 0; i < size; i++) {
            cmd.add(new Command());
        }
        return cmd;
    }
}

class Execute{
    static void execute(Queue<Command> cmd){
        while(!cmd.isEmpty()){
            Command c=cmd.poll();
            c.operation();
        }
        print("Queue Size : "+cmd.size());
    }
}

/**
 * Write a class called Command that contains a String and has a method operation( ) 
 * that displays the String. Write a second class with a method that fills a Queue 
 * with Command objects and returns it. Pass the filled Queue to a method in a third class 
 * that consumes the objects in the Queue and calls their operation( ) methods.
 */
public class Exercise27 {
    public static void main(String[] args) {
        Execute.execute(Order.fill(new LinkedList<Command>(), 5));
    }
}