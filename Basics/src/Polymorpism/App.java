package Polymorpism;

// This is the main class of the project
//Polymorphism is the ability of an object to take on many forms.
//The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
//Any Java object that can pass more than one IS-A test is considered to be polymorphic.
//In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.





public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Vehicle", "Black", 4, 5);
        vehicle.print();
        vehicle.drive();
        vehicle.stop();

        System.out.println();

        Bike bike = new Bike("Bike", "Red", 2, 2);
        bike.print();
        bike.drive();
        bike.stop();

        System.out.println();

        Car car = new Car("Car", "Blue", 4, 5);
        car.print();
        car.drive();
        car.stop();
    }
}
