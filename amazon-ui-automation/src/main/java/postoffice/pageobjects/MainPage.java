package postoffice.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;
	
	public MainPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchField;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchButton;
	
		
	public void SearchFor(String itemToSearchFor)
	{
		searchField.sendKeys(itemToSearchFor);
		searchButton.click();
	}
	
	public void NavigateToMainPage()
	{
		driver.get("https://www.amazon.com");
	}

	

}
