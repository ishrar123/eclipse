package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updated_dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(3000);
	
//	int i=1;
//	while(i<5) {
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//	}
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for(int i=1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		
		
	}
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	driver.findElement(By.id("btnclosepaxoption")).click();
}
}
