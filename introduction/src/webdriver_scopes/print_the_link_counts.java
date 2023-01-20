package webdriver_scopes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_the_link_counts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	driver.findElement(By.xpath("//a[text()='Practice']")).click();
	//give me the links of the page.
	System.out.println("the no of links are are " +driver.findElements(By.tagName("a")).size());
	
	//getting the count of the links in the footer section
	/*
	 * to do this we have to limit the scope of the webdriver
	 */
	WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
	System.out.println("the no of links in the footer section are: " +footerdriver.findElements(By.tagName("a")).size());
	WebElement columndriver=driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
	System.out.println("the no of links in the columns section are: " +columndriver.findElements(By.tagName("a")).size());
	
	driver.quit();
}
}
