package com.company;

public class Car {
    private String carName;
    private String modelName;
    private int year;
    private boolean isRunning = true;

    public Car(String carName, String modelName, int year) {
        this.carName = carName;
        this.modelName = modelName;
        this.year = year;


    }
    public boolean startCar()
    {
        if (!isRunning)
        {
           isRunning = true;
        }

return isRunning;
    }


    public void p(){
        System.out.println("Car name :- " + this.carName);
        System.out.println("Car name :- " + this.modelName);
        System.out.println("Car name :- " + this.year);


    }

}
