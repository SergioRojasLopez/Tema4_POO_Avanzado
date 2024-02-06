public class MP3Player implements OfflineMusicPlayer{
    @Override
    public void play() {

        System.out.println("Playing music on MP3");

    }

    @Override
    public void stop() {

        System.out.println("Stopping music on MP3");

    }

    @Override
    public void load() {

        System.out.println("Loading music on MP3");

    }
}
