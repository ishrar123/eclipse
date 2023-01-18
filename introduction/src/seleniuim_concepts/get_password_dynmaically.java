package seleniuim_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class get_password_dynmaically {
	static String name="rahul";
	static String url="https://rahulshettyacademy.com/locatorspractice/";
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 login(driver);
	 logout(driver);
	 //implicitly wait
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	 String password=getpassword(driver);
//	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
//	 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//	 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
//
//	 driver.findElement(By.id("chkboxOne")).click();
//	 driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
//	String actual_text= driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
//	System.out.println(actual_text);
//	Assert.assertEquals(actual_text, "You are successfully logged in.");
//	String get_name=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
//	System.out.println(get_name);
//	Assert.assertEquals(get_name, "Hello " + name + ",");
//	
//	//logout from the application
//	driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
//	String sign_in_text=driver.findElement(By.cssSelector("form h1")).getText();
//	Assert.assertEquals(sign_in_text, "Sign in");

}

public static  String getpassword(WebDriver driver) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	driver.get(url);
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
	String pasword=driver.findElement(By.cssSelector("form p")).getText();
	System.out.println(pasword);
    String [] password_array=pasword.split("'");
   //this split method will create the array in which it stores the 
   //0th index='please use temporary pasword '
   //1st index='rahulshety academy to login'
   String password= password_array[1].split("'") [0];
   return password;
    // it will again split the text in two indexes
    //oth index='rahul shetty academy'
    //1st index='to login'
}

public static void login(WebDriver driver) throws InterruptedException{
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 String password=getpassword(driver);
	 driver.get(url);
	 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);

	 driver.findElement(By.id("chkboxOne")).click();
	 driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
	String actual_text= driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
	System.out.println(actual_text);
	Assert.assertEquals(actual_text, "You are successfully logged in.");
	String get_name=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
	System.out.println(get_name);
	Assert.assertEquals(get_name, "Hello " + name + ",");
	
}

public static void logout(WebDriver driver) {
	driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	String sign_in_text=driver.findElement(By.cssSelector("form h1")).getText();
	Assert.assertEquals(sign_in_text, "Sign in");

}
}
