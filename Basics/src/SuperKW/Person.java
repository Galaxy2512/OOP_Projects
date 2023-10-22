package SuperKW;

public class Person { //this is super class that has atributes that are common to all the classes that inherit from it

    public  String name;

    public String sP;
    public int power;

    public Person(String name, String sP, int power) {
        this.name = name;
        this.sP = sP;
        this.power = power;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sP='" + sP + '\'' +
                ", power=" + power +
                '}';
    }
}
