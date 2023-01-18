package seleniuim_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login_test_case {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 String name="rahul";
	 //implicitly wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

	 driver.findElement(By.id("chkboxOne")).click();
	 driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
	String actual_text= driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
	System.out.println(actual_text);
	Assert.assertEquals(actual_text, "You are successfully logged in.");
	String get_name=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
	System.out.println(get_name);
	Assert.assertEquals(get_name, "Hello " + name + ",");
	
	//logout from the application
	driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	String sign_in_text=driver.findElement(By.cssSelector("form h1")).getText();
	Assert.assertEquals(sign_in_text, "Sign in");

}
}
