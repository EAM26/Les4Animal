package nl.novi.javaprogrammeren.overerving;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
   private List<Animal> zooAnimals = new ArrayList<>();

    public List<Animal> getZooAnimals() {
        return zooAnimals;
    }

    public void setZooAnimals(List<Animal> zooAnimals) {
        this.zooAnimals = zooAnimals;
    }

    public void addToZoo(Animal animal) {
        if(animal.isZooAnimal() == false) {
            System.out.println(animal.getName() + " is not a zoo animal");
        } else {
            zooAnimals.add(animal);
        }
    }

    public void showZooAnimals() {
        System.out.println("\nThe animals is the Zoo are:");
        for (Animal animal: zooAnimals
             ) {
            System.out.println(animal.getName());
        }
        System.out.println("*********************");
    }


}
