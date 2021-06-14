package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void atLeastTwoCharLong() {
        assert(App.atLeastTwoCharLong("ab"));
        assert(!App.atLeastTwoCharLong(""));
    }

    @Test
    void filledIn() {
        assert(!App.filledIn(""));
        assert(App.filledIn("abc"));
    }

    @Test
    void validZip() {
        assert(App.validZip(33404));
    }

    @Test
    void validEmpID() {
        assert(App.validEmpID("TK-4321"));
    }
}