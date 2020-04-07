package tij2_ch10.tij2_ch10.ex11;
import static custom_tools.tools.print.Print.print;

import experiments.decoupling.interface_processor.Apply;
import experiments.decoupling.interface_processor.Processor;

class MoreDecoupling{

    private static long counter=0;
    protected final long id=counter++;
    public static String Swap(String s){
        char[] swap=s.toCharArray();
        for (int i=0;i<s.length()-1;i+=2) {
            char temp=swap[i];
            swap[i]=swap[i+1];
            swap[i+1]=temp;
        }
        return new String(swap);
    }

    String name(){
        return this.getClass().getSimpleName()+" : "+id;
    }
}

class MoreDecouplingAdapter implements Processor{

    MoreDecoupling md;

    MoreDecouplingAdapter(MoreDecoupling m){
        this.md=m;
    }

    @Override
    public String name() {
        return md.name();
    }

    @Override
    public String process(Object input) {
        return MoreDecoupling.Swap((String)input);
    }

}

/**
 * Create a class with a method that takes a String argument and 
 * produces a result that swaps each pair of characters in that argument. 
 * Adapt the class so that it works with interfaceprocessor.Apply.process( ).
 */
public class Exercise11 {
    public static void main(String[] args) {
        String string=new String("Hello");
        print(MoreDecoupling.Swap(string));

        Apply.process(new MoreDecouplingAdapter(new MoreDecoupling()), "Hello");
    }
}