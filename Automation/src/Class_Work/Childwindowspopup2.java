package Class_Work;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowspopup2
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allclose = driver.getWindowHandles();
		for(String wh:allclose)
		{
			driver.switchTo().window(wh);
			driver.close();
		}

	}

}
