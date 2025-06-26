abstract class Artist {
    // COMMON ATTRIBUTES
    private String nameOfArtist;
    private String songName;
    private String albumName;
    private int followers;
    private float monthlyListeners;
    private int rank;

    // CONSTRUCTOR
    public Artist(String nameOfArtist, String songName, String albumName, int followers, float monthlyListeners, int rank) {
        this.nameOfArtist = nameOfArtist;
        this.songName = songName;
        this.albumName = albumName;
        this.followers = followers >= 0 ? followers : 0;
        this.monthlyListeners = monthlyListeners >= 0.0f ? monthlyListeners : 0.0f;
        this.rank = rank;
    }

    public Artist() {
    }

    // ABSTRACT METHODS
    abstract void follow();
    abstract void share();

    // UTILITY METHODS
    void increase(int value) {
        System.out.println("The volume is increased by: " + value);
    }

    void decrease(int value) {
        System.out.println("The volume is decreased by: " + value);
    }

    // GETTERS & SETTERS
    public String getNameOfArtist() {
        return nameOfArtist;
    }

    public void setNameOfArtist(String nameOfArtist) {
        this.nameOfArtist = nameOfArtist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = Math.max(0, followers);
    }

    public float getMonthlyListeners() {
        return monthlyListeners;
    }

    public void setMonthlyListeners(float monthlyListeners) {
        this.monthlyListeners = Math.max(0.0f, monthlyListeners);
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    // DEBUG UTILITY
    @Override
    public String toString() {
        return "Artist: " + nameOfArtist + ", Song: " + songName + ", Album: " + albumName +
                ", Followers: " + followers + ", Listeners: " + monthlyListeners + ", Rank: " + rank;
    }
}
