package myGroup.demo;

import java.util.ArrayList;
import java.util.List;

public interface SongsService {

    public Song addSong(Song newSong);
    public ArrayList<Song> getAllSongs();
    public void updateSong(Song song);
    public List<Song> getByArtist(String artistName);
    public Song getById(int id);
    public void deleteSongById(int id);

}
