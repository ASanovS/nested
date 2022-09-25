package nested.annonimus;

import static nested.Application.log;

public class Annonimus {

    public void sayHelloToCounsuls() {
        final String name = "name";
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

        HelloNestedClass ukraineGreating = new HelloNestedClass() {
            @Override
            public void greet() {
                log.info("Slava Ukraine!!!");
            }

            @Override
            public void greetSomeone(String someone) {
                log.info("Hello, friend {}", name);
            }
        };

        englishGreating.greet();
        englishGreating.greetSomeone("Joe");
        ukraineGreating.greet();
        ukraineGreating.greetSomeone("Jon");
    }
}
