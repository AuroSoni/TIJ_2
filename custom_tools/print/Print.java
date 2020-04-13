package custom_tools.print;

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
    public static void printnb(String ...args){
        for (String string : args) {
            System.out.print(string);
        }
    }
    public static void printnb(Object... args){
        for (Object object : args) {
            System.out.print(object);
        }
    }
} 