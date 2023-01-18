package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_checkboxes {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	
	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	
	//count the number of checkboxes
	//driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	
}
}
