package tij2_ch11.tij2_ch11.ex17;
import static custom_tools.print.Print.print;

import java.util.Random;

interface Chance{
    public void chance();
}

interface ChanceFactory{
    public Chance generate();
}

class Toss implements Chance {
    @Override
    public void chance() {
        Random rand = new Random();
        boolean result = rand.nextBoolean();
        if (result)
            print("TOSS : Heads");
        else
            print("TOSS : Tails");
    }
    static ChanceFactory factory=new ChanceFactory(){
    
        @Override
        public Chance generate() {
            return new Toss();
        }
    };
}

class Roll implements Chance {
    @Override
    public void chance() {
        Random rand = new Random();
        int result = rand.nextInt(6) + 1;
        print("ROLL : " + result);
    }
    static ChanceFactory factory=new ChanceFactory(){
    
        @Override
        public Chance generate() {
            return new Roll();
        }
    };
}

/**
 * Modify the solution to Exercise 19 from the Interfaces chapter to use anonymous inner classes. 
 */
public class Exercise17 {
    private static void gamble(ChanceFactory cf){
        Chance ch=cf.generate();
        ch.chance();
    }
    public static void main(String[] args) {
        gamble(Roll.factory);
        gamble(Toss.factory);
    }
}