package tij2_ch12.tij2_ch12.ex5;
import static custom_tools.print.Print.print;
import java.util.*;

/**
 * Modify ListFeatures.java so that it uses Integers (remember autoboxing!) instead of Pets, and explain any difference in results.
 */
public class Exercise5 {
    public static void main(String[] args) {     
        Random rand = new Random(47);     
        List<Integer> ints = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));     
        print("1: " + ints);     
        Integer h = Integer.valueOf(10);
        ints.add(h); 
        // Automatically resizes     
        print("2: " + ints);     
        print("3: " + ints.contains(h));     
        ints.remove(h); 
        // Remove by object     
        Integer p = ints.get(2);     
        print("4: " +  p + " " + ints.indexOf(p));     
        Integer cymric = Integer.valueOf(100);     
        print("5: " + ints.indexOf(cymric));     
        print("6: " + ints.remove(cymric));     
        // Must be the exact object:     
        print("7: " + ints.remove(p));     
        print("8: " + ints);     
        ints.add(3, Integer.valueOf(20));
        // Insert at an index 
        print("9: " + ints);     
        List<Integer> sub = ints.subList(1, 4);     
        print("subList: " + sub);     
        print("10: " + ints.containsAll(sub));     
        Collections.sort(sub); // In-place sort     
        print("sorted subList: " + sub);     
        // Order is not important in containsAll():     
        print("11: " + ints.containsAll(sub));     
        Collections.shuffle(sub, rand); 
        // Mix it up     
        print("shuffled subList: " + sub);     
        print("12: " + ints.containsAll(sub));     
        List<Integer> copy = new ArrayList<Integer>(ints);     
        sub = Arrays.asList(ints.get(1), ints.get(4));     
        print("sub: " + sub);     copy.retainAll(sub);     
        print("13: " + copy);     
        copy = new ArrayList<Integer>(ints); 
        // Get a fresh copy     
        copy.remove(2); // Remove by index     
        print("14: " + copy);     
        copy.removeAll(sub); // Only removes exact objects     
        print("15: " + copy);     
        copy.set(1, Integer.valueOf(5)); 
        // Replace an element     
        print("16: " + copy);     
        copy.addAll(2, sub); 
        // Insert a list in the middle     
        print("17: " + copy);     
        print("18: " + ints.isEmpty());     
        ints.clear(); // Remove all elements     
        print("19: " + ints);     
        print("20: " + ints.isEmpty());     
        ints.addAll(new ArrayList<>(Arrays.asList(1,2,3,4,5)));     
        print("21: " + ints);     
        Object[] o = ints.toArray();     
        print("22: " + o[3]);     
        Integer[] pa = ints.toArray(new Integer[0]);     
        print("23: " + pa[3]);   
    } 
}