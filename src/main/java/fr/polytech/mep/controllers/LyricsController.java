package fr.polytech.mep.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import fr.polytech.mep.models.Lyrics;
import fr.polytech.mep.repositories.LyricsRepository;

@RestController
class LyricsController {
    
	@Autowired
    private LyricsRepository lyricsRep;

    LyricsController() {
    }

    @GetMapping("/line")
    String getLine(@RequestParam(name="id",defaultValue = "0")long id) {
        try{
            Lyrics l = lyricsRep.findById(id).get();
            return l.getLyric();
        }
        catch(NoSuchElementException e){
            return "Erreur: id not found";
        }
    }

    @GetMapping("/")
    String random() {
        long nombreAleatoire = (long)(Math.random() * (lyricsRep.count()));
        return getLine(nombreAleatoire);
    }

    @GetMapping("/ping")
    String test() {
        return "Pong !";
    }

}