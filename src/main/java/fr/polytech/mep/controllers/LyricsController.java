package fr.polytech.mep.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LyricsController {
    
    LyricsController() {

    }

    @GetMapping("/test")
    List<String> all() {
        List<String> testList = new ArrayList<>();
        testList.add("Oui");
        testList.add("Non");
        testList.add("Maybe");
        return testList;
    }
}