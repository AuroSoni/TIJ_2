package tij2_ch15.tij2_ch15.ex8;

import static custom_tools.print.Print.*;

/**
 * Write a method that takes an object and recursively prints all the classes in
 * that object’s hierarchy.
 */
public class Exercise8 {
    static void hierarchy(Class<?> type) {
        if (type == null)
            return;
        print(type.getName());
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