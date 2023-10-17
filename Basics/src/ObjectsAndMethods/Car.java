package ObjectsAndMethods;

public class Car {

    String brand;
    String model;
    int year;
    String type;
    int hp;

    public Car (String brand, String model, int year, String type, int hp){
        this.brand = brand;
        this.hp = hp;
        this.model = model;
        this.year = year;
        this.type = type;


    }
    public static void drive(){
        System.out.println("Car drive");

    }
    public static void breaking(){
        System.out.println("Car break");

    }

    @Override
    public String toString() { //to string method to represent string values of object
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", hp=" + hp +
                '}';
    }
}
