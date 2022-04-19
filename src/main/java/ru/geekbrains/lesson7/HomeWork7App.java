package ru.geekbrains.lesson7;

public class HomeWork7App {
    public static void main(String[] args) {
        //Cat cat = new Cat("Pushok", 10);
        Cat [] cats = {
            new Cat("Pushok", 20),
            new Cat("Tom", 30)};
        Plate plate = new Plate(20);
        plate.info();
        for (Cat cat :cats) {
            cat.eat(plate);

        }
        plate.info();
    }
}
