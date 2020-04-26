package tij2_ch14.tij2_ch14.ex17;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static custom_tools.print.Print.*;
import custom_tools.myio.TextFile;

/**
 * Write a program that reads a Java source-code file (you provide the file name
 * on the command line) and displays all the comments.
 * (Ex18)Write a program that reads a Java source-code file (you provide the file name 
 * on the command line) and displays all the string literals in the code.
 */
public class Exercise17 {
    static List<String> files=new ArrayList<>();
    public static final String SINGLELINE_COMMENT_PATTERN="(?m)[;{ ](//.*?)$";
    public static final String MULTILINE_COMMENT_PATTERN="(?s)[.[^\"]](/\\*[.[^\\*]].*?\\*/)";
    public static final String JAVADOC_COMMENT_PATTERN="(?s)(/\\*\\*.*?\\*/)";
    public static final String STRING_LITERAL="(?s)[, \\(=\\+](\".*?\")[,\\); =\\+]";
    String danger=" /* class */ ";

    static void addAll(String path){
        if(new File(path).listFiles()==null){
            files.add(path);
            return;
        }
        for (File file : new File(path).listFiles()) {
            addAll(file.toString());
        }
    }
    public static void main(String[] args) {
        addAll("tij2_ch14\\tij2_ch14\\ex17\\Exercise17.java");   //This is a comment./*  */
        for (String path : files) {
            displayComments(path/* */);
        }
    }
    /*
    Multi-line comment
    */
    private static void displayComments(String filepath) {
        print("\n\n"+filepath+" : \n");
        String file=TextFile.read(filepath);
        Scanner scan=new Scanner(file);
        while (scan.hasNextLine()) {
            print(scan.nextLine());
        }
        scan.close();

        Matcher m=Pattern.compile(SINGLELINE_COMMENT_PATTERN).matcher(file);
        print("\nSingle-line comments : ");
        while(m.find()){
            print(m.group(1));
        }
        m=Pattern.compile(MULTILINE_COMMENT_PATTERN).matcher(file);
        print("\nMulti-line comments : ");
        while (m.find()) {
            print(m.group(1));
        }
        m=Pattern.compile(JAVADOC_COMMENT_PATTERN).matcher(file);
        print("\nJavadoc comments : ");
        while (m.find()) {
            print(m.group());
        }
        m=Pattern.compile(STRING_LITERAL).matcher(file);
        print("\nString Literals : ");
        while (m.find()) {
            print(m.group(1));
        }
    }
}