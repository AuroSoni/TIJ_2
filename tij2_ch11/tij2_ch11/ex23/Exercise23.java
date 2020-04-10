package tij2_ch11.tij2_ch11.ex23;
import static custom_tools.tools.print.Print.*;

interface U{
    void A();
    void B();
    void C();
}

class A{
    U genU(){
        return new U(){
        
            @Override
            public void C() {
                printnb("C() ");
            }
        
            @Override
            public void B() {
                printnb("B() ");
            }
        
            @Override
            public void A() {
                printnb("A() ");
            }
        };
    }
}

class B{
    private int i=0;
    private int current=0;
    U[] uArray;
    B(int j){
        i=Integer.valueOf(j);
        uArray=new U[j];
    }
    public void addref(U u){
        if(current<uArray.length)
        uArray[current++]=u;
    }
    public void nullify(int... l){
        for (int j : l) {
            if(j<i)
            uArray[j]=null;
            else
            print("!nullify() : "+j+" out of bounds");
        }
    }
    public void manifest(){
        for(int j=0;j<i;j++){
            if(uArray[j]==null){
                print(j+" : null ");
                continue;
            }
            print(j+" : "+uArray[j]);
            uArray[j].A();
            uArray[j].B();
            uArray[j].C();
            print("\n");
        }
    }
}
/**
 * Create an interface U with three methods.
 * Create a class A with a method that produces a reference to a U by building an anonymous inner class. 
 * Create a second class B that contains an array of U. 
 * B should have one method that accepts and stores a reference to a U in the array, 
 * a second method that sets a reference in the array (specified by the method argument) to null, 
 * and a third method that moves through the array and calls the methods in U. 
 * In main( ), create a group of A objects and a single B. 
 * Fill the B with U references produced by the A objects. 
 * Use the B to call back into all the A objects. Remove some of the U references from the B. 
 */
public class Exercise23 {
    public static void main(String[] args) {
        final int n=10;
        A[] aList=new A[n];
        for (int j=0;j<n;j++){
            aList[j]=new A();
        }
        final B b=new B(n);
        for(int i=0;i<n;i++){
            b.addref(aList[i].genU());
        }
        print("MANIFEST");
        b.manifest();
        print("","NULLIFY");
        b.nullify(2,4,10);
        print("","MANIFEST");
        b.manifest();
    }
}