package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        System.out.println(NameFormatter.format("Emad Aldeen", "Alhanoun"));

        System.out.println(NameFormatter.format("Dr", "Emad Aldeen",
                "M", "Alhanoun", "PhD"));

        System.out.println(NameFormatter.format(null, "Emad Aldeen",
                "M", "Alhanoun", null));

        System.out.println(NameFormatter.format("Emad M Alhanoun"));
    }
}
