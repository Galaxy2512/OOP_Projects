package encapsulation;

public class Car {

    private String name;
    private String model;

    private int year;

    public Car (String name, String model, int year){
        this.model = model;
        this.name = name;
        this.year = year;

    }

    public static void info(String name, String model, int year ){
        System.out.println(year + model + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
