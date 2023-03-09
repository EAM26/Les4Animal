package nl.novi.javaprogrammeren.overerving;

public class Tigre extends Feline{
    private int cageNum;
    public Tigre(String name, String sex, boolean isZooAnimal, int cageNum) {
        super(name, sex, isZooAnimal);
        this.cageNum = cageNum;
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " the Tigre is sneaking "+ this.getDistance() +" through the forest.");
    }

    @Override
    public void makeSound() {
        System.out.println("The tigre Growllllssss!!");
    }
}
