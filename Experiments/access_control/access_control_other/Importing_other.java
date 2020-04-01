package access_control_other;

import access_control.PackageAccess;
//! import static static_access.*;
//! import static static_access.StaticImport;
//! import static static_access.StaticImport.*;
import static static_access.StaticImport.hello2;

public class Importing_other{
    public static void main(String[] args) {
        PackageAccess.main(args);
        access_control.access.Importing.main(args);
        int i=new PackageAccess().public_pa;
        new PackageAccess().pr("Dangling obj reference   "+ i);
        //! hello();
        hello2();
    }
}