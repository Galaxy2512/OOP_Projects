package ArrayOfObject;

public class SuperHero {

    String name;
    public SuperHero(String name){ //constructor
        this.name = name;

    }

    //method in which we used static keyword to be able to call it in main method without creating an object,
    // also we used void because we don't want to return anything such as a value
    public static void fly(String name){

        System.out.println( name + " has super powers");
    }
}
