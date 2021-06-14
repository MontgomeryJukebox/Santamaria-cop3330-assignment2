package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getArrayIndex() {
        String[] arr = {"hello", "world!"};
        assertEquals("world!", App.getArrayIndex(arr, 1));
    }
}