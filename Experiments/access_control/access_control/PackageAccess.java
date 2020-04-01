package access_control;

public class PackageAccess {
    int default_pa;
    public int public_pa;
    protected int protected_pa;
    private int private_pa;
    public PrintSupport ps=new PrintSupport();
    public void pr(String s){
        PrintSupport.print(s);
    }

    public static void hello(){
        System.out.println("Hello! ");
    }

    int get_private(){return private_pa;}
    public PackageAccess(){
        default_pa=0;
        public_pa=1;
        protected_pa=2;
        private_pa=3;
    }

    public static void main(String[] args) {
        PackageAccess pa=new PackageAccess();
        Support1 s1=new Support1();
        PrintSupport.print("default_pa= "+pa.default_pa);
        PrintSupport.print("private_pa= "+pa.private_pa);

        PrintSupport.print("default_pa= "+s1.default_s1);
        PrintSupport.print("default_pa= "+s1.public_s1);
        PrintSupport.print("private_pa= "+s1.protected_s1);
        //! PrintSupport.print("private_pa= "+s1.private_s1);
        PrintSupport.print("default_pa= "+s1.get_private());
    }
}

class Support1 {
    int default_s1;
    public int public_s1;
    protected int protected_s1;
    private int private_s1;
    Support1(){
        default_s1=10;
        public_s1=11;
        protected_s1=12;
        private_s1=13;
    }
    int get_private(){
        return private_s1;
    }
}

class PrintSupport {
    static void print(String s){
        System.out.println(s);
    }

    public void pr(String s){
        print(s);
    }
}