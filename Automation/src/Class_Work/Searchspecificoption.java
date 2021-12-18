package Class_Work;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Searchspecificoption
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("Enter the option which you wantn to search");
		Scanner sc=new Scanner(System.in);
		String expectedtext=sc.nextLine() ;
		driver.get("C:/Users/Admin/Desktop/Demo6.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement>alloptions=s.getOptions();
		int count=alloptions.size();
		int counter=0;
		for(int i=0;i<count;i++)
		{
			String actualtext=alloptions.get(i).getText();
			if(expectedtext.equals(actualtext))
			{
				counter++;
			}
		}
			if(counter==0)
			{
				System.out.println(expectedtext+" is not present");
			}
			else if(counter==1)
			{
				System.out.println(expectedtext+" is present");
			}
			else if(counter>1)
			{
				System.out.println(expectedtext+" is present with duplicate");
			}
		driver.close();
	}

}
