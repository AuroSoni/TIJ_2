package tij2_ch14.tij2_ch14.ex1;

class WaterSource {
    private String s;
    WaterSource() {
      System.out.println("WaterSource()");
      s = "Constructed";
    }
    public String toString() { return s; }
  }	
  
  /**
   * Analyze SprinklerSystem.toString( ) in reusing/SprinklerSystem.java(aka Exercise1) to discover whether writing 
   * the toString( ) with an explicit StringBuilder will save any StringBuilder creations
   */
public class Exercise1 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append("valve1 = ");
        s.append(valve1);
        s.append(" ");
        s.append("valve2 = ");
        s.append(valve2);
        s.append(" ");
        s.append("valve3 = ");
        s.append(valve3);
        s.append(" ");
        s.append("valve4 = ");
        s.append(valve4);
        s.append("\n");
        s.append("i = ");
        s.append(i);
        s.append(" ");
        s.append("f = ");
        s.append(f);
        s.append(" ");
        s.append("source = ");
        s.append(source);
        return s.toString();
    }	
    public static void main(String[] args) {
      Exercise1 sprinklers = new Exercise1();
      System.out.println(sprinklers);
    }
  }