package Constructors;

import static Constructors.Animal.makeSound;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("Dog", "Woof woof"); //this is object of class Animal with name dog.
        Animal cat = new Animal("Cat", "Meow meow");
        System.out.println(dog); // this is the same as System.out.println(dog.toString());
        System.out.println(cat);
        dog.makeSound(); // this is the same as Animal.makeSound();
        Animal.makeSound();



        System.out.println("--------------------------------------------------");


        Human human = new Human("John", 25, 180);
        Human human2 = new Human("Mary", 30, 170);
        System.out.println(human);
        human.walk();
        human.talk();
        human2.walk();
        human2.talk();



    }
}
