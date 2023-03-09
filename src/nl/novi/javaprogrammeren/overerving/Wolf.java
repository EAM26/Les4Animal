package nl.novi.javaprogrammeren.overerving;

public class Wolf extends Canine {
    private int cageNum;
    public Wolf(String name, String sex, boolean isZooAnimal, int cageNum) {
        super(name, sex, isZooAnimal);
        this.cageNum = cageNum;
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " the Wolf is sneaking "+ this.getDistance() +" through the forest.");
    }

    @Override
    public void makeSound() {
        System.out.println("The Wolf is Hoooowwwwlinngggg!!");
    }
}
