package postoffice.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {


	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String GetNthSearchResult(int index)
	{

		List <WebElement> resultsCollection = driver.findElements(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']"));
		return resultsCollection.get(index).getText();
	}
}
	
