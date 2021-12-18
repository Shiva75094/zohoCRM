package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeHeightwidth
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement user=driver.findElement(By.id("username"));
		int height1 = user.getSize().getHeight();
		int width1 = user.getSize().getWidth();

		WebElement pass=driver.findElement(By.name("pwd"));
		int height2 = pass.getSize().getHeight();
		int width2 = pass.getSize().getWidth();
        if(height1==height2 && width1==width2)
        {
        	System.out.println("Username and Password is Equal");
        }
        else
        {
        	System.out.println("Username and Password is not Equal");
        }
        driver.close();
	}


}
