package seleniuim_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoking browser
		//ChromeDriver driver=new ChromeDriver();
		//here driver is object of the class which has access to all the methods of the chromedriver class.
		
		//setting the path of the chromedriver.exe file for automated of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1=new ChromeDriver();
		//here driver is the object of the interface wwebDriver which has access all the methods of all the chromedriver , firefox , and all other browsers.
		//and we only want to implement the methods of the chromedriver class so we use the chromderiver class.
		
		//launching the url of the website
		driver1.get("https://rahulshettyacademy.com");
		System.out.println("the tilte of the page is : " + driver1.getTitle());
		System.out.println("the current url of the website is : " + driver1.getCurrentUrl());
		
		//close the current window or browse which is originally open or close the  current tabs which si open
		//driver1.close();
		
		//closing all the instances of the window or close the windows
		driver1.quit();
		
		
		
		
	}

}
