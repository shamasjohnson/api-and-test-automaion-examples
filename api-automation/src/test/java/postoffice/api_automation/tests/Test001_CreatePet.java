package postoffice.api_automation.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import postoffice.api_automation.pojo.*;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Test001_CreatePet
{
    
	@Test
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
    	tag2.setName("wriggly");
    	
    	List<Tags> tags = new ArrayList<>();
    	tags.add(tag1);
    	tags.add(tag2);
    	
    	List<String> urls = new ArrayList<>();
    	urls.add("https://www.google.com");
    	urls.add("https://www.yahoo.com");
    	
    	
    	PostObject postObj = new PostObject();
    	postObj.setId(5180980);
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
    
}
