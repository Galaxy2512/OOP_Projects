package OverloadConstructors;


//overloading constructors is a technique in which a class can have more than one constructor with different parameters
// the constructors must have different parameters
// in main method we can create objects with different parameters
// we can use this technique to create objects with different parameters
public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    public Pizza(String bread, String sauce, String cheese, String topping) { //constructor with 4 parameters
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    public Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }

    public static void makingPizza(){
        System.out.println("Pizza is being made");
    }

    public static void bakingPizza(){
        System.out.println("Pizza is being baked");
    }



//    @Override
//    public String toString() {
//        return "bread='" + bread + '\'' + ", sauce='" + sauce + '\'' + ", cheese='" + cheese + '\'' + ", topping='" + topping + '\'';
//    }
}
