package com.stc.tests.difference;

import org.testng.annotations.DataProvider;

public class DifferenceDataProvider {
    @DataProvider(name = "dpDiffPositive")
    static Object[][] dpDiffPositive() {
        return new Object[][] {
                {"10", "5", 5.0 },
                {"55", "25", 30.0}
        };
    }

    @DataProvider(name = "dpDiffNegative")
    static Object[][] dpDiffNegative() {
        return new Object[][] {
                {"-15", "-5", -10.0},
                {"-5", "2", -7.0 }
        };
    }

    @DataProvider(name = "dpSmokeDiff")
    static Object[][] dpSmokeDiff() {
        return new Object[][] {
                {"4", "2", 2.0},
                {"10", "2", 8.0}
        };
    }

    @DataProvider(name = "dpFormatCheck")
    static Object[][] dpFormatCheck() {
        return new Object[][] {
                {"_", "5"},
                {".", "-5"},
                {"sjhkj", "3"}
        };
    }
}
