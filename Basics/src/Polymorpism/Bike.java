package Polymorpism;

public class Bike extends Vehicle{

            Bike(String name, String color, int wheels, int seats) {
                super(name, color, wheels, seats);
            }

            @Override  // This is called annotation and it is used to override the method from the parent class
            public void drive() {
                System.out.println("Driving a bike...");
            }

            @Override
            public void stop() {
                System.out.println("Stopping a bike...");
            }
}
