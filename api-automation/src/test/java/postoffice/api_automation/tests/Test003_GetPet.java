package postoffice.api_automation.tests;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import postoffice.api_automation.TestComponents.BaseTest;
import postoffice.api_automation.pojo.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Test003_GetPet extends BaseTest {
	
	
	@Before
	public void AddNewPet()
    {
    	RestAssured.baseURI = "https://petstore.swagger.io";
    	RestAssured.basePath = "/v2";
    	
    	Category category = new Category();
    	category.setId(999098);
    	category.setName("Ferocious");
    	
    	Tags tag1 = new Tags();
    	tag1.setId(7770799);
    	tag1.setName("shiny");
    	Tags tag2 = new Tags();
    	tag2.setId(7770818);
    	tag2.setName("fluffy");
    	
    	List<Tags> tags = new ArrayList<>();
    	tags.add(tag1);
    	tags.add(tag2);
    	
    	List<String> urls = new ArrayList<>();
    	urls.add("https://www.google.com");
    	urls.add("https://www.yahoo.com");
    	
    	
    	PostObject postObj = new PostObject();
    	postObj.setId(79987889);
    	postObj.setName("Winter Mouse");
    	postObj.setCategory(category);
    	
    	postObj.setPhotoUrls(urls);
    	postObj.setTags(tags);
    	
    	postObj.setStatus("available");
    	
    	int pet_id = RestAssured.given()
    				.contentType(ContentType.JSON)
    				.when()
    				.body(postObj)
    				.post("/pet")
    				.then()
    				.log()
    				.all()
    				.extract()
    				.path("id");
    	
    	System.out.println("Extracted id: " + pet_id);
    	
    	assertTrue(pet_id == postObj.getId());
    }
    
	
	@Test
	public void GetPet() {
		
		RequestSpecification requestSpec = RestAssured.given();
		
		Response response = requestSpec.get("https://petstore.swagger.io/v2/pet/" + "79987889");
		response.prettyPrint();
		ValidatableResponse validatableResponse = response.then();
		validatableResponse.statusCode(200);
	
	}
}
