package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ges.practice.interfaces.Developer;
import com.ges.practice.interfaces.Employee;

public class EmployeeCodeTest {
	
	@Test
	public void test_employeeCode() {
		Employee e1 = new Developer("Bilal", "FTE", 60, "java");
		Employee e2 = new Developer("Arshaq", "FTE", 60, "C++");
		int employeeCode1 = e1.getCode();
		Assert.assertEquals(e2.getCode(), employeeCode1 + 1);
	}

}
