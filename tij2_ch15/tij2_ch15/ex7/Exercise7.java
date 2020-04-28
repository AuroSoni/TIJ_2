package tij2_ch15.tij2_ch15.ex7;

import static custom_tools.print.Print.*;

class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}

/**
 * Modify SweetShop.java so that each type of object creation is controlled by a
 * command-line argument. That is, if your command line is "Java Sweetshop
 * Candy," then only the Candy object is created. Notice how you can control
 * which Class objects are loaded via the commandline argument.
 */
public class Exercise7 {
    public static void main(String[] args) {
        for (String string : args) {
            try {
                Class.forName("tij2_ch15.tij2_ch15.ex7."+string);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}