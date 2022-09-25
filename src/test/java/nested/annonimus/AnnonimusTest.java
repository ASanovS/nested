package nested.annonimus;


import org.junit.jupiter.api.Test;

class AnnonimusTest {

    @Test
    public void regularClass() {
        Greating greating = new Greating();
        greating.greet();
        greating.greetSomeone("Joe");
    }

    @Test
    public void annonimusClass() {
        Annonimus annonimus = new Annonimus();
        annonimus.sayHelloToCounsuls();
    }
}