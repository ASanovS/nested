package nested.local;

import java.util.Objects;

public class OuterClassForLocal {

    String settings;

    public OuterClassForLocal(String settings) {
        class Person {
            int age = 0;

            public Person(int age) {
                this.age = age;
            }
        }
        this.settings = settings;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OuterClassForLocal that = (OuterClassForLocal) o;
        return Objects.equals(settings, that.settings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settings);
    }
}
