package com.company;

public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public double calculateVolume()
    {
        return height*width*length;
    }
    public void print()
    {
        System.out.println("length is " +this.length);
        System.out.println("width is "+ this.width);
        System.out.println("height is "+ this.height);
        System.out.println("Dilmeet's change");
<<<<<<< HEAD
        System.out.println("second change");
=======
        System.out.println("Param's change");
>>>>>>> eb5d13122bd1aa5cc650a6616cd2ba061a3e917e
    }


}
