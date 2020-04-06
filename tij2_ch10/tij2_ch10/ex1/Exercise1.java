package tij2_ch10.tij2_ch10.ex1;
import static custom_tools.tools.print.Print.print;

import java.util.ArrayList;
import java.util.Random;

abstract class Rodent{
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
    abstract void says();
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
    @Override
    void says(){
        print("Hi, Im a Mouse.");
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
    @Override
    void says(){
        print("Hi, Im a Gerbil.");
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
    @Override
    void says(){
        print("Hi, Im a Hamster.");
    }
}

/**
 * Modify Exercise 9 in the previous chapter so that Rodent is an abstract class. 
 * Make the methods of Rodent abstract whenever possible
 */
public class Exercise1{
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
            rodent.says();
        }
        print("\n\nTime to Go\n\n");
        for (int i=0;i<6;i++) {
            rodents.get(5-i).dispose();
            rodents.remove(5-i);
        }
    }
}