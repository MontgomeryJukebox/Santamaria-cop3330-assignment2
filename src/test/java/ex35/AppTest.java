package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void pickWinner() {
        ArrayList<String> people = new ArrayList<String>();
        people.add("bob");
        people.add("rob");
        people.add("sob");
        people.add("dob");
        assert(people.contains(App.pickWinner(people)));
    }
}