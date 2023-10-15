package Iphone.SongPlayer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SongPlayer {
    private List<Song> songs;

    public SongPlayer() {
        this.songs = new ArrayList<>();
        this.songs.add(new Song("Song 1", "Artist 1", "2000"));
        this.songs.add(new Song("Song 2", "Artist 2", "2002"));
        this.songs.add(new Song("Song 3", "Artist 3", "2007"));
    }

    public void play(String name) {
        for(Song s : songs) {
            if(s.getName().equalsIgnoreCase(name)) {
                System.out.printf("Playing %s from %s released in %s\n", s.getName(), s.getArtist(), s.getReleaseYear());
            }
        }
    }

    public void pause(String name) {
        for(Song s : songs) {
            if(s.getName().equalsIgnoreCase(name)) {
                System.out.println("Song paused");
            }
        }
    }

    public void selectSong(String name) {
        for(Song s : songs) {
            if(s.getName().equalsIgnoreCase(name)) {
                System.out.printf("Selected %s from %s released in %s\n", s.getName(), s.getArtist(), s.getReleaseYear());
            }
        }
    }
}
