package nested.local;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    public void validator() {
        Validator.validatePhoneNumber("123-asd-345");
        Validator.validatePhoneNumber("096-177-9361");
    }
}