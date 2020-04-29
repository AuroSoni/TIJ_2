package experiments.pet_records;

import java.util.List;

/**
 * A facade for PetCreator that defaults to LiteralPetCreator.
 */
public class Pets {
    static PetCreator pCreator=new LiteralPetCreator();

    public static Pet randomPet(){
        return pCreator.ramdomPet();
    }

    public static List<? extends Pet> createArray(int size){
        return pCreator.createArray(size);
    }

    public static List<? extends Pet> arrayList(){
        return createArray(20);
    }
}