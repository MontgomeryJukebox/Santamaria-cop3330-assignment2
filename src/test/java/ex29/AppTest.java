package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void years() {
        assertEquals(18, App.years(4));
        assertEquals(72, App.years(1));
    }
}