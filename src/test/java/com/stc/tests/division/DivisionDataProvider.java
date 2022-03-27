package com.stc.tests.division;

import org.testng.annotations.DataProvider;

public class DivisionDataProvider {
    @DataProvider(name ="dpSmokeDivision")
    static Object[][] dpSmokeDivision() {
        return new Object[][] {
                {"6", "2", 3.0},
                {"-50", "2", -25.0 }
        };
    }

    @DataProvider(name = "dpDivisionPositive")
    static Object[][] dpDivisionPositive() {
        return new Object[][] {
                {"10", "2", 5.0},
                {"100", "4", 25.0}
        };
    }

    @DataProvider(name = "dpDivisionNegative")
    static Object[][] dpDivisionNegative() {
        return new Object[][] {
                {"-10", "2", -5.0},
                {"-100", "0", 25.0}
        };
    }

    @DataProvider(name = "dpFormatCheck")
    static Object[][] dpFormatCheck() {
        return new Object[][] {
                {" ", "-4"},
                {".", " 6"}
        };
    }
}
