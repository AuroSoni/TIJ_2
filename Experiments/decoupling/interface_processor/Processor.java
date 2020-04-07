package experiments.decoupling.interface_processor;

/**
 * Implementing the processor as an interface allows for more code reusability.
 * Uses:
 * The user who already knows the existence of {@link Processor}:
 * He would create an implementation of the name and process by overring them and then 
 * extending the implementation to several derived classes so as to utilise polymorphism.
 * Why not just create several implementations of {@link Processor} and override them to 
 * utilise polymorphism ? It could have been done. But here the former is more appropriate.
 * 
 * The User who has just discovered this library and wants to utilise {@link Processor}:
 * He would first have to create an apdapter for his class(using delegation) that implements 
 * the proccesor interface.
 * 
 * @see experiments.decoupling.interface_processor.StringProcessor
 * @see experiments.decoupling.interface_processor.FilterAdapter
 * @see experiments.decoupling.interface_processor.Apply
 */
public interface Processor {   
    String name();   
    Object process(Object input); 
}
