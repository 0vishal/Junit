package Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {


    @Test
    public void firstname_true_test() {
        Userregistration user = new Userregistration();
        boolean result = user.Validfirstname("Monkey");
        Assertions.assertTrue(result);

    }
    @Test
    public void firstname_false_test() {
        Userregistration user = new Userregistration();
        boolean result = user.Validfirstname("mon");
        Assertions.assertFalse(result);
    }
}