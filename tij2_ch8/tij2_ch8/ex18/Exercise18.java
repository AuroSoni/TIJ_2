package tij2_ch8.ex18;
import static tij2_ch8.tools.tools.print;

/**
 * Create a class with a static final field and a final field 
 * and demonstrate the difference between the two. 
 */
public class Exercise18 {
    final int v1;
    final static int V_2=15;

    Exercise18(int i){
        v1=i;
    }

    public static void main(String[] args) {
        Exercise18 ex18_1=new Exercise18(10);
        Exercise18 ex18_2=new Exercise18(5);
        print("Exercise18()_1: "+ex18_1.v1+'\t'+V_2,"Exercise18()_2: "+ex18_2.v1+'\t'+V_2);
    }
}