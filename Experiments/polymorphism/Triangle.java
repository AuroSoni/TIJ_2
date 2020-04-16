package experiments.polymorphism;
import static custom_tools.print.Print.*;

public class Triangle extends Shape{
    public void draw(){
        print("Triangle.draw()");
    }
    public void erase(){
        print("Triangle.erase()");
    }
}