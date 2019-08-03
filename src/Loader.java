import Bird.*;
import Bird.Duck;
import Bird.Ostrich;

import java.util.ArrayList;
import java.util.Collections;

public class Loader {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        addAnimals(animals);

        Collections.sort(animals);

        for(Animal animal : animals)
        {
            animal.voice();
        }
    }

    public static void addAnimals(ArrayList<Animal> animals)
    {
        Animal frog1 = new Frog();
        animals.add(frog1);
        Animal duck1 = new Duck();
        animals.add(duck1);
        Animal ostrich1 = new Ostrich();
        animals.add(ostrich1);
        Animal hen1 = new Hen();
        animals.add(hen1);
        Animal sparrow1 = new Sparrow();
        animals.add(sparrow1);
        Animal duck2 = new Duck();
        animals.add(duck2);
        Animal sparrow2 = new Sparrow();
        animals.add(sparrow2);

    }
}
