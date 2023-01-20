package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class static_Dropdowns {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown=new Select(staticdropdown);
	Thread.sleep(3000);
	dropdown.selectByIndex(2);
	
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"INR");
}
}
