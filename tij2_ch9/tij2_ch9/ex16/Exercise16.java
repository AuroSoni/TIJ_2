package tij2_ch9.tij2_ch9.ex16;
import static custom_tools.tools.print.Print.print;

enum Alert_Level{
    COMMON,URGENT,FATAL;
}

class Alert{

}
class Alert_common extends Alert{
    public String toString(){
        return "Common Alert";
    }
}

class Alert_urgent extends Alert{
    public String toString(){
        return "Urgent Alert";
    }
}

class Alert_fatal extends Alert{
    public String toString(){
        return "Fatal Alert";
    }
}

class AlertStatus{
    private Alert alert=new Alert_common();
    public void change(Alert_Level l){
        switch(l){
            case COMMON:
                alert=new Alert_common();
            case FATAL:
                alert=new Alert_fatal();
                break;
            case URGENT:
                alert=new Alert_urgent();
                break;
            default:
                print("Impossible!!!");
                break;
        }
    }
    public void getAlert(){
        print(alert);
    }
}
/**
 * Following the example in Transmogrify.java, 
 * create a Starship class(aka Exercise16) containing an AlertStatus reference 
 * that can indicate three different states. 
 * Include methods to change the states. 
 */
public class Exercise16 {
    public static void main(String[] args) {
        AlertStatus alertStatus = new AlertStatus();
        alertStatus.getAlert();
        alertStatus.change(Alert_Level.URGENT);
        alertStatus.getAlert();
        alertStatus.change(Alert_Level.FATAL);
        alertStatus.getAlert();
    }
}