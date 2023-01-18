package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_dropdown_updataed {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(4000);
	//driver.findElement(By.xpath("//a[@value='MAA'] ")).click();
	/*
	 * if we did not give the wait then it will pass the test case because chennai has already present in the from section so it has taken the 
	 * that value , but if we give the wait then it will found 2 valurs.
	 */
	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] ")).click();
}
}
