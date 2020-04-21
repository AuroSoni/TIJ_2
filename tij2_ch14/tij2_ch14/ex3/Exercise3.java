package tij2_ch14.tij2_ch14.ex3;
import java.io.*; 
import java.util.*; 

/**
 * Modify Turtle.java(aka Exercise3) so that it sends all output to System.err. 
 */ 
public class Exercise3 {   
    private String name;   
    private Formatter f;   
    public Exercise3(String name, Formatter f) {     
        this.name = name;     this.f = f;   
    }   
    public void move(int x, int y) {     
        f.format("%s The Exercise3 is at (%d,%d)\n", name, x, y);   
    }   
    public static void main(String[] args) {     
        PrintStream outAlias = System.err;     
        Exercise3 tommy = new Exercise3("Tommy",new Formatter(System.err));     
        Exercise3 terry = new Exercise3("Terry",new Formatter(outAlias));     
        tommy.move(0,0);     
        terry.move(4,8);     
        tommy.move(3,4);     
        terry.move(2,5);     
        tommy.move(3,3);     
        terry.move(3,3);   
    } 
}