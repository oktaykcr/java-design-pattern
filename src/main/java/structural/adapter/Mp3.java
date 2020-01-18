package structural.adapter;

public class Mp3 implements MediaPlayer {

    public void play(String fileName) {
        System.out.println("Playing MP3 " + fileName);
    }
}
