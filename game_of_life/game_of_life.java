package game_of_life;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class game_of_life {

    static LinkedList<Integer> live_h_pos = new LinkedList<>();
    static LinkedList<Integer> live_v_pos = new LinkedList<>();
    static LinkedList<Integer> new_live_h_pos = new LinkedList<>();
    static LinkedList<Integer> new_live_v_pos = new LinkedList<>();
    static FileWriter fw;
    static long clock = 0;
    static int total_h_trace = 1408;
    static int h_sync_trace = 192;
    static int v_sync_trace = 1312;
    static int double_back_porch_x = 48*2;
    static int back_porch_y = 33;
    static int pixel_display_trace = 1280;
    static int frames = 8;
    static int h_max=160;
    static int v_max = 120;
    static int current_x = 0;
    static int current_y = 0;

    public static void seed_pulsar(){
        /*
            Seed the initial state for pulsar
        */
        live_v_pos.add(53); live_h_pos.add(75);
        live_v_pos.add(53); live_h_pos.add(76);
        live_v_pos.add(53); live_h_pos.add(82);
        live_v_pos.add(53); live_h_pos.add(83);

        live_v_pos.add(54); live_h_pos.add(76);
        live_v_pos.add(54); live_h_pos.add(77);
        live_v_pos.add(54); live_h_pos.add(81);
        live_v_pos.add(54); live_h_pos.add(82);

        live_v_pos.add(55); live_h_pos.add(73);
        live_v_pos.add(55); live_h_pos.add(76);
        live_v_pos.add(55); live_h_pos.add(78);
        live_v_pos.add(55); live_h_pos.add(80);
        live_v_pos.add(55); live_h_pos.add(82);
        live_v_pos.add(55); live_h_pos.add(85);

        live_v_pos.add(56); live_h_pos.add(73);
        live_v_pos.add(56); live_h_pos.add(74);
        live_v_pos.add(56); live_h_pos.add(75);
        live_v_pos.add(56); live_h_pos.add(77);
        live_v_pos.add(56); live_h_pos.add(78);
        live_v_pos.add(56); live_h_pos.add(80);
        live_v_pos.add(56); live_h_pos.add(81);
        live_v_pos.add(56); live_h_pos.add(83);
        live_v_pos.add(56); live_h_pos.add(84);
        live_v_pos.add(56); live_h_pos.add(85);

        live_v_pos.add(57); live_h_pos.add(74);
        live_v_pos.add(57); live_h_pos.add(76);
        live_v_pos.add(57); live_h_pos.add(78);
        live_v_pos.add(57); live_h_pos.add(80);
        live_v_pos.add(57); live_h_pos.add(82);
        live_v_pos.add(57); live_h_pos.add(84);

        live_v_pos.add(58); live_h_pos.add(75);
        live_v_pos.add(58); live_h_pos.add(76);
        live_v_pos.add(58); live_h_pos.add(77);
        live_v_pos.add(58); live_h_pos.add(81);
        live_v_pos.add(58); live_h_pos.add(82);
        live_v_pos.add(58); live_h_pos.add(83);

        live_v_pos.add(60); live_h_pos.add(75);
        live_v_pos.add(60); live_h_pos.add(76);
        live_v_pos.add(60); live_h_pos.add(77);
        live_v_pos.add(60); live_h_pos.add(81);
        live_v_pos.add(60); live_h_pos.add(82);
        live_v_pos.add(60); live_h_pos.add(83);

        live_v_pos.add(61); live_h_pos.add(74);
        live_v_pos.add(61); live_h_pos.add(76);
        live_v_pos.add(61); live_h_pos.add(78);
        live_v_pos.add(61); live_h_pos.add(80);
        live_v_pos.add(61); live_h_pos.add(82);
        live_v_pos.add(61); live_h_pos.add(84);

        live_v_pos.add(62); live_h_pos.add(73);
        live_v_pos.add(62); live_h_pos.add(74);
        live_v_pos.add(62); live_h_pos.add(75);
        live_v_pos.add(62); live_h_pos.add(77);
        live_v_pos.add(62); live_h_pos.add(78);
        live_v_pos.add(62); live_h_pos.add(80);
        live_v_pos.add(62); live_h_pos.add(81);
        live_v_pos.add(62); live_h_pos.add(83);
        live_v_pos.add(62); live_h_pos.add(84);
        live_v_pos.add(62); live_h_pos.add(85);

        live_v_pos.add(63); live_h_pos.add(73);
        live_v_pos.add(63); live_h_pos.add(76);
        live_v_pos.add(63); live_h_pos.add(78);
        live_v_pos.add(63); live_h_pos.add(80);
        live_v_pos.add(63); live_h_pos.add(82);
        live_v_pos.add(63); live_h_pos.add(85);

        live_v_pos.add(64); live_h_pos.add(76);
        live_v_pos.add(64); live_h_pos.add(77);
        live_v_pos.add(64); live_h_pos.add(81);
        live_v_pos.add(64); live_h_pos.add(82);

        live_v_pos.add(65); live_h_pos.add(75);
        live_v_pos.add(65); live_h_pos.add(76);
        live_v_pos.add(65); live_h_pos.add(82);
        live_v_pos.add(65); live_h_pos.add(83);
    }

    public static void seed_blinker(){
        /*
        * Seed the  initial state for blinker
        */
        live_h_pos.add(78);
        live_v_pos.add(59);

        live_h_pos.add(79);
        live_v_pos.add(59);
        
        live_h_pos.add(80);
        live_v_pos.add(59);
    }

    public static void seed_bee_hive(){
        /*
            Seed the initial state for bee-hive
        */
        live_h_pos.add(79);
        live_v_pos.add(58);

        live_h_pos.add(80);
        live_v_pos.add(58);

        live_h_pos.add(78);
        live_v_pos.add(59);

        live_h_pos.add(81);
        live_v_pos.add(59);

        live_h_pos.add(79);
        live_v_pos.add(60);

        live_h_pos.add(80);
        live_v_pos.add(60);
    }

    public static void initialize() throws IOException {
        try {
            fw=new FileWriter("C:\\Users\\aurok\\OneDrive\\Documents\\EE Project\\VGA_input.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        seed_pulsar();

        //seed the initial file
        clock = -10;

        //unknown for 2 lines
        for(int i = 0; i< 2 ; i++){
            clock += 20;
            fw.write(clock+" ns: U U UUU UUU UU\n");
        }

        //nb for 52 lines
        for(int i=0; i<52; i++){
            clock += 20;
            fw.write(clock+" ns: 1 1 000 000 00\n");
        }

        h_blanking();

        //9 nothing lines
        for(int i= 0; i<9; i++){
            nothing_lines();
        }
    }

    public static void nothing_lines() throws IOException {

        //nb for 1408 lines
        for(int i=0; i < total_h_trace; i++){
            clock+=20;
            fw.write(clock+" ns: 1 1 000 000 00\n");
        }

        h_blanking();

    }

    public static boolean check_pos_status(int x, int y){
        boolean alive = false;
        int index = 0;
        
        for (Integer y_pos : live_v_pos) {

            if(y_pos == y){

                if(live_h_pos.get(index) == x) {
        
                    alive = true;
                    break;

                }
            }
        
            index++;
        }
        return alive;
    }

    public static void display_frame() throws IOException {
        
        current_y = 0;
        //32 nothing lines
        for(int i=0; i<32;i++){
            nothing_lines();
        }

        //480 h-lines to be displayed
        for(int i=0; i<(v_max*4); i++){
            display_lines();
            h_blanking();
            current_y++;
        }

        //10 nothing lines
        for(int i=0; i<10;i++){
            nothing_lines();
        }
    }

    public static void display_lines() throws IOException {
        
        current_x = 0;

        //96 nb lines
        for(int i=0; i<double_back_porch_x; i++){
            clock += 20;
            fw.write(clock+" ns: 1 1 000 000 00\n");
        }

        //1280 displayable lines
        for(int i=0; i<(h_max*4*2);i++){
            if(check_pos_status((int)Math.floor(current_x/8.0), (int)Math.floor(current_y/4.0))){
                clock += 20;
                fw.write(clock+" ns: 1 1 111 111 00\n");
            }
            else{
                clock += 20;
                fw.write(clock+" ns: 1 1 000 000 00\n");
            }
            current_x++;
        }

        //32 nb lines
        for(int i=0; i<32; i++){
            clock += 20;
            fw.write(clock+" ns: 1 1 000 000 00\n");
        }

    }

    public static void h_blanking() throws IOException {
        
        //h_sync for 192 lines
        for(int i = 0;i<h_sync_trace; i++){
            clock += 20;
            fw.write(clock+" ns: 0 1 000 000 00\n");
        }
    }

    public static void v_blanking() throws IOException {
        
        //nb for 96 lines
        for(int i=0; i<double_back_porch_x; i++){
            clock += 20;
            fw.write(clock+" ns: 1 1 000 000 00\n");
        }

        //v_sync for 1312 lines
        for(int i=0; i<v_sync_trace; i++){
            clock += 20;
            fw.write(clock+" ns: 1 0 000 000 00\n");
        }

        //total_blanking for 192 lines
        for(int i=0; i<h_sync_trace; i++){
            clock += 20;
            fw.write(clock+" ns: 0 0 000 000 00\n");
        }

        //v_sync for 1408 lines
        for(int i=0; i<total_h_trace; i++){
            clock += 20;
            fw.write(clock+" ns: 1 0 000 000 00\n");
        }

        //total_blanking for 192 lines
        for(int i=0; i<h_sync_trace; i++){
            clock += 20;
            fw.write(clock+" ns: 0 0 000 000 00\n");
        }

        //v_sync for 96 lines
        for(int i=0; i<double_back_porch_x; i++){
            clock += 20;
            fw.write(clock+" ns: 1 0 000 000 00\n");
        }

        //nb for 1312 lines
        for(int i=0; i<v_sync_trace; i++){
            clock += 20;
            fw.write(clock+" ns: 1 1 000 000 00\n");
        }

        h_blanking();

    }

    public static void generate_new_frame(){


        // live_h_pos.add(79);
        // live_v_pos.add(58);

        // live_h_pos.add(79);
        // live_v_pos.add(59);
        
        // live_h_pos.add(79);
        // live_v_pos.add(60);

        for(int index=0; index< live_h_pos.size(); index++){
            int x = live_h_pos.get(index);
            int y = live_v_pos.get(index);

            int neighbours = 0;

            //first check if the live cells survive to the next generation.
            neighbours = check_neighbours(x,y);
            if((neighbours==2)||(neighbours==3)){
                new_live_h_pos.add(x);
                new_live_v_pos.add(y);
            }

            //check if the dead neighbours of live cells become alive in next generation.
            for(int j = (y-1); j<= (y+1); j++){
                for(int i=(x-1); i<= (x+1); i++){
                    if(!check_pos_status(i, j)){
                        neighbours = check_neighbours(i, j);
                        if(neighbours==3){
                            new_live_h_pos.add(i);
                            new_live_v_pos.add(j);
                        }
                    }
                }
            }
        }

        //copy the new live positions into live_h_pos and live_v_pos and clear the new postion lists
        live_h_pos.clear();
        live_v_pos.clear();

        for(int index=0; index< new_live_h_pos.size(); index++){
            live_h_pos.add(new_live_h_pos.get(index));
            live_v_pos.add(new_live_v_pos.get(index));
        }

        new_live_h_pos.clear();
        new_live_v_pos.clear();
        
    }

    public static int check_neighbours(int x, int y){
        int neighbours = 0;
        for(int j=(y-1); j<= (y+1); j++){
            for(int i = (x-1); i <= (x+1); i++){
                if((i==x)&&(j==y)){
                    continue;
                }
                if(check_pos_status(i, j)){
                    neighbours++;
                }
            }
        }
        return neighbours;
    }

    public static void main(String[] args) throws IOException {
        
        initialize();
        v_blanking();

        for(int i=0; i< frames; i++){
            display_frame();        //writes to VGA_input.txt

            System.out.println("Writing frame "+i);

            v_blanking();           //updates frame also       //writes to VGA_input.txt
            
            generate_new_frame();
        }

        try {
            fw.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}

