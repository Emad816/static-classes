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

    public static String format(String fullName) {

        String suffix = null;
        String namePart =fullName.trim();

        //Pull off the suffix if there's a comma
        if(namePart.contains(",")) {

            String[] parts = fullName.split(",");

            namePart = parts[0].trim();
            suffix = parts[1].trim();
        }

        //Breaks the name into words
        String[] words = namePart.split(" ");

        //last index is always the last name
        String lastName = words[words.length - 1];

        //If the first word ends with a period, it's a prefix
        String prefix = null;
        int firstnameIndex = 0;
        if (words[0].endsWith(".")) {
            prefix = words[0].trim();
            firstnameIndex = 1;
        }

        String firstName = words[firstnameIndex];

        //middle name exists only if a word sits between first and last
        String middleName = null;

        if (firstnameIndex +1 < words.length - 1) {
            middleName = words[firstnameIndex + 1];
        }

        return format(prefix, firstName, middleName, lastName, suffix);
    }

    // Helper: true only if the text exists and isn't just spaces
    private static boolean hasValue(String text) {
        return text != null && !text.trim().isEmpty();
    }
}
