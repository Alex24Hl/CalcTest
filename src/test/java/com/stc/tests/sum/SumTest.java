package com.stc.tests.sum;

import calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(dependsOnGroups = {"smokeSumTest"})
public class SumTest {

    private Calculator calc;

    @BeforeClass
    public void setUp() {
        calc = new Calculator();
    }

    @Test(groups = {"smokeSumTest"}, dataProvider = "dpSmokeSum", dataProviderClass = SumDataProvider.class)
    public void smokeSumTest(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.sum(inputA, inputB), result);
    }

    @Test(dataProvider = "dpSumPositive",dataProviderClass = SumDataProvider.class)
    public void positiveNumbers(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.sum(inputA, inputB), result, "Sum inputA "+ inputA +" + inputB " + inputB);
    }

    @Test(dataProvider = "dpSumNegative", dataProviderClass = SumDataProvider.class)
    public void negativeNumbers(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.sum(inputA, inputB),result, "Sum inputA "+ inputA +" + inputB " + inputB);
    }

    @Test(dataProvider = "dpFormatCheck",dataProviderClass = SumDataProvider.class, expectedExceptions = NumberFormatException.class)
    public void formatCheck(String inputA, String inputB) {
        calc.sum(inputA, inputB);
    }
}
