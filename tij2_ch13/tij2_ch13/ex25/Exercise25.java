package tij2_ch13.tij2_ch13.ex25;

class Level1 extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
}
class Level2 extends Level1{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
}
class Level3 extends Level2{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
}

class A{
    public void info() throws Level1{
        throw new Level1();
    }
}

class B extends A{
    @Override
    public void info() throws Level1 {
        throw new Level2();
    }
}

class C extends B{
    @Override
    public void info() throws Level2 {
     throw new Level3();   
    }
}

/**
 * Create a three-level hierarchy of exceptions. Now create a base-class A 
 * with a method that throws an exception at the base of your hierarchy. 
 * Inherit B from A and override the method so it throws an exception at level two 
 * of your hierarchy. Repeat by inheriting class C from B. In main( ), create a C 
 * and upcast it to A, then call the method. 
 */
public class Exercise25 {
    public static void DO(A a){
        try {
            a.info();
        } 
        catch (Level3 e) {
            e.printStackTrace();
        } 
        catch(Level2 e){
            e.printStackTrace();
        }
        catch(Level1 e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DO(new C());
        DO(new B());
        DO(new A());
    }
}