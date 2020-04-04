package tij2_ch8.ex16;

import static tij2_ch8.tools.tools.print;

class Amphibian{
    protected boolean soul;
    Amphibian rep(){
        print("Rep()");
        return new Amphibian(this);
    }
    Amphibian(final Amphibian amphibian) {
        print("Father_Amphibian(): " + amphibian.soul);
        soul = true;
        print("Baby_Amphibian(): " + soul);
    }

    Amphibian() {
        // God Amphibian
        soul = true;
        print("God Amphibian Appears");
    }
}

/**
 * Create a class called Amphibian. From this, inherit a class called Frog(aka
 * Exercise 16). Put appropriate methods in the base class. In main( ), create a
 * Frog and upcast it to Amphibian and demonstrate that all the methods still
 * work.
 */
public class Exercise16 extends Amphibian {
    final String specie = "frog";

    Exercise16(final Exercise16 frog) {
        super(frog);
    }

    Exercise16() {
        // God frog
        print("God Frog Appears");
    }

    @Override
    Exercise16 rep() {
        final Exercise16 baby_frog = new Exercise16(this);
        // Auto-generated method stub
        return baby_frog;
    }

    public static void main(final String[] args) {
        // ! Exercise16 ex16=new Exercise16((Exercise16) new Amphibian());
        final Exercise16 ex16 = new Exercise16();
        print(ex16.toString());
        final Exercise16 frog = ex16.rep();
        print(frog.toString());
        //Exercise16 frog=new Exercise16(ex16);
    }
}