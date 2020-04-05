package experiments;

class Bowl {
    Bowl(int marker) {     
        System.out.println("Bowl(" + marker + ")");   //3: Bowl(1) printed , 5: Bowl(2) printed. 
    }   
    void f1(int marker) {     
        System.out.println("f1(" + marker + ")");     //7: Prints f1(1).
    } 
} 
 
class Table {   
    static Bowl bowl1 = new Bowl(1);                  //2: Bowl() called with 1. Init other static fields also.
    Table() {                                         //6: Prints table(). f1(1)called.
        System.out.println("Table()");     
        bowl2.f1(1);   
    }   
    void f2(int marker) {     
        System.out.println("f2(" + marker + ")");   
    }   
    static Bowl bowl2 = new Bowl(2);                 //4: Bowl called with 2. Static init done. Call constructor.
} 
 
class Cupboard {   
    Bowl bowl3 = new Bowl(3);                       //11: Prints Bowl(3). Non- static done too. Call constructor. 
    static Bowl bowl4 = new Bowl(4);                //9: Prints Bowl(4).
    Cupboard() {                                    //12: Prints Cupboard(). Prints f1(2).
        System.out.println("Cupboard()");     
        bowl4.f1(2);   
    }   
    void f3(int marker) {     
        System.out.println("f3(" + marker + ")");   
    }   
    static Bowl bowl5 = new Bowl(5);                //10: Prints Bowl(5). Static done. Now initialize non static fields.
} 
 
public class init {   
    public static void main(String[] args) {     
        System.out.println("Creating new Cupboard() in main");    //13. Static init done. Resumes method. 
        new Cupboard();                                           //Only non static mem are init again. Then constructor is called.
        System.out.println("Creating new Cupboard() in main");    //And so on.. 
        new Cupboard();     
        table.f2(1);     
        cupboard.f3(1);   
    }   
    static Table table = new Table();               //1st initialization. Returns here after 7.
    static Cupboard cupboard = new Cupboard();      //8: Go to cupboard.
}
