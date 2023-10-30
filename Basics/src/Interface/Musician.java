package Interface;

public class Musician implements Sing, Play {

    @Override
    public void sing() {
        System.out.println("Musician is singing");
    }

    @Override
    public void play() {
        System.out.println("Musician is playing");
    }
}
