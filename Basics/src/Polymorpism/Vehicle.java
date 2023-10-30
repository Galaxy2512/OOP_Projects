package Polymorpism;

public class Vehicle {  // This is the parent class of Bike and Car classes and it is used to create objects of type Vehicle

    String name;
    String color;
    int wheels;
    int seats;

    Vehicle(String name, String color, int wheels, int seats) {
        this.name = name;
        this.color = color;
        this.wheels = wheels;
        this.seats = seats;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Wheels: " + wheels);
        System.out.println("Seats: " + seats);
    }

    public void drive() {   // This method is overridden in the child classes Bike and Car and it is called polymorphism

    }

    public void stop() {

    }

}
