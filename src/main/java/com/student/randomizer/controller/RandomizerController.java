package com.student.randomizer.controller;

import com.student.randomizer.service.RandomizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class RandomizerController {

    @Autowired
    private RandomizerService service;

    @GetMapping("/index")
    public Integer getIndex() {
        return service.getRandomValue(1, 6);
    }
}
