package tij2_ch13.tij2_ch13.ex9;

import static custom_tools.print.Print.*;

class E1 extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 8143357860442501116L;
}

class E2 extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = -1610390163724669391L;
}

class E3 extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = -4623749013081893824L;
}

/**
 * Create three new types of exceptions. Write a class with a method that throws all three. 
 * In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 * (Ex13)Modify Exercise 9 by adding a finally clause. Verify that your finally clause is executed, 
 * even if a NullPointerException is thrown.
 */
public class Exercise9 {
    static int index=0;
    static void muti_thrower() throws E1,E2,E3{
        if (index==0) {
            throw new E1();
        }
        else if(index==1){
            throw new E2();
        }
        else if(index==2){
            throw new E3();
        }
        else{
            print("Multi_thrower");
        }
    }
    public static void main(String[] args) {
        while(true){
            try {
                muti_thrower();
                break;
            } catch (Exception e) {
                print(e.getClass().getSimpleName());
                index++;
                continue;
            }
            finally{           //Outer
                try {
                    throw new NullPointerException();
                } catch (Exception e) {
                    print(e.getClass().getSimpleName());
                }finally{
                    print("in Inner");
                }
                print("in Outer");
            }
        }
    }
}