package tij2_ch10.tij2_ch10.ex19;
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
}

class Roll implements Chance {
    @Override
    public void chance() {
        Random rand = new Random();
        int result = rand.nextInt(6) + 1;
        print("ROLL : " + result);
    }
}

class RollFactory implements ChanceFactory {
    public Roll generate() {
        return new Roll();
    }
}

class TossFactory implements ChanceFactory {
    public Toss generate() {
        return new Toss();
    }
}

/**
 * Create a framework using Factory Methods that performs both coin tossing and
 * dice tossing.
 */
public class Exercise19 {
    public static void choose(ChanceFactory chanceFactory) {
        Chance ch = chanceFactory.generate();
        ch.chance();
    }
    public static void main(String[] args) {
        print("Tossing : ");
        choose(new TossFactory());
        print("Rolling : ");
        choose(new RollFactory());
    }
}