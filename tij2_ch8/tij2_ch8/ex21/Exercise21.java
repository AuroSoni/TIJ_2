package tij2_ch8.tij2_ch8.ex21;
import static tij2_ch8.tij2_ch8.tools.tools.print;

class Base{
    String id="Base";
}

final class Derived extends Base{
    Derived(){
        id+="\t Derived";
    }
}

public class Exercise21 {
    //! class Deriving_from_final extends Derived{}
    public static void main(String[] args) {
        print("Cannot Inherit from final class.");
    }
}