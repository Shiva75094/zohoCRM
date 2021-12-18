package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIsEnable
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		boolean login = driver.findElement(By.name("login")).isEnabled();
		
		if(login==true)
		{
			System.out.println("Login is enable and pass");
		}
		else
		{
			System.out.println("Login is not enable and failed");
		}
       driver.close();
	}


}
