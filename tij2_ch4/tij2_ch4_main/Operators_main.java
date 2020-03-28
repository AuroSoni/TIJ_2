package tij2_ch4_main;

import tij2_ch4.Operators;
import tij2_ch4.Operators.Dog;
import tij2_ch4.Operators.Exercise2;

/**
 * Implements the main method to run the objects in {@link tij2_ch4}
 */
public class Operators_main{

    /**
    * Program execution begins here
    * @param args
    */
    public static void main(String[] args) {
        Operators ex=new Operators();

        System.out.println("Running Exercise 1 : ");
        Operators.Exercise1.print("This is the string passed");

        System.out.println("Running Exercise 2 : ");
        Exercise2 ex2_1=ex.exercise2((float) 5.0);
        Exercise2 ex2_2=ex.exercise2((float) 7.0);
        System.out.println("ex2_1 : "+ex2_1.f+"\t"+"ex2_2 : "+ex2_2.f);
        ex2_2=ex2_1;
        System.out.println("ex2_1 : "+ex2_1.f+"\t"+"ex2_2 : "+ex2_2.f);
        ex2_1.f=10;
        System.out.println("ex2_1 : "+ex2_1.f+"\t"+"ex2_2 : "+ex2_2.f);

        System.out.println("Running Exercise 3 : ");
        System.out.println("ex2_1 : "+ex2_1.f);
        ex.exercise3(ex2_1, 20);
        System.out.println("ex2_1 : "+ex2_1.f);

        System.out.println("Running Exercise 4 : ");
        double d=ex.exercise4(10, 10);
        System.out.println("Speed : "+d);

        System.out.println("Running Exercise 5 : ");
        Dog d1=ex.build_dog("spot", "Ruff");
        Dog d2=ex.build_dog("scruffy", "Wurf");
        System.out.println(d1.name+" says "+d1.says);
        System.out.println(d2.name+" says "+d2.says);
        
        // create a new Dog reference and assign it to spot’s object. Test for comparison using == and equals( ) for all references. 
        System.out.println("Running Exercise 6 : ");
        Dog newDog=ex.build_dog("newDog", "Bark");
        System.out.println(d1==d2);
        System.out.println(d1==newDog);
        System.out.println(newDog==d2);
        d1=d2;
        System.out.println(d1.equals(d2));
        newDog.name=d1.name="fName";
        newDog.says=d1.says="fSays";
        System.out.println(newDog.equals(d1)); //This is the special case

        System.out.println("Running Exercise 7 : ");
        if(ex.coinFlip())System.out.println("Heads");
        else System.out.println("Tails");

        System.out.println("Running Exercise 8 : ");
        System.out.println("hex : "+Long.toBinaryString(ex.makeEx8().hex_));
        System.out.println("oct : "+Long.toBinaryString(ex.makeEx8().oct_));

        System.out.println("Running Exercise 9 : ");
        System.out.println("Max float : "+Float.MAX_VALUE);
        System.out.println("Max Double : "+Double.MAX_VALUE);

        System.out.println("Running Exercise 10 : ");
        int i=0xaaaaaaaa;
        int j=0x55555555;
        System.out.println("i : "+Integer.toBinaryString(i));
        System.out.println("j : "+Integer.toBinaryString(j));
        System.out.println("i&j : "+Integer.toBinaryString(i&j));
        System.out.println("i&i : "+Integer.toBinaryString(i&i));
        System.out.println("j&j : "+Integer.toBinaryString(j&j));
        System.out.println("i|j : "+Integer.toBinaryString(i|j));
        System.out.println("i|i : "+Integer.toBinaryString(i|i));
        System.out.println("j|j : "+Integer.toBinaryString(j|j));
        System.out.println("i^j : "+Integer.toBinaryString(i^j));
        System.out.println("i^i : "+Integer.toBinaryString(i^i));
        System.out.println("j^j : "+Integer.toBinaryString(j^j));
        System.out.println("~i : "+Integer.toBinaryString(~i));
        System.out.println("~j : "+Integer.toBinaryString(~j));  //Note that Integer.toBinaryString() does not print leading zeroes
    }
}