package tij2_ch3_main;

import tij2_ch3.EverythingIsAnObject;
import tij2_ch3.EverythingIsAnObject.Exercise1;

class EverythingIsAnObject_main {
    public static void main(String[] args) {
        EverythingIsAnObject ex=new EverythingIsAnObject();

        System.out.println("Running Exercise 1 : ");
        Exercise1 ex1=ex.c1();
        System.out.println("Default int : "+ex1.i);
        System.out.println("Default char : "+ex1.c);
    }
}