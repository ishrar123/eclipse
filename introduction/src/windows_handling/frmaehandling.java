package windows_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frmaehandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	//getting the number of frmaes in the website
  System.out.println("the total no of frmaes are: " +driver.findElements(By.tagName("iframe")).size());
	//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
  //switch to frame based on the index.
  driver.switchTo().frame(0);
  
	driver.findElement(By.id("draggable")).click();
	Actions a =new Actions(driver);
	WebElement start=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	a.dragAndDrop(start,target).build().perform();
	
	//exit out of the frmaes
	driver.switchTo().defaultContent();
}
}
