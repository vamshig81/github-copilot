package dev.gade.githubcopilot.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteBoardServiceTest {

    @Test
    void isPolyndrome() {
        WhiteBoardService whiteBoardService = new WhiteBoardService();
        assertTrue(whiteBoardService.isPolyndrome("madam"));
        assertFalse(whiteBoardService.isPolyndrome("madame"));
    }
}