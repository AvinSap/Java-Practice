public class Drake extends Artists implements SpotifyController{
    int noOfHits;


    @Override
    public void play() {
        System.out.println("Now playing " + songName + " by " + nameOfArtist + " on Spotify.");
    }

    @Override
    public void pause() {
        System.out.println("The song is Paused!!!");
    }

    @Override
    public void stop() {
        System.out.println("The music is stopped!!!");
    }

    @Override
    public void shuffle() {
        System.out.println("Shuffling songs!!!!");
    }

    @Override
    void follow() {
        System.out.println("You started following Drake");
    }

    @Override
    public String getNameOfArtist() {
        return " DRAKE ";
    }

    @Override
    void share() {
        System.out.println("Link Copied!!!");
    }

    @Override
    public void rate(int value) {
        System.out.println("Your rating is: " + value);
    }

    @Override
    public void reviewComment() {
        System.out.println("Totally Goated with: " + noOfHits);
    }
}
