package seleniuim_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_navigation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
	driver.navigate().back();
	driver.navigate().forward();
}
}
