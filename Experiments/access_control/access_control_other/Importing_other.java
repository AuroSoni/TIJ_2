package experiments.access_control.access_control_other;

import experiments.access_control.access_control.PackageAccess;
//! import static static_access.*;
//! import static static_access.StaticImport;
//! import static static_access.StaticImport.*;
import static experiments.access_control.static_access.StaticImport.hello2;

public class Importing_other{
    public static void main(String[] args) {
        PackageAccess.main(args);
        experiments.access_control.access_control.access.Importing.main(args);
        int i=new PackageAccess().public_pa;
        new PackageAccess().pr("Dangling obj reference   "+ i);
        //! hello();
        hello2();
    }
}