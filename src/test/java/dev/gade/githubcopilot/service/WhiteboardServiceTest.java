package dev.gade.githubcopilot.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteboardServiceTest {

    @Test
    void isPolyndrome() {

        WhiteboardService whiteboardService = new WhiteboardService();
        assertTrue(whiteboardService.isPolyndrome("madam"));
        assertFalse(whiteboardService.isPolyndrome("madame"));
    }

    @Test
    void removeSubString() {
        WhiteboardService whiteboardService = new WhiteboardService();
        assertEquals("mam", whiteboardService.removeSubString("madam", "d"));
        assertEquals("madam", whiteboardService.removeSubString("madam", ""));
        assertEquals("madam", whiteboardService.removeSubString("madam", "z"));
    }

}