package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Check if two words are anagrams")
    void isAnagram() {
        assertEquals(true, App.isAnagram("note", "tone"));
        assertEquals(false, App.isAnagram("abc", "def"));
    }
}