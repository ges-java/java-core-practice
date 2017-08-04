package tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.ges.math.Calculator;

/**
 * Testing Calculator.java class
 *
 */
public class CalculatorTest {

	@Test(dataProvider="sum")
	public void test_sum(int num1, int num2, int expected) {
		int result = Calculator.sum(num1, num2);
		Assert.assertEquals(result, expected);
	}
	
	@DataProvider(name="sum")
	public Object[][] data_sum() {
		Object[][] testParams = new Object[][]{
			{0,-4,-4}, 
			{0,0,0},
			{10,14,24}
		};
		return testParams;
	}
	
}
