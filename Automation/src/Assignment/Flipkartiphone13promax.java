package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartiphone13promax
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		Thread.sleep(1000);
		List<WebElement> allprint1 = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		int count1=allprint1.size();
		for(int i=0;i<count1;i++)
		{
			String text = allprint1.get(i).getText();
			
		}
		
		allprint1.get(0).click();
		List<WebElement> product = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../..div/div[1]/div[1]/div"));
		for( int i=0;i<product.size();i++)
		{
			String text1 = product.get(i).getText();
			String text2 = price.get(i).getText();
			System.out.println(text1+"----->"+text2);
		}
		
		driver.close();
	}
		
}



