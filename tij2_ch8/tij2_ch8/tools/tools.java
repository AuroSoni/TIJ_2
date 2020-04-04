package tij2_ch8.tools;

public class tools {
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