package testng_frmaework_tutroials;

import org.testng.annotations.Test;

public class third_day {
@Test(groups={"smoke"})
public void weblogin() {
	System.out.println("this is a web login");
}
@Test
public void mobilelogin() {
	System.out.println("this is a mobile login");
}
@Test
public void apilogin() {
	System.out.println("this is a api login");
}
}
