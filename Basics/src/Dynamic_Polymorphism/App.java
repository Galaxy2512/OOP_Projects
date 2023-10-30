package Dynamic_Polymorphism;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Batman batman;
        Hulk hulk;
        CharlySheen charlySheen;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Batman");
        System.out.println("2. Hulk");
        System.out.println("3. Charly Sheen");
        System.out.println("Enter your choice: ");
        int choice= scanner.nextInt();



        if (choice==1) {
            batman = new Batman("Batman", "Super Intelligence");
            batman.usePower();
            batman.fight();
            batman.fly();
        }
        else if (choice==2) {
            hulk = new Hulk("Hulk", "Super Strength");
            hulk.usePower();
            hulk.fight();
        }
        else if (choice==3) {
            charlySheen = new CharlySheen("Charly Sheen", "Winning");


        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
