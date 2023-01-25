package web_tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class table_grids_example2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,400)");
//	Thread.sleep(3000);
//	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
//	
	List <WebElement> values=driver.findElements(By.xpath("//table[@class='table-display']//td[3]"));
	int sum =0;
	for(int i=0;i<values.size();i++) {
	  
	System.out.println(Integer.parseInt(values.get(i).getText()));
	 sum=sum + Integer.parseInt(values.get(i).getText());
	 //System.out.println("the sum is : " +sum);
	 
	}
	System.out.println("the sum is : " +sum);
	
	//driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText();
//	driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText().split(":")[1].trim();
//	driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText().split(":")[1].trim();
//	int total_value=Integer.parseInt(driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText().split(":")[1].trim());
//	System.out.println("the actual sum is :" +total_value);
//	
	//Assert.assertEquals(total_value, sum);
driver.quit();
}
}
