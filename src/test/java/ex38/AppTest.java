package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generateEvensList() {
        String test = "1 2 3";
        ArrayList<Integer> neighbor = App.generateEvensList(test);
        assert(neighbor.size() == 1);
        assert(neighbor.get(0) == 2);
    }
}