package com.student.randomizer.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomizerService {

    private Random random = new Random();

    public int getRandomValue(int from, int to) {
        return random.nextInt(to - from + 1) + from;
    }
}
