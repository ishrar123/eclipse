package seleniuim_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefix_launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\testingxperts\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		
		driver1.get("https://rahulshettyacademy.com");
		System.out.println("the tilte of the page is : " + driver1.getTitle());
		System.out.println("the current url of the website is : " + driver1.getCurrentUrl());
		driver1.quit();
	}

}
