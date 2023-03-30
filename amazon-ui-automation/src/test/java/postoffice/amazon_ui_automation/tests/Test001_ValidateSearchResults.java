package postoffice.amazon_ui_automation.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

import postoffice.pageobjects.*;
import postofice.amazon_ui_automation.TestComponents.BaseTest;

public class Test001_ValidateSearchResults extends BaseTest {

	@Test
	public void Validate_iPhoneSearch() {
	String searchInput = "iPhone";
	MainPage amazonHome = new MainPage(IntializeDriver());
	
	//Main Test steps
	amazonHome.NavigateToMainPage();
	amazonHome.SearchFor(searchInput);
	SearchPage amazonSearchPage = new SearchPage(driver);
	String searchResultText = amazonSearchPage.GetNthSearchResult(1);
	
	//Log scraped text to screen for nth search result
	System.out.println(searchResultText);
	
	assertTrue(searchResultText.contains(searchInput));
	
	
}

	@After
	public void Teardown() {
		
		driver.close();
		driver.quit();
	}
	
	
}
