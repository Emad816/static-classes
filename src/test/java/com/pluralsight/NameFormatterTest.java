package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void format() {
        //should print the name im this format (lastName, firstName)
        // arrange
        String firstName = "Mel";
        String lastName = "Johnson";
        String expected = "Johnson, Mel";

        //act
        String actual = NameFormatter.format(firstName, lastName);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void testFormat() {
        //should print the name im this format (lastName, prefix. firstName middleName, suffix)
        //arrange
        String prefix = "Dr.";
        String firstName = "Emad Aldeen";
        String middleName = "M";
        String lastName = "Alhanoun";
        String suffix = "PhD";

        String expected = "Alhanoun, Dr. Emad Aldeen M, PhD";

        //act
        String actual = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        //assert
        assertEquals(expected, actual);

    }

    @Test
    void formatFullName() {
        //should print the name im this format (lastName, prefix. firstName middleName, suffix)
        //Arrange
        String fullName = "Emad M Alhanoun";
        String expected = "Alhanoun, Emad M";

        //Act
        String actual = NameFormatter.format(fullName);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void formatFullName1() {
        //Arrange
        String fullName = "Mr. Emad M Alhanoun, Jr";
        String expected = "Alhanoun, Mr. Emad M, Jr";

        //Act
        String actual = NameFormatter.format(fullName);

        //assert
        assertEquals(expected, actual);
    }
}