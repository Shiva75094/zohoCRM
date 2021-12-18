package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDemo 
{
	private static WebElement element;

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		WebDriverCommonLib w=new WebDriverCommonLib();
		w.waitForPageLoad(driver);//calling implicit wait
		w.waitForElementVisible(driver, element);//calling explicit wait
		w.customWait(element);//calling custom wait
	    w.selectOptoin(element, 1);//select the option from the listbox using index
	    w.selectOption(element,"idly");//select the option from the listbox using visible text

	}

}
