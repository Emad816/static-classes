package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {}

    public static String format(String firstName, String lastName) {

        return lastName.trim() + ", " + firstName.trim();
    }

    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix) {

        String result = lastName.trim() + ", ";

        if(hasValue(prefix)) {
            result += prefix.trim() + ". ";
        }

        result += firstName.trim() + " ";

        if(hasValue(middleName)) {
            result += middleName.trim();
        }

        if(hasValue(suffix)) {
            result += ", " + suffix.trim();
        }

        return result;
    }

//    public static String format(String fullName) {
//
//
//
//    }

    // Helper: true only if the text exists and isn't just spaces
    private static boolean hasValue(String text) {
        return text != null && !text.trim().isEmpty();
    }
}
