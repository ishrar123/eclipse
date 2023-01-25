package miscellanous_topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handling_https_certifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
				
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();// delete all the cookies
		//driver.manage().deleteCookieNamed(null); deleting the particular cookis
		//driver.manage().addCookie(); add the cookies
		
		//session cookie
		/*
		 * after deleting the paticullar cookie , click on the particular link and open the login scenario.
		 */
		driver.get("https://expired.badssl.com/");
	
		System.out.println("title is : " +driver.getTitle());
		driver.quit();
	}

}
