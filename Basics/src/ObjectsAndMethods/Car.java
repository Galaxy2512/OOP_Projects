package ObjectsAndMethods;

public class Car {

    public static String brand;
    public static String model;
    public static int year;
    public static String type;
    public static int hp;

    public Car (String brand, String model, int year, String type, int hp) {
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
        return "Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", year=" + year + ", type='" + type + '\'' + ", hp=" + hp + '}';
    }

//    public static String getBrand() {;
//        return brand;
//    }
//
//    public static void setBrand(String brand) {
//        Car.brand = brand;
//    }
//
//    public static String getModel() {
//        return model;
//    }
//
//    public static void setModel(String model) {
//        Car.model = model;
//    }
//
//    public static int getYear() {
//        return year;
//    }
//
//    public static void setYear(int year) {
//        Car.year = year;
//    }
//
//    public static String getType() {
//        return type;
//    }
//
//    public static void setType(String type) {
//        Car.type = type;
//    }
//
//    public static int getHp() {
//        return hp;
//    }
//
//    public static void setHp(int hp) {
//        Car.hp = hp;
//    }
}
