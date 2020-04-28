package tij2_ch15.tij2_ch15.ex5;

import static custom_tools.print.Print.*;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() { 
        print(this + ".draw()"); 
    }   
    abstract public String toString(); 
} 
 
class Circle extends Shape {   
    public String toString() { 
        return "Circle"; 
    } 
} 
 
class Square extends Shape {   
    public String toString() { 
        return "Square"; 
    } 
} 
 
class Triangle extends Shape {   
    public String toString() { 
        return "Triangle"; 
    } 
}  

class Rhomboid extends Shape{
    public String toString(){
        return "Rhomboid";
    }
}

/**
 * Implement a rotate(Shape) method in Shapes.java, such that it checks to see if it is 
 * rotating a Circle (and, if so, doesn’t perform the operation). 
 */
public class Exercise5 {
    public static void rotate(Shape s,int degrees){
        if(s instanceof Circle){
            print("Its a circle! No need to rotate");
        }
        else{
            print(s.getClass().getSimpleName()+" rotated by "+degrees+"deg");
        }
    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(),new Rhomboid());     
        for(Shape shape : shapeList)  rotate(shape, 180);;
    }
}