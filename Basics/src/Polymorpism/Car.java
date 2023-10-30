package Polymorpism;

public class Car extends Vehicle{

        Car(String name, String color, int wheels, int seats) { // Constructor of the class Bike which is a child of Vehicle
            super(name, color, wheels, seats);
        }

        @Override
        public void drive() { // This is called annotation and it is used to override the method from the parent class
            System.out.println("Driving a car...");
        }

        @Override
        public void stop() {
            System.out.println("Stopping a car...");
        }
}
