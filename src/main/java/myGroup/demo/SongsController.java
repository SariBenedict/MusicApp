package myGroup.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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



     @RequestMapping(value="/artist{artist}" , method = RequestMethod.GET)
     public List<Song> getByArtist(@PathVariable String artist)
    {
         return service.getByArtist(artist);
    }

    @RequestMapping(value = "id", method =RequestMethod.GET)
    public Song getById(@PathVariable int id)
    {
         return service.getById(id);
    }

    @RequestMapping(value = "id", method =RequestMethod.DELETE)
    public void deleteSongById(@PathVariable int id)
    {
         service.deleteSongById(id);
    }

}