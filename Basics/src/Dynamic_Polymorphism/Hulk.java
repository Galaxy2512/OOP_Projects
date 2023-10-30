package Dynamic_Polymorphism;

public class Hulk extends SuperHero{
    public Hulk(String name, String power) {
        super(name, power);
    }

    @Override
    public void usePower() {
        System.out.println("Using power: " + power);
    }

    @Override
    public void fight() {
        System.out.println("Fighting...");
    }
}
