package experiments.pet_records;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {

    static List<Class<? extends Pet>> types;
    public static final List<Class<? extends Pet>> allTypes=Collections.unmodifiableList(Arrays.asList(Pet.class, Dog.class, Mutt.class, Pug.class, Cat.class,
    Minx.class, Cymric.class, Manx.class, Rodent.class, Mouse.class, Rat.class, Hamster.class));;

    LiteralPetCreator() {
        types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}