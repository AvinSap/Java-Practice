public class MusicPlayer implements Player {
    String app;
    String artist;

    MusicPlayer(String app,String artist){
        this.app = app;
        this.artist = artist;
    }
    @Override
    public void play(String title) {
        System.out.println("Now Playing: " + title + " by " + this.artist + " on " + this.app);
    }

    @Override
    public void pause() {
        System.out.println("Music paused..");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopped...");
    }

    void shuffle(){
        System.out.println("Shuffling Music on " + this.app);
    }

    void adjustVolume(int volume){
        System.out.println("The volume is set to: " + volume);
    }
}
