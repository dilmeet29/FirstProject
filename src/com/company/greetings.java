package com.company;

public class greetings {
    public static void main(String[] args) {
       double i= calculateInterest(1000,4, 3.5);
        System.out.println(i);
       String g = generateGreeting("EN", "DILMEET");
        System.out.println(g);
    }
    public static double calculateInterest(double p, int t, double roi)
    {
        return p*t*roi/100;
    }
    public static String generateGreeting(String lang , String name){
        if (lang == "EN"){
            return "Hello " +name;
        } else
            if (lang == "ES"){
                return "HOLA " + name;
            }
            else {
                return "HI " +name;
            }
    }
}
