package nl.novi.javaprogrammeren.overerving;

public class Dog extends Canine{
    private String nameBoss;

    public Dog(String name, String sex, boolean isZooAnimal, String nameBoss) {
        super(name, sex, isZooAnimal);
        this.nameBoss = nameBoss;
    }

    @Override
    public void move() {

    }

    @Override
    public void makeSound() {

    }
}
