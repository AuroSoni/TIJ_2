package game_of_life;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class analysing {
    
    static FileWriter fw;
    static int flag = 0;     //0 = nill, 1 = no-blank, 2 = h-blank, 3 = v-blank, 4 = total-blank 
    static int time_begin = 0;
    static int time_end = 0;
    static int iterations = 0;
    

    public static void main(String[] args) {
        int i=0;
        try {
           //fw = new FileWriter("C:\\Users\\aurok\\OneDrive\\Documents\\EE Project\\vga_sim_analysed.txt");
           fw = new FileWriter("C:\\Users\\aurok\\OneDrive\\Documents\\EE Project\\vga_input_analysed.txt");
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\aurok\\OneDrive\\Documents\\EE Project\\VGA_input.txt"));
            String line = reader.readLine();
            String pattern = new String("(\\d+) ns: ([01]) ([01]) (\\d{3}) (\\d{3}) (\\d{2})$");
            Pattern p = Pattern.compile(pattern);
            Matcher m;
            while (line != null) {
                if(i<20){
                    System.out.println(line);
                    i++;
                }
                // read next line
                line = reader.readLine();
                m = p.matcher(line);
                while(m.find()){
                    check(m.group(4),m.group(5),m.group(6),line);
                    update(m.group(1),m.group(2), m.group(3));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void update(String str_time, String str_hs, String str_vs){
        int current_flag = 0;
        int time = Integer.parseInt(str_time);
        int hs = Integer.parseInt(str_hs);
        int vs = Integer.parseInt(str_vs);

        if((hs==1)&&(vs==1))
            current_flag = 1;
        else if ((hs==0)&&(vs==1))
            current_flag = 2;
        else if((hs==1)&&(vs==0))
            current_flag = 3;
        else
            current_flag = 4;
        
        if(current_flag==flag){
            iterations++;
        }
        else{
            time_end = time; 
            try {
                write();
            } catch (IOException e) {
                e.printStackTrace();
            }
            iterations = 0;
            time_begin = time;
            flag = current_flag;
        }
    }

    public static void check(String red, String green, String blue, String line) throws IOException {
        int r = Integer.parseInt(red);
        int g = Integer.parseInt(green);
        int b = Integer.parseInt(blue);
        if((r!=0)||(g!=0)||(b!=0)){
            fw.write("\n\n\n**************Line: "+line+"\n\n\n");
        }
    }

    public static void write() throws IOException {
        if(flag==1){
            fw.write("nb : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations+"\n");
            System.out.println("no-blank period : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations);
        }
        else if(flag==2){
            fw.write("hs : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations+"\n");
            System.out.println("h-sync period : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations);
        }
        else if(flag==3){
            fw.write("V-SYNC PERIOD : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations+"\n\n\n");
            System.out.println("v-sync period : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations);
        }
        else if(flag==4){
            fw.write("TOTAL-BLANK PERIOD : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations+"\n\n");
            System.out.println("total-blank period : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations);
        }
        else{
            fw.write("INIT PERIOD : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations+"\n\n\n");
            System.out.println("init period : "+time_begin+" - "+time_end+" frames = "+((time_end-time_begin)/20)+" = "+iterations);
        }
    }
}
