package experiments.pet_records;

import java.util.ArrayList;
import java.util.List;
import static custom_tools.print.Print.*;

public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    List<String> strings = new ArrayList<>();

    @SuppressWarnings("unchecked")
    static void loader() {
        String[] strings = new String[] { "experiments.pet_records.Pet", "experiments.pet_records.Dog",
                "experiments.pet_records.Mutt", "experiments.pet_records.Pug", "experiments.pet_records.Cat",
                "experiments.pet_records.Minx", "experiments.pet_records.Cymric", "experiments.pet_records.Manx",
                "experiments.pet_records.Rodent", "experiments.pet_records.Rat", "experiments.pet_records.Mouse",
                "experiments.pet_records.Hamster" };
        for (String string : strings) {
            try {
                types.add((Class<? extends Pet>) Class.forName(string));
            } catch (ClassNotFoundException e) {
                print(e);
                throw new RuntimeException(e);
            }
        }
    }
    static{
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

}