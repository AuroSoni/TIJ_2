package experiments;

public class Varargs {
    static void f(Character... args) {     
        System.out.print(args.getClass());     
        System.out.println(" length " + args.length);   
    }   
    static void g(int... args) {     
        System.out.print(args.getClass());     
        System.out.println(" length " + args.length);   
    }   
    public static void main(String[] args) {  
        f('a',Character.valueOf(' '));     
        f();     
        g(1,2,5);     
        g();
        g((int[])new int[]{1,2});     
        System.out.println("int[]: " + new int[0].getClass());   
    } 
}