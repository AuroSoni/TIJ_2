package tij2_ch14.tij2_ch14.ex6;

import static custom_tools.print.Print.*;

class Sample{
    int i=0;
    long l=0;
    float f=0;
    double d=0;
    Sample(){}
    Sample(int Int,long Long,float Float,double Double){
        i=Int;
        l=Long;
        f=Float;
        d=Double;
    }
    public static String FIELD="%-6s : ";
    public static String FORMAT=String.format(FIELD, "Int")+"%-5d\n"
                                +String.format(FIELD, "Long")+"%-10d\n"
                                +String.format(FIELD, "Float")+"%-5.3f\n"
                                +String.format(FIELD, "Double")+"%-10.5f";
    public String toString(){
        StringBuilder sBuilder=new StringBuilder();
        sBuilder.append(String.format(FORMAT,i,l,f,d));
        return sBuilder.toString();
    }
}

/**
 * Create a class that contains int, long, float and double fields. 
 * Create a toString( ) method for this class that uses String.format( ), 
 * and demonstrate that your class works correctly. 
 */
public class Exercise6 {
    public static void main(String[] args) {
        print(new Sample(13,12324234l,14.34234f,54435.4534533));
    }
}