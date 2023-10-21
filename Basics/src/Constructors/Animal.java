package Constructors;

public class Animal {

    public static String name;
    public static String voice;

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public static void makeSound() {

        System.out.println( name + "makes sound");
    }
    public static void voice() {
        System.out.println(name + " animal is making " + voice);
    }
    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", voice='" + voice + '\'' + '}';
    }



}
