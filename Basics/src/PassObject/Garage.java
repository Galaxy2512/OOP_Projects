package PassObject;

public class Garage {

   public static void park(Car car){ // Car car is a parameter of type Car, like this we are passing an object of type Car.
        System.out.println("The " + car.brand + " " + car.model + " is parked in the garage");
    }
}
