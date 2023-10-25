package Abstraction;

//abstract classes are classes that cannot be instantiated means that you cannot create objects of an abstract class.
//The purpose of an abstract class is to provide a common definition of a base class that multiple derived classes can share.


public abstract class Plant {



    Plant() {
        System.out.println("Plant constructor");
    }

    public void grow() {
        System.out.println("Plant is growing");
    }

}
