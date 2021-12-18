package Class_Work;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTitle 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> alltitle = driver.getWindowHandles();
		for(String wh:alltitle)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}
      driver.quit();
	}

}
