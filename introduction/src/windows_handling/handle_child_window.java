package windows_handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_child_window {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
	
	//switch from parent to child
	Set<String> windows=driver.getWindowHandles();
	Iterator<String> it=windows.iterator();
	String parentid=it.next();
	String childid=it.next();
	driver.switchTo().window(childid);
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
	//driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
	//split the string based on the at
	driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at");
	//remove the white spaces
   String[] newString=driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at");
   String geetingthepasswordstring= newString[1].trim();
   String emailid=geetingthepasswordstring.split(" ")[0];
  
   System.out.println(emailid);
   driver.switchTo().window(parentid);
   driver.findElement(By.id("username")).sendKeys(emailid);
   //driver.findElement(By.id("username")).sendKeys(emailid]);
}
}
