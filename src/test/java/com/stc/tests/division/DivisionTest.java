package com.stc.tests.division;

import calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(dependsOnGroups = {"smokeDivisionTest"})
public class DivisionTest {

    private Calculator calc;

    @BeforeClass
    public void setUp() {
        calc = new Calculator();
    }

    @Test(groups = {"smokeDivisionTest"}, dataProvider = "dpSmokeDivision",
            dataProviderClass = DivisionDataProvider.class)
    public void smokeDivisionTest(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.division(inputA, inputB), result);
    }

    @Test(dataProvider = "dpDivisionPositive", dataProviderClass = DivisionDataProvider.class)
    public void positiveDivisionNumbers(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.division(inputA, inputB), result, "Diviison inputA = "+ inputA +" / inputB = " + inputB);
    }

    @Test(dataProvider = "dpDivisionNegative", dataProviderClass = DivisionDataProvider.class)
    public void negativeDivisionNumbers(String inputA, String inputB, Double result) {
        Assert.assertEquals(calc.division(inputA, inputB), result, "Diviison inputA = ("+ inputA +") / inputB = (" + inputB+")");
    }

    @Test(dataProvider = "dpFormatCheck",
            dataProviderClass = DivisionDataProvider.class,
            expectedExceptions = NumberFormatException.class)
    public void formatCheck(String inputA, String inputB) {
        calc.division(inputA, inputB);
    }
}
