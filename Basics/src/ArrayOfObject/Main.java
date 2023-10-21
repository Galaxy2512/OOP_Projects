package ArrayOfObject;

public class Main {
    public static void main(String[] args) {
        SuperHero[] superHeroes = new SuperHero[3];

        superHeroes[0] = new SuperHero("Superman"); //creating objects with different parameters
        superHeroes[1] = new SuperHero("Batman");
        superHeroes[2] = new SuperHero("Spiderman");

        superHeroes[0].fly("Superman");     //calling the method fly from SuperHero class
        superHeroes[1].fly("Batman");
        superHeroes[2].fly("Spiderman");

        System.out.println(superHeroes[0].name); //printing the name of the super heroes
        System.out.println(superHeroes[1].name);
        System.out.println(superHeroes[2].name);

    }
}
