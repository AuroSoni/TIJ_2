package tij2_ch8.ex16;

import static tij2_ch8.tools.tools.print;

class Amphibian{
    protected String specie;
    Amphibian rep(){
        print("Rep()");
        return new Amphibian(this);
    }
    Amphibian(Amphibian amphibian){
        print("Amphibian(): "+amphibian.specie);
        specie=amphibian.specie;
    }

    Amphibian(){
        //God Amphibian
        print("God Amphibian Appears");
    }
}
/**
 * Create a class called Amphibian. From this, inherit a class called Frog(aka Exercise 16). 
 * Put appropriate methods in the base class. 
 * In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work. 
 */
public class Exercise16 extends Amphibian{
    String specie="frog";
    Exercise16(Exercise16 frog){
        super(frog);
    }

    Exercise16(){
        //God frog
        print("God Frog Appears");
    }

    public static void main(String[] args) {
        //! Exercise16 ex16=new Exercise16((Exercise16) new Amphibian());
        Exercise16 ex16=new Exercise16();
        ex16.toString();
    }
}