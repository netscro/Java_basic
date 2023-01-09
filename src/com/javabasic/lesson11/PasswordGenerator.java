package com.javabasic.lesson11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {

    int passwordLength;

    private final String LETTER_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private final String LETTER_UPPERCASE = LETTER_LOWERCASE.toUpperCase();
    private final String DIGIT = "0123456789";
    private final String UNDERLINE_SYMBOL = "_";

    public PasswordGenerator(int passwordLength) {
        this.passwordLength = passwordLength;
    }

    public String getPassword() {
        StringBuilder pass = new StringBuilder(UNDERLINE_SYMBOL);
        do {
            appendValueByPasswordLength(pass, getRandomValue(LETTER_LOWERCASE));
            appendValueByPasswordLength(pass, getRandomValue(LETTER_UPPERCASE));
            appendValueByPasswordLength(pass, getRandomValue(DIGIT));
        } while (pass.length() < passwordLength);
        return shuffleString(pass.toString());
    }

    private void appendValueByPasswordLength(StringBuilder stringBuilder, char value) {
        if (stringBuilder.length() < passwordLength) {
            stringBuilder.append(value);
        }
    }

    private char getRandomValue(String str) {
        Random random = new Random();
        int select = random.nextInt(str.length());
        return str.charAt(select);
    }

    private String shuffleString(String str) {
        List<String> arr = Arrays.asList(str.split(""));
        Collections.shuffle(arr);
        return String.join("", arr);
    }

}
