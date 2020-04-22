package tij2_ch14.tij2_ch14.ex10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static custom_tools.print.Print.*;

/**
 * For the phrase "Java now has regular expressions" evaluate whether the following expressions will find a match:  
 * "^Java" "\Breg.*" "n.w\s+h(a|i)s" "s?" "s*" "s+" "s{4}" "S{1}." "s{0,3}".
 */
public class Exercise10 {
    public static void main(String[] args) {
        String[] strings={"Java now has regular expressions","^Java","\\Breg.*","n.w\\s+h(a|i)s","s?","s+","s{4}.","s{0,3}"};
        for (String string : strings) {
            Pattern p=Pattern.compile(string);
            Matcher m=p.matcher(strings[0]);
            print("Regular Expression : "+string);
            while (m.find()) {
                print("Matches : ["+m.group()+"] ("+m.start()+","+(m.end()-1)+"). ");
            }
        }
    }
}