package tij2_ch13.tij2_ch13.ex17;

import static custom_tools.print.Print.*;

class Characteristic {
    private String s;
    Characteristic(String s) {
      this.s = s;
      print("Creating Characteristic " + s);
    }
    protected void dispose() {
      print("disposing Characteristic " + s);
    }
  }
  
  class Description {
    private String s;
    Description(String s) {
      this.s = s;
      print("Creating Description " + s);
    }
    protected void dispose() {
      print("disposing Description " + s);
    }
  }
  
  class LivingCreature {
    private Characteristic p =
      new Characteristic("is alive");
    private Description t =
      new Description("Basic Living Creature");
    LivingCreature() {
      print("LivingCreature()");
    }
    protected void dispose() {
      print("LivingCreature dispose");
      t.dispose();
      p.dispose();
    }
  }
  
  class Animal extends LivingCreature {
    private Characteristic p =
      new Characteristic("has heart");
    private Description t =
      new Description("Animal not Vegetable");
    Animal() { print("Animal()"); }
    protected void dispose() {
      print("Animal dispose");
      t.dispose();
      p.dispose();
      super.dispose();
    }
  }
  
  class Amphibian extends Animal {
    private Characteristic p =
      new Characteristic("can live in water");
    private Description t =
      new Description("Both water and land");
    Amphibian() {
      print("Amphibian()");
    }
    protected void dispose() {
      print("Amphibian dispose");
      t.dispose();
      p.dispose();
      super.dispose();
    }
  }
  
  class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");
    public Frog() { print("Frog()"); }
    protected void dispose() {
      print("Frog dispose");
      t.dispose();
      p.dispose();
      super.dispose();
    }
  }

/**
 * Modify polymorphism/Frog.java so that it uses try-finally to guarantee proper cleanup, 
 * and show that this works even if you return from the middle of the try-finally. 
 */
public class Exercise17 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        try {
            print("Bye!");
            throw new RuntimeException();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            frog.dispose();
        }
      }
}