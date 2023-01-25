package testng_frmaework_tutroials;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Testng_annontations {
@BeforeSuite
public void beforesuite() {
	System.out.println("this will run before beforesuite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("this will run after aftersuite");
}
@BeforeTest
public void beforetest() {
	System.out.println("this will run before test");
}
@AfterTest
public void aftertest() {
	System.out.println("this will run after all the test");
}
@BeforeClass
public void beforeclass() {
	System.out.println("this will run before class");
}
@AfterClass()
public void afterclass() {
	System.out.println("this will run after the class");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("this will run before method ");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("this will run after method");
}
}
