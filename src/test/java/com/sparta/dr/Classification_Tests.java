package com.sparta.dr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Classification_Tests {
    @Test // this is a test
    @DisplayName("Given the user is under the age of 12, return 'U,PG & 12 films are available.'")
    void under12() {
        int time = 9;
        String expected = "U & PG films are available.";
        String answer = FilmClassifications.availableClassifications(time);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the user is under 15, return 'U, PG, 12 & 15 films are available.'")
    void under15() {
        int time = 14;
        String expected = "U, PG, 12 & 15 films are available.";
        String answer = FilmClassifications.availableClassifications(time);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the user is over 18, return 'All films are available.'")
    void over18() {
        int time = 200;
        String expected = "All films are available.";
        String answer = FilmClassifications.availableClassifications(time);
        Assertions.assertEquals(expected, answer);
    }


}
