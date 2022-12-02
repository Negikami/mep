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
    private LyricsRepository centerRep;

    LyricsController() {
        InitDb();
    }

    @GetMapping("/line")
    String getLine(@RequestParam(name="id",defaultValue = "0")long id) {
        try{
            Lyrics l = centerRep.findById(id).get();
            return l.getLyric();
        }
        catch(NoSuchElementException e){
            return "Erreur: id not found";
        }
    }

    @GetMapping("/")
    String random() {
        long nombreAleatoire = (long)(Math.random() * (centerRep.count()));
        return getLine(nombreAleatoire);
    }

    @GetMapping("/test")
    String test() {
        return "Hello";
    }

    public void InitDb(){
		if(centerRep.count()>0)
			return;
		String[] l = {"We're no strangers to love",
		"You know the rules and so do I (do I)",
		"A full commitment's what I'm thinking of",
		"You wouldn't get this from any other guy",
		"I just wanna tell you how I'm feeling",
		"Gotta make you understand",
		"Never gonna give you up",
		"Never gonna let you down",
		"Never gonna run around and desert you",
		"Never gonna make you cry",
		"Never gonna say goodbye",
		"Never gonna tell a lie and hurt you",
		"We've known each other for so long",
		"Your heart's been aching, but you're too shy to say it (say it)",
		"Inside, we both know what's been going on (going on)",
		"We know the game and we're gonna play it",
		"And if you ask me how I'm feeling",
		"Don't tell me you're too blind to see",
		"Never gonna give you up",
		"Never gonna let you down",
		"Never gonna run around and desert you",
		"Never gonna make you cry",
		"Never gonna say goodbye",
		"Never gonna tell a lie and hurt you",
		"Never gonna give you up",
		"Never gonna let you down",
		"Never gonna run around and desert you",
		"Never gonna make you cry",
		"Never gonna say goodbye",
		"Never gonna tell a lie and hurt you",
		"We've known each other for so long",
		"Your heart's been aching, but you're too shy to say it (to say it)",
		"Inside, we both know what's been going on (going on)",
		"We know the game and we're gonna play it",
		"I just wanna tell you how I'm feeling",
		"Gotta make you understand",
		"Never gonna give you up",
		"Never gonna let you down",
		"Never gonna run around and desert you",
		"Never gonna make you cry",
		"Never gonna say goodbye",
		"Never gonna tell a lie and hurt you",
		"Never gonna give you up",
		"Never gonna let you down",
		"Never gonna run around and desert you",
		"Never gonna make you cry",
		"Never gonna say goodbye",
		"Never gonna tell a lie and hurt you",
		"Never gonna give you up",
		"Never gonna let you down",
		"Never gonna run around and desert you",
		"Never gonna make you cry",
		"Never gonna say goodbye",
		"Never gonna tell a lie and hurt you"};
        for (String string : l) {
            centerRep.save(new Lyrics(string));
        }
	}
}