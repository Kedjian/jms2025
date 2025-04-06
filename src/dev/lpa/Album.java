package dev.lpa;
import java.util.*;

public class Album {
    String name;
    String artist;
    ArrayList<Song> songs = new ArrayList<>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String title, double duration) {
        if (songs.contains(new Song(title, duration))) {
            return false;
        } else {
            songs.add(new Song(title, duration));
            return true;
        }
    }

    public String findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return "Song found: " + song.getTitle();
            }
        }
        return null;
    }
}




