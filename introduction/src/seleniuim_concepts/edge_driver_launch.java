package seleniuim_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class edge_driver_launch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\testingxperts\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		
		driver1.get("https://rahulshettyacademy.com");
		System.out.println("the tilte of the page is : " + driver1.getTitle());
		System.out.println("the current url of the website is : " + driver1.getCurrentUrl());
		driver1.quit();
	}

}
