package structural.adapter;

public class Mp4 implements MediaPackage {

    public void playFile(String fileName) {
        System.out.println("Playing MP4 " + fileName);
    }
}
