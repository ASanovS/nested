package nested.annonimus;

import static nested.Application.log;

public class Greating implements HelloNestedClass{
    @Override
    public void greet() {
        log.info("Ukraine is victory!!!");
    }

    @Override
    public void greetSomeone(String someone) {
        log.info("Hello, new friend {}", someone);
    }
}
