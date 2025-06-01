public class Spotify {
    public static void main(String[] args){
        MusicPlayer mp3 = new MusicPlayer("Spotify","Chris Brown");
        mp3.shuffle();
        mp3.adjustVolume(88);
        mp3.play("Overtime");
        mp3.pause();
        mp3.stop();
    }
}
