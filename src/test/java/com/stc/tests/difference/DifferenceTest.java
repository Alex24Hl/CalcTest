package com.stc.tests.difference;

import calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(dependsOnGroups = {"smokeDiffTest"})
public class DifferenceTest {

    private Calculator calc;

    @BeforeClass
    public void setUp() {
        calc = new Calculator();
    }

    @Test(groups = {"smokeDiffTest"}, dataProvider = "dpSmokeDiff", dataProviderClass = DifferenceDataProvider.class)
    public void smokeDiffTest(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.difference(inputA, inputB), result);
    }

    @Test(dataProvider = "dpDiffPositive", dataProviderClass = DifferenceDataProvider.class)
    public void positiveDifferenceNumbers(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.difference(inputA, inputB),result, "Difference inputA "+ inputA +" - inputB " + inputB);
    }

    @Test(dataProvider = "dpDiffNegative", dataProviderClass = DifferenceDataProvider.class)
    public void negativeDifferenceNumbers(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.difference(inputA, inputB),result, "Difference inputA ("+ inputA +") - inputB " + inputB);
    }

    @Test(dataProvider = "dpFormatCheck", dataProviderClass = DifferenceDataProvider.class,
            expectedExceptions = NumberFormatException.class)
        public void formatCheck(String inputA, String inputB) {
            calc.difference(inputA, inputB);
        }
}
