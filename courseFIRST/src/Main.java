import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {

        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal();
        Reptile reptile = new Reptile();
        Animal fish = new Fish();
        Animal birds = new Birds();
        Animal crocodile = new Crocodile();
        Animal eel = new Eel();
        Animal eagle = new Eagle();

        animals.add(animal);
        animals.add(reptile);
        animals.add(fish);
        animals.add(birds);
        animals.add(crocodile);
        animals.add(eel);
        animals.add(eagle);

        listAnimals(animals);
    }
    public static void listAnimals(List<Animal> animals){
        for(Animal animal: animals){
            System.out.println(animal.showInfo());
        }
    }
}
