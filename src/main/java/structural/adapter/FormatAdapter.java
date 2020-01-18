package structural.adapter;

public class FormatAdapter implements MediaPlayer {

    // Composition for adapting to existing system
    private MediaPackage mediaPackage;

    public FormatAdapter(final MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    public void play(String fileName) {
        System.out.print("Adapter Class play(): ");
        mediaPackage.playFile(fileName);
    }
}
