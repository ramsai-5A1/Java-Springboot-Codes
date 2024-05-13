package AudioPlayer;

public class Song {

    private String songName;
    private String songDuration;
    private int songId;
    private String movieName;

    Song() {
        songDuration = "00:00";
        songId = -1;
        songName = "None";
        movieName = "None";
    }

    Song(int songId, String songDuration, String songName, String movieName) {
        this.songId = songId;
        this.songDuration = songDuration;
        this.songName = songName;
        this.movieName = movieName;
    }

    public String getSongName() {
        return this.songName;
    }

    public String getSongDuration() {
        return this.songDuration;
    }

    public int getSongId() {
        return this.songId;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setSongDuration(String songDuration) {
        this.songDuration = songDuration;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public String toString() {
        return "\nSong-id: " + this.songId + 
        "\nMovie-name:" + this.movieName +
        "\nSong-Name: " + this.songName + "\nSong-Duration: " + this.songDuration;
    }
}
