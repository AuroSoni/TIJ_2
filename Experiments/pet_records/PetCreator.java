package experiments.pet_records;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static custom_tools.print.Print.*;

public abstract class PetCreator {
    public abstract List<Class<? extends Pet>> types();

    public Pet ramdomPet() {
        Random rand = new Random();
        try {
            Pet p = (Pet) types().get(rand.nextInt(types().size())).getDeclaredConstructor().newInstance();
            return p;
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            print(e);
            throw new RuntimeException(e);
        }
    }
    public List<? extends Pet> createArray(int size){
        List<Pet> pets=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            pets.add(ramdomPet());
        }
        return pets;
    }
    public List<? extends Pet> arrayList(int size){
        return createArray(20);
    }
}