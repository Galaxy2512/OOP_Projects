package OverloadConstructors;

import java.io.PipedInputStream;

public class AppClient {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("thin bread", "tomato", "mozzarella", "pepperoni");
        Pizza pizza2 = new Pizza("thick bread", "tomato", "cheddar", "tuna");

        Pizza pizza3 = new Pizza("thin", "tomato");

        System.out.println("Here are ingredients of your pizza: ");

        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        System.out.println("Here are ingredients of your other pizza: ");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.topping);





    }


}
