package Class_Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoaded 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		try
		{
			driver.get("https://demo.actitime.com/");
			System.out.println("Page is loaded with in 5 seconds and pass");
		}
		catch(TimeoutException e)
		{
			System.out.println("Page is not loaded with in 5 seconds and failed");
		}
		
        driver.close();
	}

}
