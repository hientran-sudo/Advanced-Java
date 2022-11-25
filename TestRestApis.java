package rest_assured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TestRestApis {
	@Test
	void getPatient() {
		RestAssured.baseURI="http://localhost:8080/api/v1";
		RequestSpecification httpReq=RestAssured.given();
		Response res= httpReq.request(Method.GET,"/patient");
		String str= res.getBody().asString();
		System.out.println("The Response is "+str);
		int status=res.statusCode();
		Assert.assertEquals(status, 200);
	}
	@Test
	void addPatient() {
		RestAssured.baseURI="http://localhost:8080/api/v1";
		RequestSpecification httpReq=RestAssured.given();
		JSONObject reqparams = new JSONObject();
		reqparams.put("doctor_Name", "Hira");		
		reqparams.put("date_Appt", "2022-09-05");
		reqparams.put("patient_Name", "Lynn");
		
		httpReq.header("Content-Type","application/json");
		httpReq.body(reqparams.toJSONString());
		
		Response res = httpReq.request(Method.POST,"/patient");
		
		String str = res.getBody().asString();
		System.out.println("The Response is "+str);

		int status=res.statusCode();
		Assert.assertEquals(status, 200);
		String statusMessage = res.jsonPath().get("status");
		//Assert.assertEquals(statusMessage, "success");		
		
	}
	@Test
	void updatePatient() {
		RestAssured.baseURI="http://localhost:8080/api/v1";
		RequestSpecification httpReq=RestAssured.given();
		
		String jsonString = "{\r\n"
				+ "    \"id\": 1,\r\n"
				+ "    \"doctor_Name\": \"hannah\",\r\n"
				+ "    \"patient_Name\": \"Bond\",\r\n"
				+ "    \"date_Appt\": \"2022-01-05\"\r\n"
				+ "}";

 
		// Setting content type to specify format in which request payload will be sent.
		// ContentType is an ENUM.
		httpReq.contentType(ContentType.JSON);
		// Adding body as string
		httpReq.body(jsonString);
 
		// Calling PATCH method on URI. After hitting we get Response
		Response res = httpReq.request(Method.PATCH,"/patient/1");
 
		// Printing Response as string
		System.out.println(res.asString());
 
		// Get Validatable response to perform validation
		ValidatableResponse validatableResponse = res.then();
 
		// Validate status code as 200
		validatableResponse.statusCode(200);
		
	}
	
	@Test
	void deletePatient() {
		RestAssured.baseURI="http://localhost:8080/api/v1";
		RequestSpecification httpReq=RestAssured.given();
		Response res= httpReq.request(Method.DELETE,"/patient/17");
		
		String str= res.getBody().asString();
		System.out.println("The Response is "+str);
		int status=res.statusCode();
		Assert.assertEquals(status, 200);
	}

}
