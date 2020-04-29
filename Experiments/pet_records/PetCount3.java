package experiments.pet_records;

import java.util.LinkedHashMap;
import java.util.Map;
import static custom_tools.print.Print.*;
import custom_tools.map_utility.MapData;

public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>,Integer>{

        /**
         *
         */
        private static final long serialVersionUID = 1L;

        PetCounter(){
            super((MapData.map(LiteralPetCreator.allTypes, 0))); 
        }
        public void count(Pet pet){
            for (Map.Entry<Class<? extends Pet>,Integer> pair : entrySet()) {
                if(pair.getKey().isInstance(pet))
                put(pair.getKey(), pair.getValue()+1);
            }
        }

        public String toString(){
            StringBuilder s=new StringBuilder();
            s.append("{");
            for (Map.Entry<Class<? extends Pet>,Integer> entry : entrySet()){
                s.append(entry.getKey());
                s.append(" = ");
                s.append(entry.getValue());
                s.append(" , ");
            }
            s.delete(s.length()-3, s.length());
            s.append("}");
            return s.toString();
        }
    }
    public static void main(String[] args) {
        PetCounter pCounter=new PetCounter();
        for (Pet pet : Pets.arrayList()) {
            pCounter.count(pet);
        }
        print(pCounter);
    }
}