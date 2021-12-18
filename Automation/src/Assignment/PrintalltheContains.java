package Assignment;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintalltheContains
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("Enter the Url");
		Scanner sc=new Scanner(System.in);
		String Url = sc.nextLine();
		driver.get(Url);
		List<WebElement> allcontain = driver.findElements(By.xpath("//td"));
		int count=allcontain.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			 String text = allcontain.get(i).getText();
			 System.out.println(text);
		}
        driver.close();
	}

}
