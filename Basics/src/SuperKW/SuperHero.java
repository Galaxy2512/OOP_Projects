package SuperKW;

public class SuperHero extends Person{ //this is sub class that inherits from super class Person and has its own atributes and methods and also inherits atributes and methods from super class

    int speed;
    public SuperHero(String name, String sP, int power) {
        super(name, sP, power); //super() is used to call the constructor of the superclass (Person) and initialize the fields of the superclass (Person) with the values passed as arguments to the constructor of the subclass (SuperHero)
        this.speed = speed;
    }

    @Override
    public String toString() { //this is method overriding (same method name, same parameters, same return type) but different implementation (this method is defined in the superclass (Person) and is overridden in the subclass (SuperHero))
        return super.toString() + this.speed + "m/s"; //To change body of generated methods, choose Tools | Templates.


    }
}
