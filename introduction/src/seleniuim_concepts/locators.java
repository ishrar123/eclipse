package seleniuim_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) throws InterruptedException {
		//locators will tell you where the html componenets are located
		//locators are a way to idnetify the html elements on the web page
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		driver.findElement(By.className("submit")).click();
		
		//cssselector syntax
		//calssname->tagname.classname
		//id= tagname#id
		
		//tagname[attribute="value"]
		//Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//driver.quit();
	}
}
