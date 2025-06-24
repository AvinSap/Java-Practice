public class ChrisBrown extends Artists implements SpotifyController {
    int noOfGrammys;

    ChrisBrown(String nameOfArtist, String songName, String albumName, int followers, float monthlyListeners, int rank, int noOfGrammys) {
        super(nameOfArtist, songName, albumName, followers, monthlyListeners, rank);
        this.noOfGrammys = noOfGrammys;
    }

    @Override
    public void play() {
        System.out.println("Now playing " + songName + " by " +nameOfArtist +  " on Spotify");
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
    void share() {
        System.out.println("Link Copied!!!");
    }

    @Override
    public void rate(int value) {
        System.out.println("Your rating is: " + value);
    }

    @Override
    public void reviewComment() {
        System.out.println("Chris Brown is a LEGEND!! Hands Down , with" + noOfGrammys + " Grammy's Award");
    }
}
