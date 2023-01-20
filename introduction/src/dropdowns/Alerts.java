package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	static String text = "rahul";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(4000);
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept();
		//Simplealert(driver);
		Confimraitonalert(driver);

	}

	public static void Simplealert(WebDriver driver) throws InterruptedException {

//		driver.findElement(By.id("alertbtn")).click();
//		Thread.sleep(4000);
//		String alerttext = driver.switchTo().alert().getText();
//		System.out.println(alerttext);
//		driver.switchTo().alert().accept();
	}

	public static void Confimraitonalert(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("confirmbtn")).click();
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(4000);
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
}
