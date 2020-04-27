package tij2_ch15.tij2_ch15;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() { 
        System.out.println(this + ".draw()"); 
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
 * Add Rhomboid to Shapes.java(aka Exercise3). Create a Rhomboid, upcast it to a Shape, 
 * then downcast it back to a Rhomboid. Try downcasting to a Circle and see what happens.
 */
public class Exercise3 {
    public static void main(String[] args) {     
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(),new Rhomboid());     
        for(Shape shape : shapeList)  shape.draw();   
        Circle c = (Circle) shapeList.get(3);
        c.draw();
    }
}