package access_control.access;

import access_control.PackageAccess;

public class Importing{
    public static void main(String[] args) {
        //! access_control.PrintSupport.print(" Not Visible");
        PackageAccess pa=new PackageAccess();
        //pa.ps.print(" still not visible! ");
        //! pa.ps.pr("Not yet Visible ");
        pa.pr("Now its visible");
    }
}

class Support1{
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