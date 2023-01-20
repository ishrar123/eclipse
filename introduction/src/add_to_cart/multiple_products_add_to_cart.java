package add_to_cart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_products_add_to_cart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	List<WebElement> productName=driver.findElements(By.xpath("//h4[@class='product-name']"));
	
	//declare the array in which we want all the products
	String[] desiredVegetableNamed= {"Brocolli","Beetroot","Mushroom","Apple","Cucumber"};
	
	//check whether the name you extractd is preset or not
	/*
	 * convert array into araylist for easy search
	 * 
	 */

	for(int i=0;i<productName.size();i++) {
		String name=productName.get(i).getText();
		String[] vegetablename=name.split("-");
		System.out.println(vegetablename[0]);
		List itemsneeded=Arrays.asList(desiredVegetableNamed);
		//System.out.println(itemsneeded);
		if(itemsneeded.contains(vegetablename[0].trim())) {
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		}
	}
	
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[text()='Apply']")).click();

	
	
	driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	
	Thread.sleep(2000);
	Select option= new Select(driver.findElement(By.xpath("//select[@style='width: 200px;']")));
	Thread.sleep(2000);
	option.selectByVisibleText("India");
	driver.findElement(By.cssSelector("input[class='chkAgree']")).click();
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	Thread.sleep(3000);
	driver.quit();
	
	
	
}
}
