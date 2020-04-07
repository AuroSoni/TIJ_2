package tij2_ch10.tij2_ch10_main;
import static custom_tools.tools.print.Print.print;

import tij2_ch10.tij2_ch10.Exercise5;
import tij2_ch10.tij2_ch10.ex1.Exercise1;
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
    }
}

class Ex5 implements Exercise5{
    @Override
	public String toString(){
        return "Implements\t"+Exercise5.ID;
    }
}