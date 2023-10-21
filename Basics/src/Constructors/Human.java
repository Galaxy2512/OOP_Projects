package Constructors;

public class Human {
   static String name;
   static int age;
    static int height;

    public Human(String name, int age, int height) {
        this.name = name; // this.name refers to the name of the object
        this.age = age;
        this.height = height;
    }
    public void walk() {
        System.out.println(name + " walks");
    }
    public static void talk() {

        System.out.println(name + " talks");
    }

    public static void description() {
        System.out.println(name + " is " + age + " years old and " + height + " cm tall");
    }

    @Override
    public String toString() {
        return "Human " + "name = '" + name + '\'' + ", age = " + age + ", height = " + height + " cm";
    }
}
