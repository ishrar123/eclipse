package testng_frmaework_tutroials;

import org.testng.annotations.Test;

public class running_test_cases {
    
	@Test(groups={"smoke"})
	public void demo() {
		System.out.println("this is test case run by testng");
	}
	
	@Test
	public void secondtestcase() {
		System.out.println("this is the second test case in the same class");
	}

}
