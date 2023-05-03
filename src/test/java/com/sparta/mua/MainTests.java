package com.sparta.mua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTests {

    @Test
    @DisplayName("check that racecar return true")
    void checkGreaterThan3() {
        Assertions.assertEquals(true, Main.isValidWord("racecar"));
    }

    @Test
    @DisplayName("check that racecar return false")
    void checkLessThan3() {
        Assertions.assertEquals(false, Main.isValidWord("ab"));
    }

}
