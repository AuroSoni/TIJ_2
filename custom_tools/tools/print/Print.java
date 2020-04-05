package custom_tools.tools.print;

public class Print{
    public static void print(String ...args){
        for (String string : args) {
            System.out.println(string);
        }
    }
    public static void print(Object... args){
        for (Object object : args) {
            System.out.println(object);
        }
    }
} 