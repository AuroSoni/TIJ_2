import java.util.*;
class MyFirstJavaProject{
    public static void main(String args[]){
        Exercise1 Obj1=new Exercise1();
        System.out.println("Hello, Aatmaj today is: ");
        System.out.println(new Date());
        System.out.println("default int:" +Exercise1.i);
        System.out.println("default char"+Obj1.c);
    }
} 
class Exercise1{
    char c;
    static int i;
}