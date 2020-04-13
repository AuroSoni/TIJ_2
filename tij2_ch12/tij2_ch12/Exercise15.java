package tij2_ch12.tij2_ch12;

import static custom_tools.print.Print.*;
import custom_tools.stack.Stack;

/**
 * Stacks are often used to evaluate expressions in programming languages. 
 * Using net.mindview.util.Stack(aka custom_tools.Stack), evaluate the following expression, 
 * where’+’ means "push the following letter onto the stack," and’-’ means "pop the top of the stack and print it": 
 * "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"  
 */
public class Exercise15 {
    private static char[] COMMAND="+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—".toCharArray();
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(true){
            try{
                char c=COMMAND[i++];
                switch (c) {
                    default:
                    case '+':
                        stack.push(COMMAND[i++]);
                        break;
                    case '—':
                    case '-':
                        print(stack.pop());
                        break;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                print(stack);
                break;
            }
        }
    }
}