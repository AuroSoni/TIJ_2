package experiments.polymorphism;
import static custom_tools.print.Print.*;

public class Square extends Shape{
    public void draw(){
        print("Square.draw()");
    }
    public void erase(){
        print("Square.erase()");
    }
}