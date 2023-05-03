package com.sparta.mua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTests {

    @Test
    @DisplayName("check that racecar return true")
    void checkGreaterThan3() {
        Assertions.assertEquals(true, Main.validateWord("racecar"));
    }

    @Test
    @DisplayName("check that racecar return false")
    void checkLessThan3() {
        Assertions.assertEquals(false, Main.validateWord("ab"));
    }

}
