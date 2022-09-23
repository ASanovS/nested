package nested.service;

import org.junit.jupiter.api.Test;


class OuterClassTest {

    @Test
    public void creation() {
        OuterClass outerClass = new OuterClass();
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();

    }
}