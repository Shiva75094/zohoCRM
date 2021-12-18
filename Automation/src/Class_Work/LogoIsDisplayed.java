package Class_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LogoIsDisplayed
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		
		if(logo==true)
		{
			System.out.println("Logo is dislayed and pass");
		}
		else
		{
			System.out.println("Logo is not dislayed and failed");
		}
		driver.close();

	}

}
