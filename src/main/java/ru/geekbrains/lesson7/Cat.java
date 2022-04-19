package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiete;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate){

        if (plate.decreaseFood(appetite)) {
            satiete = true;
            System.out.printf("Cat %s has eaten %d food \n", name, appetite);
        }
        else {
            System.out.printf("The cat %s is hungry \n", name);
        }
    }

}
