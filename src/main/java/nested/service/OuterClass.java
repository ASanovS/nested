package nested.service;

import lombok.Data;

@Data
public class OuterClass {

    private String outerName;
    private static String outerStaticName;
    private static final String OUTER_STATIC_NAME = "";

    static class NestedClass {

        private String nestedClassName;
        private static String nestedClassStaticName;
        private static final String NESTED_CLASS_STATIC_NAME = "";
    }

    class InnerClass {

        private String innerName;
        private static String innerStaticName;
        private static final String INNER_STATIC_NAME = "";
    }
}
