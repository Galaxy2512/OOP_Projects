package Inheritance;

//inheritance is the process of creating new classes from existing classes (superclasses)
//the new classes are called subclasses
//we can inherit the fields and methods of the  and use them in the subclass as if they were defined in the subclass
//the subclass can also have its own fields and methods

public class App {

        public static void main(String[] args) {

            Car car = new Car();
            Motor motor = new Motor();

            car.drive(); //using the drive method from the superclass
            car.stop();

            motor.drive();
            motor.stop();

            System.out.println(car.speed); //using the speed field from the superclass
            System.out.println(motor.speed);
        }
}
