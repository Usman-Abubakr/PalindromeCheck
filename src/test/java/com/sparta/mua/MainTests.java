package com.sparta.mua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTests {

    @Test
    @DisplayName("check that 123 return true")
    void checkMinimum() {
        Assertions.assertEquals(true, Main.validateWord("123"));
    }

    @Test
    @DisplayName("check that 12 return false")
    void checkMinimumFail() {
        Assertions.assertEquals(false, Main.validateWord("12"));
    }

    @Test
    @DisplayName("check that racecar return 7")
    void checkPalindromeTrue() {
        Assertions.assertEquals(7, Main.isPalindrome("racecar"));
    }

    @Test
    @DisplayName("check that racecar return 7")
    void checkPalindromeFalse() {
        Assertions.assertEquals(0, Main.isPalindrome("car"));
    }


}
