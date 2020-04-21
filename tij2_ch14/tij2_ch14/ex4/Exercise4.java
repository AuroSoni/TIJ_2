package tij2_ch14.tij2_ch14.ex4;

import java.util.Formatter;

/**
 * Modify Exercise4.java(aka Exercise4) so that the widths are all controlled by
 * a single set of constant values. The goal is to allow you to easily change a
 * width by changing a single value in one place.
 */
public class Exercise4 {   
    private double total = 0;   
    private Formatter f = new Formatter(System.out);   
    public static final int ITEM_WIDTH=20;
    public static final int QTY_WIDTH=5;
    public static final int PRICE_WIDTH=10;
    public static final String ITEM_FORMAT="%-"+ITEM_WIDTH+"s %"+QTY_WIDTH+"s %"+PRICE_WIDTH+"s\n";
    public static final String TOTAL_FORMAT="%-"+ITEM_WIDTH+"s %"+QTY_WIDTH+"s %"+PRICE_WIDTH+".2f\n";
    public static final String RECORD_FORMAT="%-"+ITEM_WIDTH+"."+ITEM_WIDTH+"s %"+QTY_WIDTH+"d %"+PRICE_WIDTH+".2f\n";
    public void printTitle() {     
        f.format(ITEM_FORMAT, "Item", "Qty", "Price");     
        f.format(ITEM_FORMAT, "----", "---", "-----");   
    }   
    public void print(String name, int qty, double price) {     
        f.format(RECORD_FORMAT, name, qty, price);     
        total += price;   
    }   
    public void printTotal() {     
        f.format(TOTAL_FORMAT, "Tax", "", total*0.06);     
        f.format(ITEM_FORMAT, "", "", "-----");     
        f.format(TOTAL_FORMAT, "Total", "", total * 1.06);   
    }   
    public static void main(String[] args) {     
        Exercise4 receipt = new Exercise4();     
        receipt.printTitle();     
        receipt.print("Jack’s Magic Beans", 4, 4.25);     
        receipt.print("Princess Peas", 3, 5.1);     
        receipt.print("Three Bears Porridge", 1, 14.29);     
        receipt.printTotal();   
    } 
}