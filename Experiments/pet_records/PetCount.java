package experiments.pet_records;

import java.util.LinkedHashMap;
import static custom_tools.print.Print.*;

public class PetCount {
    static class PetCounter extends LinkedHashMap<String,Integer>{

        /**
         *
         */
        private static final long serialVersionUID = 1L;
        void count(String type){
            Integer n=get(type);
            if(n==null){
                n=1;
            }
            else{
                n++;
            }
            put(type, n);
        }
    }

    public static void countPets(PetCreator pCreator){
        PetCounter pCounter=new PetCounter();
        for (Pet p : pCreator.createArray(20)) {
            print(p.getClass());
            if(p instanceof Pet)pCounter.count("Pet");
            if(p instanceof Dog)pCounter.count("Dog");
            if(p instanceof Mutt)pCounter.count("Mutt");
            if(p instanceof Pug)pCounter.count("Pug");
            if(p instanceof Cat)pCounter.count("Cat");
            if(p instanceof Minx)pCounter.count("Minx");
            if(p instanceof Cymric)pCounter.count("Cymric");
            if(p instanceof Manx)pCounter.count("Manx");
            if(p instanceof Rodent)pCounter.count("Rodent");
            if(p instanceof Mouse)pCounter.count("Mouse");
            if(p instanceof Rat)pCounter.count("Rat");
            if(p instanceof Hamster)pCounter.count("Hamster");
        }
        print(pCounter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}