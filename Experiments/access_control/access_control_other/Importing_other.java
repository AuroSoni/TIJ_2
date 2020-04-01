package access_control_other;

import access_control.PackageAccess;

public class Importing_other{
    public static void main(String[] args) {
        PackageAccess.main(args);
        access_control.access.Importing.main(args);
        int i=new PackageAccess().public_pa;
        new PackageAccess().pr("Dangling obj reference   "+ i);
    }
}