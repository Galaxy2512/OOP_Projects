package Interface;

//interface is a contract that a class can implement and provide the implementation of the methods
//it means that the class has to provide the implementation of the methods in the interface
//for example, the class Musician implements the interface Sing and Play

public class App {

    public static void main(String[] args) {
        Musician musician = new Musician();
        musician.sing();
        musician.play();
        DJ dj = new DJ();
        dj.play();

    }
}
