package dev.lpa;
import java.util.*;

public class Album {
    String name;
    String artist;
    ArrayList<Song> songs = new ArrayList<>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        } else {
            songs.add(new Song(title, duration));
            return true;
        }
    }

//    public String findSong(String title) {
//        for (Song song : songs) {
//            if (song.getTitle().equals(title)) {
//                return "Song found: " + song.getTitle();
//            }
//        }
//        return null;
//    }

    private Song findSong(String title) {
        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int index, LinkedList<Song> playlist) {
        int indexVar = index - 1;
        if (indexVar >= 0 && indexVar < songs.size()) {
            playlist.add(songs.get(indexVar));
            return true;
        } else { return false; }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }
}




