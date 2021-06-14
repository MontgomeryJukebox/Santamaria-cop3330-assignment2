package ex25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Determmine the strength of a password")
    void validatePassword() {
        assertEquals(0, App.validatePassword("12345"));
        assertEquals(1, App.validatePassword("abcdef"));
        assertEquals(2, App.validatePassword("abc123xyz"));
        assertEquals(3, App.validatePassword("l33th@xor!"));
    }
}