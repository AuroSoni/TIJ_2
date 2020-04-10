package experiments.application_framework.greenhouse_controls;

import experiments.application_framework.Event;

public class GreenhouseController {
    /**
     * (Ch11)Ex24 : In GreenhouseControls.java, add Event inner classes that turn fans on and off. 
     * Configure GreenhouseController.java to use these new Event objects. 
     * (Ch11)Ex25 : Inherit from GreenhouseControls in GreenhouseControls.java to add Event inner classes
     * that turn water mist generators on and off. Write a new version of GreenhouseController.java 
     * to use these new Event objects. 
     * @param args
     */
    public static void main(String[] args) {     
        GreenhouseControls gc = new GreenhouseControls();     
        // Instead of hard-wiring, you could parse     
        // configuration information from a text file here:     
        gc.addEvent(gc.new Bell(900));     
        Event[] eventList = {       
            gc.new ThermostatNight(0),       
            gc.new LightOn(200),   
            gc.new MistOn(300),
            gc.new FansOn(400),    
            gc.new MistOff(500),
            gc.new LightOff(600),  
            gc.new FansOff(800),     
            gc.new WaterOn(1000),       
            gc.new WaterOff(1200),       
            gc.new ThermostatDay(1400)     
        };      
        gc.addEvent(gc.new Restart(2000, eventList));          
        gc.addEvent(new GreenhouseControls.Terminate(4000));     
        gc.run(); 
    }
}
