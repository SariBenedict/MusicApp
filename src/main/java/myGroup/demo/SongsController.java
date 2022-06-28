package myGroup.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("songs")

public class SongsController {
   
    @Autowired
    private SongsService service;

    //Get all songs
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ArrayList<Song> getAllSongs()
    {
        return service.getAllSongs();
    }

    //Add song
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public Song addSong(@RequestBody Song song)  
    {
        return service.addSong(song);
    }



    // @GetMapping("/{artist}")
    // public ArrayList<Song> getByArtist(String artist)
    // {
    //     service.gatByArtist(artist);
    // }

    // @GetMapping("getById/{id}")
    // public Song getById(int id)
    // {
    //     return service.getById(id);
    // }

    // @DeleteMapping("/{id}")
    // public void deleteSongById(int id)
    // {
    //     service.deleteSongById(id);
    // }

}