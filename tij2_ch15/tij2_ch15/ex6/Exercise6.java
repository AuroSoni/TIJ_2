package tij2_ch15.tij2_ch15.ex6;

import static custom_tools.print.Print.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Shape {
    public boolean highlight = false;

    public void highlight() {
        highlight = true;
    }

    public void clearHighlight() {
        highlight = false;
    }

    public void draw() {
        print(getClass().getSimpleName() + ".draw()");
    }

    public String toString() {
        return getClass().getSimpleName() + " highlight : " + highlight;
    }

    private static List<Shape> shapes = new ArrayList<Shape>();
    Shape(){
        shapes.add(this);
    }

    static void highlight2(Class<?> type) {     
        for(Shape shape : shapes)       
        if(type.isInstance(shape))         
        shape.highlight();   
    }   
    static void clearHighlight2(Class<?> type) {     
        for(Shape shape : shapes)       
        if(type.isInstance(shape))         
        shape.clearHighlight();   
    }

    static void ForEach(Class<?> type, String method) {
        Method m;
        try {
            m = Shape.class.getMethod(method, (Class<?>[]) null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (Shape shape : shapes) {
            if (type.isInstance(shape))
                try {
                    m.invoke(shape, (Object[]) null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
    public static void highlight1(Class<?> type){
        ForEach(type, "highlight");
    }
    public static void clearHighlight1(Class<?> type){
        ForEach(type, "clearHighlight");
    }
}

class Triangle extends Shape{}
class Circle extends Shape{}
class Square extends Shape{}
class Rhomboid extends Shape{}

/**
 * (Ex6)Modify Shapes.java so that it can "highlight" (set a flag in) all shapes of a particular type. 
 * The toString( ) method for each derived Shape should indicate whether that Shape is "highlighted."
 */
public class Exercise6 {                                  //I have used 2 highlight approaches.
    static List<Shape> shapes;
    static void printList(){
        for (Shape shape : shapes) {
            print(shape);
        }
    }
    public static void main(String[] args) {
        shapes=new ArrayList<>();
        shapes.addAll(Arrays.asList(new Triangle(),new Circle(),new Rhomboid(),new Circle(),new Triangle(),new Square(), new Square()));
        Shape.highlight2(Triangle.class);
        Shape.highlight1(Rhomboid.class);
        print("Triangle and Rhomboid highlighted");
        printList();
        Shape.clearHighlight1(Triangle.class);
        print("\nTriangle unhighlighted");
        printList();
    }
}