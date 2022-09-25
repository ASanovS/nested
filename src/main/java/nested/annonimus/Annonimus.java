package nested.annonimus;

import static nested.Application.log;

public class Annonimus {

    public void sayHelloToCounsuls() {

        class EnglishGreating implements HelloNestedClass {

            @Override
            public void greet() {
                log.info("God save the Ukraine!!!");
            }

            @Override
            public void greetSomeone(String someone) {
                log.info("Hello, friend {}", someone);
            }
        }

        HelloNestedClass englishGreating = new EnglishGreating();

        HelloNestedClass Ukraine = new HelloNestedClass() {
            @Override
            public void greet() {
                log.info("God save the Ukraine!!!");
            }

            @Override
            public void greetSomeone(String someone) {
                log.info("Hello, friend {}", someone);
            }
        }
    }
}
