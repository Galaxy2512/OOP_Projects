package Abstraction;

// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
// Another way, it shows only important things to the user and hides the internal details for example sending sms, you just type the text and send the message.
// You don't know the internal processing about the message delivery.
// Abstraction lets you focus on what the object does instead of how it does it.
// Abstraction is achieved in Java by using interface and abstract class.


public class App {
    public static void main(String[] args) {
        Palms palms = new Palms();
        palms.water();

    }
}
