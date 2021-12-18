package Class_Work;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");//Open google browser
		driver.get("https://www.facebook.com");//Open FB browser
		String title=driver.getTitle();
		System.out.println(title);//Print console windows
		driver.close();//close browser automatically


	}

}
