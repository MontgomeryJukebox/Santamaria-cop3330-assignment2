package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generatePasswd() {
        int length = 6, special = 1, numbers = 1;
        String psswd = App.generatePasswd(length, special, numbers);
        for (int i = 0; i < psswd.length(); i++) {
            if (!Character.isLetterOrDigit(psswd.charAt(i))) {
                special--;
            } else if (Character.isDigit(psswd.charAt(i))) {
                numbers--;
            }
            length--;
        }

        System.out.println(length + " " + special + " " + numbers);
        assert(length == 0 && special == 0 && numbers == 0);
    }
}