package Class_Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.seleniumhq.org");
		String currenturl = driver.getCurrentUrl();
		if(currenturl.contains("selenium.dev"))
		{
			System.out.println("Url is successfully navigating and pass");
		}
		else
		{
			System.out.println("Url is not navigating so failed");
		}
		driver.close();

	}

}
