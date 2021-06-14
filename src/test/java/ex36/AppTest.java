package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void max() {
        ArrayList<Double> a = new ArrayList<Double>();
        a.add(1.0);
        assert(App.max(a) <= 1);
        assert(App.max(a) >= 1);
    }

    @Test
    void min() {
        ArrayList<Double> a = new ArrayList<Double>();
        a.add(2.0);
        a.add(3.0);
        assert(App.min(a) <= 2);
        assert(App.min(a) >= 2);
    }
}