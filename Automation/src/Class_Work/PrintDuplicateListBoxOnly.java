package Class_Work;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicateListBoxOnly 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Admin/Desktop/Demo6.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<count;i++)
		{
			String text = alloptions.get(i).getText();
			if(hs.add(text)==false)
			{
				System.out.println(text);
			}
		}
		driver.close();
	}
}
