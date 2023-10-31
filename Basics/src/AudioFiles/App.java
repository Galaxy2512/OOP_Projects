package AudioFiles;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//must as WAV file to project folder to run this program successfully


public class App {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        File file = new File("Lana Del Rey - Doin' Time.wav"); // File is a class that represents a file or directory in the file system.
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); // AudioInputStream is an abstract class that represents audio input stream sources of audio data of various types.
        Clip clip = AudioSystem.getClip(); // Clip is an interface that represents a special kind of data line whose audio data can be loaded prior to playback, instead of being streamed in real time.
        clip.open(audioStream); // Opens the clip with the format and audio data present in the provided audio input stream.

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid response");



        }

        }


    }
}
