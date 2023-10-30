package Dynamic_Polymorphism;

public class SuperHero {

    String name;
    String power;

    public SuperHero(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public void usePower() {
        System.out.println("Using power: " + power);
    }

    public void fly() {
        System.out.println("Flying...");
    }
    public void fight() {
        System.out.println("Fighting...");
    }
    public void run() {
        System.out.println("Running...");
    }


}
