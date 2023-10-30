package encapsulation;

//encapsulation means that

public class App {

    public static void main(String[] args) {
        Car car = new Car("opel", "Corsa", 1999);

        System.out.println(car);
        System.out.println(car.getModel());
        car.setName("Bmw"); 
        System.out.println(car.getName());

    }
}
