package com.stc.tests.multiplication;

import org.testng.annotations.DataProvider;

public class MultiplicationDataProvider {
    @DataProvider(name = "dpSmokeMulti")
    static Object[][] dpSmokeMulti() {
        return new Object[][] {
                {"2", "2", 4.0},
                {"-1", "3", -5.0}
        };
    }

    @DataProvider(name = "dpMultiPositive")
    static Object[][] dpMultiPositive() {
        return new Object[][] {
                {"4", "4", 16.0},
                {"20", "4", 80.0}
        };
    }

    @DataProvider(name = "dpMultiNegative")
    static Object[][] dpMultiNegative() {
        return new Object[][] {
                {"-5", "10", -50.0},
                {"-2", "2", -4.0}
        };
    }

    @DataProvider(name = "dpFormatCheck")
    static Object[][] dpFormatCheck() {
        return new Object[][] {
                {"_","2"},
                {",","20"},
                {"*", "3"}
        };
    }
}