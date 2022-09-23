package nested.local;

import lombok.Data;
import nested.Application;

public class Validator {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String numbers) {
        final int phoneLength = 10;

        @Data
        class PhoneNumber {
            String formattedPhoneNumber;

            public PhoneNumber(String phoneNumberAsString) {
                String currentNumber = phoneNumberAsString.replaceAll(regularExpression, "");
                if (currentNumber.length() == phoneLength) {
                    formattedPhoneNumber = currentNumber;
                } else {
                    formattedPhoneNumber = null;
                }
            }
        }
        PhoneNumber validNumber = new PhoneNumber(numbers);

        if (validNumber.formattedPhoneNumber == null) {
            Application.log.info("number {} invalid", numbers);
        } else {
            Application.log.info("{} is valid", numbers);
        }
    }
}
