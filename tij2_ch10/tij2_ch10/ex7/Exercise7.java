package tij2_ch10.tij2_ch10.ex7;

import static custom_tools.tools.print.Print.print;

import java.util.ArrayList;
import java.util.Random;

interface Rodent{
    int AVG_AGE=5;

    int getAge();
    String getCharacterstick();
    abstract void setCharacterstick(String string);
    void dispose();
    void backToRodent();
    public void info();
}

class Mouse implements Rodent{
    protected String characterstick;

    Mouse(){
        print("Constructing Mouse");
        this.setCharacterstick("Mouse");
    }
    
    @Override
    public int getAge() {
        return AVG_AGE;
    }
    @Override
    public void info(){
        print("Mouse(): ",getCharacterstick()+" AGE : "+getAge());
    }
    
    @Override
    public void dispose() {
        print("Mouse backToRodent()");
        backToRodent();
        info();
        //super.dispose();
        //super.info();       meaningless now
    }

    @Override
    public String getCharacterstick() {
        return characterstick;
    }

    @Override
    public void setCharacterstick(String string) {
        characterstick=string;
    }

    @Override
    public void backToRodent() {
        characterstick="nasty";
    }
}

class Gerbil implements Rodent{
    protected String characterstick;

    Gerbil(){
        print("Constructing Gerbil");
        this.setCharacterstick("Gerbil");
    }
    
    @Override
    public int getAge() {
        return AVG_AGE;
    }
    @Override
    public void info(){
        print("Gerbil(): ",getCharacterstick()+" AGE : "+getAge());
    }
    
    @Override
    public void dispose() {
        print("Gerbil backToRodent()");
        backToRodent();
        info();
        //super.dispose();
        //super.info();       meaningless now
    }

    @Override
    public String getCharacterstick() {
        return characterstick;
    }

    @Override
    public void setCharacterstick(String string) {
        characterstick=string;
    }

    @Override
    public void backToRodent() {
        characterstick="nasty";
    }
}

class Hamster implements Rodent{
    protected String characterstick;

    Hamster(){
        print("Constructing Hamster");
        this.setCharacterstick("Hamster");
    }
    
    @Override
    public int getAge() {
        return AVG_AGE;
    }
    @Override
    public void info(){
        print("Hamster(): ",getCharacterstick()+" AGE : "+getAge());
    }
    
    @Override
    public void dispose() {
        print("Hamster backToRodent()");
        backToRodent();
        info();
        //super.dispose();
        //super.info();       meaningless now
    }

    @Override
    public String getCharacterstick() {
        return characterstick;
    }

    @Override
    public void setCharacterstick(String string) {
        characterstick=string;
    }

    @Override
    public void backToRodent() {
        characterstick="nasty";
    }
}

/**
 * Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.
 */
public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<Rodent> rodents=new ArrayList<>();
        Random rand=new Random();
        for(int i=0; i<6;i++){
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
        print("\n\nTime to Go\n\n");
        for (int i=0;i<6;i++) {
            rodents.get(5-i).dispose();
            rodents.remove(5-i);
        }
    }
}