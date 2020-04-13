package tij2_ch10.tij2_ch10.ex12;
import static custom_tools.print.Print.print;

interface CanFight {   
    void fight(); 
} 
 
interface CanSwim {   
    void swim(); 
} 
 
interface CanFly {   
    void fly(); 
} 

interface CanClimb{
    void climb();
}
 
class ActionCharacter implements CanClimb {   
    public void fight() {
        print("ActionCharacter.fight()");
    } 
    public void climb() {
        print("ActionCharacter.climb()");
    }
}  
 
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    public void swim() {
        print("Hero.swim()");
    }   
    public void fly() {
        print("Hero.fly()");
    } 
} 
 
class Adventure {   
    public static void t(CanFight x) { 
        x.fight(); 
    }   
    public static void u(CanSwim x) { 
        x.swim(); 
    } 
    public static void v(CanFly x) { 
        x.fly(); 
    }   
    public static void w(ActionCharacter x) { 
        x.fight(); 
    } 
    public static void y(CanClimb x){
        x.climb();
    }
    public static void main(String[] args) {     
        Hero h = new Hero();     
        t(h); // Treat it as a CanFight     
        u(h); // Treat it as a CanSwim     
        v(h); // Treat it as a CanFly     
        w(h); // Treat it as an ActionCharacter  
        y(h); //Treat it as ActionCharacter. Can be changed to CanClimb(Result would be same).
    } 
} 

/**
 *  In Adventure.java, add an interface called CanClimb, following the form of the other interfaces.
 */
public class Exercise12 {
    public static void main(String[] args) {
        Adventure.main(args);
    }
}