package ex26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Determine the number of months to pay off a credit card")
    void months() {
        assertEquals(70, App.months((((double) 12) / 365), 5000, 100));
    }
}