package add_to_cart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String[] vegetableName= {"cucumber","Brocolli","Beetroot"};
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	int j=0;
	//find all the elements in the web page
	Thread.sleep(3000);
	List<WebElement> products=driver.findElements(By.cssSelector("h4.prduct-name"));
	for(int i=0;i<products.size();i++) {
		String[] name=products.get(i).getText().split("-");
		String formatname=name[0].trim();
		System.out.println(name);
		List ai=Arrays.asList(vegetableName);
		if(ai.contains(formatname)) {
			//click on the add to cart
			//button[text()='ADD TO CART']
			j++;
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			if(j==3) {
				break;
			}
			
		}
	}
}
}
