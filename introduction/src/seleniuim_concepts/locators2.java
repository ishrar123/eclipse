package seleniuim_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahul@12gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rahul@12gmail.com");
		driver.findElement(By.xpath("//input[@type='text'] [2]")).clear();
		
		//parent to child xpath
		System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("2563987412");
		driver.findElement(By.xpath("//form/input[3]")).clear();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(2000);
		
		//LOGIN INTO THE APPLICATION
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
		
		
		//indexing
		//tagname[attribute="value"](indexno)
	}

}


//import java.time.Duration;
//
//
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//
//
//
//public class Locators {
//
//
//
//public static void main(String[] args) throws InterruptedException {
//
//// TODO Auto-generated method stub
//
////implicit wait - 2 seconds time out
//
//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
//
//WebDriver driver = new ChromeDriver();
//
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//driver.get("https://rahulshettyacademy.com/locatorspractice/");
//
//driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//
//driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//
//driver.findElement(By.className("signInBtn")).click();
//
//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//
//driver.findElement(By.linkText("Forgot your password?")).click();
//
//Thread.sleep(1000);//
//
//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//
//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//
//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//
//driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
//
//driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
//
//driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//
//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//
//Thread.sleep(1000);
//
//driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//
//driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//
//driver.findElement(By.id("chkboxOne")).click();
//
//driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//
//}
//
//
