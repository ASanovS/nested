package nested.local;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatingsTest {

    @Test
    public void localSyntax() {
        Greatings greatings = new Greatings();
        greatings.sayHello();
    }
}