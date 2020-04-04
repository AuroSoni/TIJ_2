package tij2_ch8.ex11;

class Cleanser{
    private String s="Cleanser";
    public void append(String a){s+=a;}
    public void dilute(){append("dilute()");}
    public void apply(){append("apply()");}
    public void scrub(){append("scrub()");}
    public String toString(){return s;}
    public static void main(String[] args) {
        Cleanser x=new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
/**
 *  Modify Detergent.java so that it uses delegation
 */
public class Exercise11 {
    private Cleanser cleanser=new Cleanser();
    public void dilute(){cleanser.dilute();}
    public void apply(){cleanser.apply();}
    public void scrub(){
        cleanser.append("Detergent.scrub()");
        cleanser.scrub();
    }
    public void foam(){cleanser.append("foam");}
    public String toString(){return cleanser.toString();}

    public static void main(String[] args) {
        Exercise11 ex11=new Exercise11();
        ex11.dilute();
        ex11.apply();
        ex11.scrub();
        ex11.foam();
        System.out.println(ex11);
        System.out.println("Testing Delegation Base Class:");
        Cleanser.main(args);
    }
}