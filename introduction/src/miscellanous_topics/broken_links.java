package miscellanous_topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {
public static void main(String[] args) throws MalformedURLException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\testingxperts\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//identify whether a link is working or not
	//there are some java methods which gets you the status code to identify the broken link.
	String url=driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
     
	HttpURLConnection  conn=(HttpURLConnection)new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int responseCode=conn.getResponseCode();
	System.out.println("the response Code is :" +responseCode);
	driver.quit();
}
}
