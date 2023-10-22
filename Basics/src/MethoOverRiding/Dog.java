package MethoOverRiding;

public class Dog extends Animal {

    @Override
    public void speak() { //this is method overriding (same method name, same parameters, same return type) but different implementation
        System.out.println("Dog is barking");
    }
}
