package MethoOverRiding;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        Dog dog = new Dog();
        dog.speak(); //we use the speak method from the subclass Dog instead of the speak method from the superclass Animal because we overrode the speak method in the subclass

    }
}
