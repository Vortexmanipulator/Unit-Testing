package com.sparta.dr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    // all tests are public within junit
//    @Test
//    @DisplayName("This is my first Test")
//    void firstTest() {
//        Assertions.assertEquals(1,2);
//    }
    @Test
    @DisplayName("Given time is 21, return Good Evening")
    void givenTheTimeIs21ReturnGoodEvening() {
        int time = 21;
        String expected = "Good Evening";
        String answer = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given time is 13, return Good Afternoon")
    void givenTheTimeIs13ReturnGoodAfternoon() {
        int time = 13;
        String expected = "Good Afternoon";
        String answer = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given time is 11, return Good Morning")
    void givenTheTimeIs11ReturnGoodMorning() {
        int time = 11;
        String expected = "Good Morning";
        String answer = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given time is 12, return Good Afternoon")
    void givenTheTimeIs11ReturnGoodAfternoon() {
        int time = 12;
        String expected = "Good Afternoon";
        String answer = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, answer);
    }
    *
}
