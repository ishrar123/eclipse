package add_to_cart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class add_to_cart2 {
	//single product added in the add to cart
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	List<WebElement> productName=driver.findElements(By.xpath("//h4[@class='product-name']"));
	
	//getting all the items name
	for(int i=0;i<productName.size();i++) {
		String name=productName.get(i).getText();
		System.out.println(name);
		if(name.contains("Cucumber")) {
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		}
	}
	
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[text()='Apply']")).click();
	driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	//WebElement dropdown="));
	Select option= new Select(driver.findElement(By.xpath("//select[@style='width: 200px;']")));
	option.selectByVisibleText("India");
	driver.findElement(By.cssSelector("input[class='chkAgree']")).click();
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[@class='wrapperTwo']")).getText();

	
	
}
}
