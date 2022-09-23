package nested.local;

import static nested.Application.log;

public class Greatings {
    public void sayHello() {
        class EnglishHello {
            public final String greating = "Hello";

            public void say() {
                log.info("{}", greating);
            }
        }
        var englishHello = new EnglishHello();
        englishHello.say();
    }
}
