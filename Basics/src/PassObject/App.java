package PassObject;

public class App {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "X5"); // car1 is an object of type Car
        Car car2 = new Car("Mercedes", "C-Class"); // car2 is an object of type Car
        Garage garage1 = new Garage(); // garage1 is an object of type Garage

        garage1.park(car1); // car1 is an argument of type Car, garage1 is an argument of type Garage,
        garage1.park(car2); // car2 is an argument of type Car, garage1 is an argument of type Garage,

    }


//    public static void main(String[] args) {
//        App app = new App(); // app is an object of type App
//        app.garage1.park(app.car1); // app.car1 is an argument of type Car, app.garage1 is an argument of type Garage,
//        //in this case, the argument is an object of type Car
//    }
}
