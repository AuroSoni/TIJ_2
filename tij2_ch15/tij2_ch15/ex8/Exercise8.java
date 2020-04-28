package tij2_ch15.tij2_ch15.ex8;

import static custom_tools.print.Print.*;

import java.lang.reflect.Field;

/**
 * Write a method that takes an object and recursively prints all the classes in
 * that object’s hierarchy.
 * (Ex9)Modify the previous exercise so that it uses Class.getDeclaredFields( ) 
 * to also display information about the fields in a class.
 */
public class Exercise8 {
    static void showFields(Class<?> type){
        print("Fields : ");
        for (Field field : type.getDeclaredFields()) {
            printnb(field+"\t");
            //hierarchy(field.getClass());
        }
        print(" ");
    }
    static void hierarchy(Class<?> type) {
        if (type == null)
            return;
        print(type.getName());
        showFields(type);
        for (Class<?> c : type.getInterfaces()) {
            hierarchy(c);
        }
        hierarchy(type.getSuperclass());
    }

    public static void main(String[] args) {
        for (String string : args) {
            print("\n" + string + " :\n");
            try {
                hierarchy(Class.forName(string));
            } catch (ClassNotFoundException e) {
                print(e+" "+string);
            }
        }
    }
}