package com.stc.tests.sum;

import org.testng.annotations.DataProvider;

public class SumDataProvider {
    @DataProvider(name = "dpSumPositive")
    static Object[][] dpSumPositive() {
        return new Object[][] {
            {"1", "2", 3.0},
            {"15", "20", 35.0}
        };
    }

    @DataProvider(name = "dpSumNegative")
    static Object[][] dpSumNegative() {
        return new Object[][] {
                {"-1", "-2", -3.0},
                {"-10", "-15", -25.0}
        };
    }

    @DataProvider(name = "dpFormatCheck")
    static Object[][] dpFormatCheck() {
        return new Object[][] {
                {"_","2"},
                {",","20"}
        };
    }

    @DataProvider(name = "dpSmokeSum")
    static Object[][] dpSmokeSum() {
        return new Object[][] {
                {"1", "2", 3.0},
                {"-1", "-2", -3.0}
        };
    }
}
