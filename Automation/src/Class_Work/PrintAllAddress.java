package Class_Work;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAddress
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> alladdress = driver.getWindowHandles();
		int count=alladdress.size();
		System.out.println(count);
		for(String wh:alladdress)
		{
			System.out.println(wh);
		}
       driver.quit();
	}

}
