package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee object = new Employee(125 , "Dilmeet", 19.0, 56.7);
        Employee object2 = new Employee(175 , "Dilmeet 2 ", 19.0, 106.7);
        object.print();
        System.out.println(object.calculateSalary());

        object2.print();
        System.out.println(object2.calculateSalary());

        Car a = new Car("Honda ", "civic - ex", 2019);
        a.p();
        System.out.println(a.startCar());
        System.out.println(a.startCar());


        Box b = new Box(15.0, 20.0 , 25.0);
        b.print();
        System.out.println(b.calculateVolume());

    }
}
