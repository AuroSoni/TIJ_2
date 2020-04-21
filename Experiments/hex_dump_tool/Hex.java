package experiments.hex_dump_tool;

import java.io.File;

import custom_tools.myio.BinaryFile;

public class Hex {
    public static String format(byte[] data) {     
        StringBuilder result = new StringBuilder();     
        int n = 0;     
        for(byte b : data) {       
            if(n % 16 == 0) result.append(String.format("%05X: ", n));       
            result.append(String.format("%02X ", b));       
            n++;       
            if(n % 16 == 0) result.append("\n");     
        }     
        result.append("\n");     
        return result.toString();   
    }   
    public static void main(String[] args) throws Exception {     
        if(args.length == 0)       
        // Test by displaying this class file:       
        System.out.println(format(BinaryFile.read("experiments\\hex_dump_tool\\Hex.class")));     
        else       
        System.out.println(format(BinaryFile.read(new File(args[0]))));   
    } 
}