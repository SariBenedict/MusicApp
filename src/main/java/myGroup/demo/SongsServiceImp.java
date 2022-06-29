package myGroup.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongsServiceImp implements SongsService{

    //constructor
    public SongsServiceImp() {
        addDefultSong();
    }

    //Add a defult song
    public void addDefultSong()
    {
        Song s1 = new Song(0, "kol dodi","Ishay",Genere.POP,4,15);
        songs.add(s1);
    }

    //songs list
    ArrayList<Song> songs = new ArrayList<Song>();

    //Add a new song
    @Override
    public Song addSong(Song newSong)
    {
        songs.add(newSong);
        return newSong;
    } 

    @Override
    //Get all songs
    public ArrayList<Song> getAllSongs()
    {
        return songs;
    }

    @Override
    //Update song
    public void updateSong(Song song)
    {
        songs.removeIf(i -> i.getId() == song.getId());
        songs.add(song);
    }

    @Override
    //Get all songs of a specific artist
    public List<Song> getByArtist(String artistName)
    {
        List<Song> result = songs.stream().filter(song -> song.getArtist().equals(artistName))
        .collect(Collectors.toList());
        return result;
    }

    @Override
    //Get specific song by id
    public Song getById(int id)
    {
        Song song = null;
        for(Song s : songs)
        {
        	if(s.getId() == id)
        		song = s;
        }
        return song;
    }

    @Override
    //Delete song by id
    public void deleteSongById(int id)
    {
        for(Song s : songs)
        {
        	if(s.getId() == id)
        		songs.remove(s);
        }
    }
    
}
