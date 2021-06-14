package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void removeEmp() {
        ArrayList<String> abc = new ArrayList<String>();
        abc.add("abc");
        abc.add("def");
        abc.add("ghi");
        int size = abc.size();
        App.removeEmp(abc, "abc");
        assert(abc.size() == size - 1);
    }
}