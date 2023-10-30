package Interface;

public class App {

    public static void main(String[] args) {
        Musician musician = new Musician();
        musician.sing();
        musician.play();
        DJ dj = new DJ();
        dj.play();

    }
}
