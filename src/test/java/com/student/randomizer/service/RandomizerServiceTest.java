package com.student.randomizer.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomizerServiceTest {

    private final RandomizerService randomizerService = new RandomizerService();

    @Test
    void successfulTest() {
        assertThat(randomizerService.getRandomValue(0, 1)).isBetween(0, 1);
        assertThat(randomizerService.getRandomValue(1, 2)).isBetween(1, 2);
        assertThat(randomizerService.getRandomValue(-1, 0)).isBetween(-1, 0);
    }

    @Test
    void failedTest() {
        assertThat(randomizerService.getRandomValue(1, 3)).isLessThan(1);
    }
}