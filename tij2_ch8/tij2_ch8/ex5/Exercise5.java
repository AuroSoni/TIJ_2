package tij2_ch8.ex5;

class A{
    A(){
        System.out.println("Hi, its A");
    }
}

class B{
    B(){
        System.out.println("Hi, its B");
    }
}

/**
 * Create two classes, A and B, with default constructors (empty argument lists) 
 * that announce themselves. Inherit a new class called C from A, 
 * and create a member of class B inside C. Do not create a constructor for C. 
 * Create an object of class C and observe the results. 
 */
public class Exercise5 extends A{
    B b=new B();
}