package experiments.application_framework.greenhouse_controls;

import experiments.application_framework.Controller;
import experiments.application_framework.Event;
import static custom_tools.tools.print.Print.*;

public class GreenhouseControls extends Controller {   
    private boolean light = false;   
    public class LightOn extends Event {     
        public LightOn(long delayTime) { 
            super(delayTime); 
        }     
        public void action() {       
            // Put hardware control code here to       
            // physically turn on the light.       
            light = true;     
            print("light : "+light);
        }     
        public String toString() { 
            return "Light is on"; 
        }   
    }    
    public class LightOff extends Event {     
        public LightOff(long delayTime) { 
            super(delayTime); 
        }     
        public void action() {       
            // Put hardware control code here to       
            // physically turn off the light.       
            light = false;   
            print("light : "+light);  
        }     
        public String toString() { 
            return "Light is off"; 
        }   
    }   
    private boolean water = false;   
    public class WaterOn extends Event {     
        public WaterOn(long delayTime) { 
            super(delayTime); 
        }     
        public void action() {       
            // Put hardware control code here.       
            water = true;     
            print("water : "+water);
        }     
        public String toString() {       
            return "Greenhouse water is on";     
        }   
    }    
    public class WaterOff extends Event {     
        public WaterOff(long delayTime) { 
            super(delayTime); 
        }     
        public void action() {       
            // Put hardware control code here.       
            water = false;     
            print("water : "+water);
        }     
        public String toString() {       
            return "Greenhouse water is off";     
        }   
    }   
    private String thermostat = "Day";    
    public class ThermostatNight extends Event {     
        public ThermostatNight(long delayTime) {       
            super(delayTime);     
        }     
        public void action() {       
            // Put hardware control code here.       
            thermostat = "Night";     
            print("thermostat : "+thermostat);
        }     
        public String toString() {       
            return "Thermostat on night setting";     
        }   
    }    
    public class ThermostatDay extends Event {     
        public ThermostatDay(long delayTime) { 
            super(delayTime);     
        }     
        public void action() {       
            // Put hardware control code here.       
            thermostat = "Day";     
            print("thermostat : "+thermostat);
        }     
        public String toString() {       
            return "Thermostat on day setting";     
        }   
    }   
    // An example of an action() that inserts a   
    // new one of itself into the event list:   
    public class Bell extends Event {     
        public Bell(long delayTime) { 
            super(delayTime); 
        }     
        public void action() {       
            addEvent(new Bell(delayTime));     
        }     
        public String toString() { 
            return "Bing!"; 
        }   
    }    
    public class Restart extends Event {     
        private Event[] eventList;     
        public Restart(long delayTime, Event[] eventList) {       
            super(delayTime);       
            this.eventList = eventList;       
            for(Event e : eventList)         
            addEvent(e);     
        }     
        public void action() {       
            for(Event e : eventList) {         
                e.start(); 
                // Rerun each event         
                addEvent(e);       
            }       
            start(); 
            // Rerun this Event       
            addEvent(this);     
        }     
        public String toString() {       
            return "Restarting system";     
        }   
    }    
    public static class Terminate extends Event {     
        public Terminate(long delayTime) { 
            super(delayTime); 
        }     
        public void action() { 
            System.exit(0); 
        }     
        public String toString() { 
            return "Terminating";  
        }   
    } 
} 