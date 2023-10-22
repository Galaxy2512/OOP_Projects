package PassObject;

public class Garage {

    //static keyword means that the method belongs to the class and not to the object
    //that means that we can call the method without creating an object - example: Garage.park(car1);

   public static void park(Car car){ // Car car is a parameter of type Car, like this we are passing an object of type Car.
        System.out.println("The " + car.brand + " " + car.model + " is parked in the garage");
    }
}
