package Iphone.SongPlayer;

public class Song {
    private String name, artist, releaseYear;

    public Song(String name, String artist, String releaseYear) {
        this.name = name;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getReleaseYear() {
        return releaseYear;
    }
}
