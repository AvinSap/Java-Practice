abstract class Artists {
    //COMMON ATTRIBUTES:
    public String nameOfArtist;
    public String songName;
    private String albumName;
    private int followers;
    private float monthlyListeners;
    private int rank;

    //PARAMETERIZED CONSTRUCTOR:
    Artists(String nameOfArtist, String songName,String albumName, int followers,float monthlyListeners,int rank){
        this.nameOfArtist = nameOfArtist;
        this.songName = songName;
        this.albumName = albumName;
        this.followers = followers;
        this.monthlyListeners = monthlyListeners;
        this.rank = rank;
    }

    Artists() {
    }

    //METHODS:
    abstract void follow();
    abstract void share();
    void increase(int value){
        System.out.println("The volume is increased by: " + value);
    }
    void decrease(int value){
        System.out.println("The volume is decreased by:" + value );
    }

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
        this.followers = followers;
    }

    public float getMonthlyListeners() {
        return monthlyListeners;
    }

    public void setMonthlyListeners(float monthlyListeners) {
        this.monthlyListeners = monthlyListeners;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
