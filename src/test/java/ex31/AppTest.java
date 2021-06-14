package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getTargetHeartRate() {
        assertEquals(191, App.getTargetHeartRate(95, 22, 65));
    }
}