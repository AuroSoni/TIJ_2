package tij2_ch8.ex7;

class A{
    int ano;
    A(int a){
        ano=a;
        System.out.println("Hi, its A no. "+ano);
    }
    
    public String toString() {
        return Integer.toString(ano);
    }
}

class B{
    int bno;
    B(int b){
        bno=b;
        System.out.println("Hi, its B no. "+bno);
    }

    public String toString(){
        return Integer.toString(bno);
    }
}

/**
 * Modify Exercise 5 so that A and B have constructors with arguments 
 * instead of default constructors. 
 * Write a constructor for C and perform all initialization within C’s constructor.
 */
public class Exercise7 extends A{
    B b;
    public Exercise7(int an,int bn){
        super(an);
        b=new B(bn);
    }
    public String toString(){
        return "A: "+super.toString()+"\nB: "+b.toString();
    }
}