package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
    private String name;
    private String sex;
    private boolean isZooAnimal;
    private String distance = "0.25m";


    public Animal(String name, String sex, boolean isZooAnimal) {

        this.name = name;
        this.sex = sex;
        this.isZooAnimal = isZooAnimal;
    }

    public abstract void move();
    public abstract void makeSound();
    public void sleep() {
        System.out.println("Sleeping for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.getName() + " is eating " + food);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isZooAnimal() {
        return isZooAnimal;
    }

    public String getDistance() {
        return distance;
    }
}
