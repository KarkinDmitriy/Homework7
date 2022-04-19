package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;

    }
    public boolean decreaseFood (int n){
        if ( n >food) return false;
        food-=n;
         return true;

    }
    //public boolean amountFood (int food) {
       // if (food == 0 || food< 0) return false;
       // return true;


    public void info(){
        System.out.println("plate: " + food);
    }
}
