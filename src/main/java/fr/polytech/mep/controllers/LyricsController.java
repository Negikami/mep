package fr.polytech.mep.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LyricsController {
    
    LyricsController() {

    }

    @GetMapping("/")
    String all(@RequestParam(name="id",defaultValue = "0")long id) {
        return String.valueOf(id);
    }

    @GetMapping("/line")
    String getLine(@RequestParam(name="id",defaultValue = "0")long id) {
        return String.valueOf(id);
    }

    @GetMapping("/test")
    String test() {
        return "Hello";
    }
}