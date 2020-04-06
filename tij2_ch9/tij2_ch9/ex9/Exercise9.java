package tij2_ch9.tij2_ch9.ex9;
import static custom_tools.tools.print.Print.print;

import java.util.ArrayList;
import java.util.Random;

class Rodent{
    protected String characterstick;
    private int avgAge;
    Rodent(){
        print("Constructing Rodent");
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
    void dispose(){
        characterstick=null;
        avgAge=0;
        //! info();  --wouldn't run the base class info
    }
    void backToRodent(){
        characterstick="nasty";
    }
    public void info(){
        print("Rodent(): ",getCharacterstick()+" AGE : "+getAge());
    }
}

class Mouse extends Rodent{
    private int avgAge;
    Mouse(){
        print("Constructing Mouse");
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
    @Override
    void dispose(){
        print("Mouse backToRodent()");
        avgAge=0;
        backToRodent();
        info();
        super.dispose();
        super.info();
    }
}

class Gerbil extends Rodent{
    private int avgAge;
    Gerbil(){
        print("Constructing Gerbil");
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
    @Override
    void dispose(){
        print("Gerbil backToRodent()");
        avgAge=0;
        backToRodent();
        info();
        super.dispose();
        super.info();
    }
}

class Hamster extends Rodent{
    private int avgAge;
    Hamster(){
        print("Constructing Hamster");
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
    @Override
    void dispose(){
        print("Hamster backToRodent()");
        avgAge=0;
        backToRodent();
        info();
        super.dispose();
        super.info();
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