public class Main {

    public static void main(String[] args) {

        MusicPlayer[]players = {new Spotify(),new ITunes(),new MP3Player()};

        MusicApp app = new MusicApp();

        app.startMusic(players);
    }
}
