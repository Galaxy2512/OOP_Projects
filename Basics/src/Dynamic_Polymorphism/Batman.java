package Dynamic_Polymorphism;

public class Batman extends SuperHero{
    public Batman(String name, String power) {
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

    @Override
    public void run() {
        System.out.println("Running...");
    }
}
