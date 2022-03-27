package com.stc.tests.multiplication;

import calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(dependsOnGroups = {"smokeMultiTest"})
public class MultiplicationTest {

    private Calculator calc;

    @BeforeClass
    private void smokeMultiTest() {
        calc = new Calculator();
    }

    @Test(groups = {"smokeMultiTest"}, dataProvider = "dpSmokeMulti",
            dataProviderClass = MultiplicationDataProvider.class)
    public void smokeMultiTest(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.multiplication(inputA, inputB), result);
    }

    @Test(dataProvider = "dpMultiPositive", dataProviderClass = MultiplicationDataProvider.class)
    public void positiveMultiplictaionNumbers(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.multiplication(inputA, inputB), result,
                "Multiplication inputA " +inputA+ " * inputB " + inputB);
    }

    @Test(dataProvider = "dpMultiNegative", dataProviderClass = MultiplicationDataProvider.class)
    public void negativeMultiplictaionNumbers(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.multiplication(inputA, inputB), result,
                "Multiplication inputA (" +inputA+ ") * inputB " + inputB);
    }

    @Test(dataProvider = "dpFormatCheck",dataProviderClass = MultiplicationDataProvider.class,
            expectedExceptions = NumberFormatException.class)
    public void formatCheck(String inputA, String inputB) {
        calc.multiplication(inputA, inputB);
    }
}