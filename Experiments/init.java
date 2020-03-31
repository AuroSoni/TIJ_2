public class init{
   
    public Dog d;
    public int i;

    public class Dog{
        public int j;
    }

    public static void main(String[] args) {
        print("Calling uninitialised Dog");
        init ini=new init();
        print(""+ini.i);
    }

    private static void print(String string) {
        System.out.println(string);
    }
}