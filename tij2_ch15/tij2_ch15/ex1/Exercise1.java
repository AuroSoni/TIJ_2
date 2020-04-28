package tij2_ch15.tij2_ch15.ex1;

import static custom_tools.print.Print.*;

import java.lang.reflect.InvocationTargetException;

interface HasBatteries {} 
interface Waterproof {} 
interface Shoots {} 
interface newInterface{}
 
class Toy {   
    // Comment out the following default constructor   
    // to see NoSuchMethodError from (*1*)   
    //Toy() {}   
    Toy(int i) {} 
} 
 
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, newInterface {   
    FancyToy() { 
        super(1); 
    } 
} 

/**
 * In ToyTest.java (aka Exercise1), comment out Toy’s default constructor and explain what happens.
 * (Ex2)Incorporate a new kind of interface into ToyTest.java and verify that it is detected and displayed properly.
 */
public class Exercise1 {  
    static void printInfo(Class<?> cc) {     
        print("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");     
        print("Simple name: " + cc.getSimpleName());     
        print("Canonical name : " + cc.getCanonicalName());   
    }   
    public static void main(String[] args) {     
        Class<?> c = null;
        try {       
            c = Class.forName("tij2_ch15.tij2_ch15.ex1.FancyToy");     
        } catch(ClassNotFoundException e) {       
            print("Can’t find FancyToy");       
            System.exit(1);     
        }     
        printInfo(c);      
        
        for(Class<?> face : c.getInterfaces())       
        printInfo(face);     
        
        Class<?> up = c.getSuperclass();     
        Object obj = null;     
        try {       
            // Requires default constructor:       
            obj = up.getDeclaredConstructor().newInstance();  
            printInfo(obj.getClass());    
        } catch(InstantiationException e) {       
            print("Cannot instantiate");       
            System.exit(1);     
        } catch(IllegalAccessException e) {       
            print("Cannot access");       
            System.exit(1);     
        } catch(NoSuchMethodException e){
            print("No such Constructor");
        } catch(InvocationTargetException e){
            print("Invocation Target Exception");
        }
          
    } 
}