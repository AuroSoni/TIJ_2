package experiments.polymorphism;
import static custom_tools.print.Print.*;

public class Circle extends Shape{
    public void draw(){
        print("Circle.draw()");
    }
    public void erase(){
        print("Circle.erase()");
    }
}