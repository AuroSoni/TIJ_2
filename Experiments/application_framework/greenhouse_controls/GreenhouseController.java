package experiments.application_framework.greenhouse_controls;

import experiments.application_framework.Event;

public class GreenhouseController {
    public static void main(String[] args) {     
        GreenhouseControls gc = new GreenhouseControls();     
        // Instead of hard-wiring, you could parse     
        // configuration information from a text file here:     
        gc.addEvent(gc.new Bell(900));     
        Event[] eventList = {       
            gc.new ThermostatNight(0),       
            gc.new LightOn(200),       
            gc.new LightOff(400),       
            gc.new WaterOn(600),       
            gc.new WaterOff(800),       
            gc.new ThermostatDay(1400)     
        };      
        gc.addEvent(gc.new Restart(2000, eventList));          
        gc.addEvent(new GreenhouseControls.Terminate(4000));     
        gc.run();   
    }
}
