package tij2_ch9.tij2_ch9.ex2;

import static custom_tools.tools.print.Print.print;

import java.util.Random;

class Shape {   
    protected void draw() {}   
    protected void erase() {} 
    protected void message(){
        print("Shape.message()");
    }
}

class Circle extends Shape {
    @Override
    protected void draw() { 
        print("Circle.draw()"); 
    }   
    @Override
    protected void erase() { 
        print("Circle.erase()"); 
    }
    @Override
    protected void message(){
        print("Circle.message()");
    } 
}

class Square extends Shape {   
    @Override
    protected void draw() { 
        print("Square.draw()"); 
    }   
    @Override
    protected void erase() { 
        print("Square.erase()"); 
    } 
    @Override
    protected void message(){
        print("Square.message()");
    }
}
 
class Triangle extends Shape {  
    @Override 
    protected void draw() { 
        print("Triangle.draw()"); 
    }   
    @Override
    protected void erase() { 
        print("Triangle.erase()"); 
    } 
    @Override
    protected void message(){
        print("Triangle.message()");
    }
}

class Rectangle extends Shape {  
    @Override 
    protected void draw() { 
        print("Rectangle.draw()"); 
    }   
    @Override
    protected void erase() { 
        print("Rectangle.erase()"); 
    } 
    @Override
    protected void message(){
        print("Rectangle.message()");
    }
}

class RandomShapeGenerator {   
    private Random rand = new Random();   
    public Shape next() {     
        switch(rand.nextInt(4)) {       
            default:       
            case 0: return new Circle();       
            case 1: return new Square();       
            case 2: return new Triangle(); 
            case 3: return new Rectangle();    
        }   
    } 
}

/**
 * Ex2: Add the @Override annotation to the shapes example.
 * Ex3:  Add a new method in the base class of Shapes.java that prints a message, 
 * but don’t override it in the derived classes. Explain what happens. 
 * Now override it in one of the derived classes but not the others, and see what happens. 
 * Finally, override it in all the derived classes.
 * Ex4: Add a new type of Shape to Shapes.java and verify in main( ) that polymorphism 
 * works for your new type as it does in the old types.
 */
public class Exercise2 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();   
    public static void main(String[] args) {     
        Shape[] s = new Shape[9];     
        // Fill up the array with shapes:     
        for(int i = 0; i < s.length; i++)       
        s[i] = gen.next();     
        // Make polymorphic method calls:     
        for(Shape shp : s)  {
            shp.draw();
            shp.message();
        }     
        for(Shape shape:s){
            shape.erase();
        }
    }
}