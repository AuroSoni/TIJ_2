package tij2_ch10.tij2_ch10_main;
import static custom_tools.tools.print.Print.print;

import tij2_ch10.tij2_ch10.ex5.Exercise5;
import tij2_ch10.tij2_ch10.ex7.Exercise7;
import tij2_ch10.tij2_ch10.ex9.Exercise9;
import tij2_ch10.tij2_ch10.ex1.Exercise1;
import tij2_ch10.tij2_ch10.ex11.Exercise11;
import tij2_ch10.tij2_ch10.ex4.Exercise4;

public class Interfaces {
    public static void main(String[] args) {
        print("Running Exerrcise 1 : ");
        Exercise1.main(args);

        print("\nExercise2 done through 1.");

        print("\nRunning Exerrcise 4 : ");
        Exercise4.main(args);

        print("\nRunning Exerrcise 5 and 6 : ");
        Exercise5 ex5=new Ex5();
        print(ex5.toString());
        print(Exercise5.ID);

        print("\nRunning Exerrcise 7 : ");
        Exercise7.main(args);

        print("\nRunning Exerrcise 9 and 10 : ");
        Exercise9.main(args);

        print("\nRunning Machaxx Exerrcise 11 : ");
        Exercise11.main(args);
    }
}

class Ex5 implements Exercise5{
    @Override
	public String toString(){
        return "Implements\t"+Exercise5.ID;
    }
}