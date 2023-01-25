package web_tables;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class scrolling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	driver.quit();
}
}
