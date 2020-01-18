package structural;

import org.junit.Test;
import structural.adapter.FormatAdapter;
import structural.adapter.MediaPlayer;
import structural.adapter.Mp3;
import structural.adapter.Mp4;

public class AdapterPatternTest {

    /**
     * OUTPUT:
     * Playing MP3 mp3File.mp3
     * Adapter Class play(): Playing MP4 mp4File.mp4
     */
    @Test
    public void adapterPattern() {
        MediaPlayer mp3MediaPlayer = new Mp3();
        mp3MediaPlayer.play("mp3File.mp3");

        MediaPlayer mp4AdaptedPlayer = new FormatAdapter(new Mp4());
        mp4AdaptedPlayer.play("mp4File.mp4");
    }
}
