package com.automobile.fourwheeler;

public class TestFourWheeler {

    public static void main(String[] args) {

        Logan logan = new Logan();

        System.out.println("-----Logan-----");
        System.out.println("Model : " + logan.getModelName());
        System.out.println("Registration : " + logan.getRegistrationNumber());
        System.out.println("Owner : " + logan.getOwnerName());
        System.out.println("Speed : " + logan.speed() + " km/h");
        System.out.println("GPS : " + (logan.gps() == 1 ? "Available" : "Not Available"));

        System.out.println();

        Ford ford = new Ford();

        System.out.println("-----Ford-----");
        System.out.println("Model : " + ford.getModelName());
        System.out.println("Registration : " + ford.getRegistrationNumber());
        System.out.println("Owner : " + ford.getOwnerName());
        System.out.println("Speed : " + ford.speed() + " km/h");
        System.out.println("Temperature : " + ford.tempControl() + "°C");
    }
}