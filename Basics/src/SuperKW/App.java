package SuperKW;

public class App {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("Superman", "Flying", 100);
        SuperHero superHero2 = new SuperHero("Batman", "Rich", 100);
        SuperHero superHero3 = new SuperHero("Spiderman", "Spider", 100);
        System.out.println(superHero.name);
        System.out.println(superHero.sP);
        System.out.println(superHero.power);
        System.out.println(superHero.toString());

        System.out.println("---------------------");

        System.out.println(superHero2.name);
        System.out.println(superHero2.sP);
        System.out.println(superHero2.power);
        System.out.println(superHero2.toString());

        System.out.println("---------------------");

        System.out.println(superHero3.name);
        System.out.println(superHero3.sP);
        System.out.println(superHero3.power);
        System.out.println(superHero3.toString());




    }
}
