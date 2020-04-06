package tij2_ch9.tij2_ch9.ex9;
import static custom_tools.tools.print.Print.print;

import java.util.ArrayList;
import java.util.Random;

class Rodent{
    protected String characterstick;
    private int avgAge;
    Rodent(){
        characterstick="nasty";
        avgAge=5;
    }

    int getAge(){
        return avgAge;
    }
    String getCharacterstick(){
        return characterstick;
    }
    void setCharacterstick(String string){
        characterstick+=string;
    }
    public void info(){
        print("Rodent(): ",getCharacterstick()+" AGE : "+getAge());
    }
}

class Mouse extends Rodent{
    private int avgAge;
    Mouse(){
        avgAge=6;
        this.setCharacterstick("Mouse");
    }
    @Override
    int getAge(){
        return avgAge;
    }
    @Override
    public void info(){
        print("Mouse(): ",getCharacterstick()+" AGE : "+getAge());
    }
}

class Gerbil extends Rodent{
    private int avgAge;
    Gerbil(){
        avgAge=7;
        this.setCharacterstick("Gerbil");
    }
    @Override
    int getAge(){
        return avgAge;
    }
    @Override
    public void info(){
        print("Gerbil(): ",getCharacterstick()+" AGE : "+getAge());
    }
}

class Hamster extends Rodent{
    private int avgAge;
    Hamster(){
        avgAge=8;
        this.setCharacterstick("Hamster");
    }
    @Override
    int getAge(){
        return avgAge;
    }
    @Override
    public void info(){
        print("Hamster(): ",getCharacterstick()+" AGE : "+getAge());
    }
}

/**
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. 
 * In the base class, provide methods that are common to all Rodents, 
 * and override these in the derived classes to perform different behaviors 
 * depending on the specific type of Rodent. 
 * Create an array of Rodent, fill it with different specific types of Rodents, 
 * and call your base-class methods to see what happens.
 */
public class Exercise9 {

    public static void main(String[] args) {
        ArrayList<Rodent> rodents=new ArrayList<>();
        Random rand=new Random();
        for(int i=0; i<7;i++){
            int j=rand.nextInt(3);
            switch (j) {
                case 0:
                    rodents.add(new Mouse()); 
                    break;
                case 1:
                    rodents.add(new Gerbil());
                    break;
                case 2:
                    rodents.add(new Hamster());
                    break;
                default:
                    print("Impossible");
            }
        }
        for (Rodent rodent : rodents) {
            rodent.info();
        }
    }
}