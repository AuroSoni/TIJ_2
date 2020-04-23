package tij2_ch14.tij2_ch14.ex16;

import java.io.File;
import java.util.*;
import java.util.regex.*;
import custom_tools.myio.TextFile;
import static custom_tools.print.Print.*;

/**
 * Modify JGrep.java(aka Exercise15) to accept a directory name or a file name
 * as argument (if a directory is provided, search should include all files in
 * the directory). Hint: You can generate a list of file names with: 
 * File[] files = new File(".").listFiles();
 */
public class Exercise16 {
    static List<String> files=new ArrayList<>();
    static void addAll(String path){
        if(new File(path).listFiles()==null){
            files.add(path);
            return;
        }
        for (File file : new File(path).listFiles()) {
            addAll(file.toString());
        }
    }
    public static void main(String[] args) throws Exception {     
        if(args.length < 2) {       
            print("Usage: java JGrep file regex");       
            System.exit(0);     
        }     
        Pattern p = Pattern.compile(args[1],Integer.valueOf(args[2]));     
        // Iterate through the lines of the input file:     
        int index = 0;  
        Matcher m = p.matcher("");
        addAll(args[0]);
        for (String file : files) {
            print("\n\n"+file+"  : "+"\n");
            index=0;
            for(String line : new TextFile(file)) {       
                m.reset(line);       
                while(m.find())         
                print(index++ + ": "+m.group() +": " + m.start());     
            }
        }
        print(files);
    }
}