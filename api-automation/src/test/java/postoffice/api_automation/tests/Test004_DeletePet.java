package postoffice.api_automation.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import postoffice.api_automation.TestComponents.BaseTest;

public class Test004_DeletePet extends BaseTest {

	
	
	@Test
	public void DeletePet() {
		
		String petToDelete = "5180980";
		RestAssured.baseURI = "https://petstore.swagger.io";
		RestAssured.basePath = "/v2";
		
		String message = RestAssured.given()
				.when()
				.delete("/pet/"+ petToDelete)
				.then()
				.log()
				.all()
				.extract()
				.path("message");
		
		assertTrue(petToDelete.equals(message));
		
	}
	
	
	
	
}
