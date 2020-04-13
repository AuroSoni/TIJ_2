package tij2_ch8.tij2_ch8.ex6;
import static custom_tools.print.Print.*;

class Game {   
    Game(int i) {
        print("Game constructor");   
    } 
} 
 
class BoardGame extends Game {   
    BoardGame(int i) {     
        super(i);     
        print("BoardGame constructor");  
    } 
}  

/**
 * If you don’t call the base-class constructor in BoardGame( ), 
 * the compiler will complain that it can’t find a constructor of the form Game( ). 
 * In addition, the call to the base-class constructor must be the first thing 
 * you do in the derived-class constructor. 
 * (The compiler will remind you if you get it wrong.) 
 */
public class Exercise6 extends BoardGame {   
    public Exercise6() {     
        super(11);     
        print("Exercise6 constructor");   
    }   
} 