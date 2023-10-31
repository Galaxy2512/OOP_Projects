package AudioFiles;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

//must as WAV file to project folder to run this program successfully


public class App {
    public static void main(String[] args) {
        File file = new File("Lana Del Rey - Doin' Time.wav"); // File is a class that represents a file or directory in the file system.
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); // AudioInputStream is an abstract class that represents audio input stream sources of audio data of various types.
            Clip clip = AudioSystem.getClip(); // Clip is an interface that represents a special kind of data line whose audio data can be loaded prior to playback, instead of being streamed in real time.
            clip.open(audioStream); // Opens the clip with the format and audio data present in the provided audio input stream.
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing audio");
        }
    }
}
