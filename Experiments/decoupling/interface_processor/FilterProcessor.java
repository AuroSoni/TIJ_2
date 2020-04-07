package experiments.decoupling.interface_processor;
import experiments.decoupling.filters.*;

/**
 * Here filter Adapter implements the Processor interface by overrding the name() and process() 
 * methods to return filter.name() and filter.process(). This class is also an example of delegation.
 * Now the derived classes of filter can use these methods polymorphically as shown in main().
 * @see experiments.decoupling.Processor
 * @see experiments.decoupling.interface_processor.Processor
 * @see experiments.decoupling.interface_processor.StringProcessor
 */
class FilterAdapter implements Processor {
    Filter filter;   
    public FilterAdapter(Filter filter) {     
        this.filter = filter;   
    }   
    public String name() { 
        return filter.name(); 
    }   
    public Waveform process(Object input) {     
        return filter.process((Waveform)input);   
    } 
}  
 
public class FilterProcessor {   
    public static void main(String[] args) {     
        Waveform w = new Waveform();     
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);     
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);     
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);   
    } 
} 