package example.Pattern.StructuralPatterns.AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{


    @Override
    public void playMP4(String fileName) {

    }

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

}
