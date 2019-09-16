package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TwoCustomer {
	static WebDriver w;
	@Given("user should be in homepage")
	public void user_should_be_in_homepage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-Hari\\MavenCucumber\\Driver\\chromedriver.exe");
		w = new ChromeDriver();
		w.get("http://demo.guru99.com/telecom/");
	    

	   	}

	@Given("user click on add customerbutton")
	public void user_click_on_add_customerbutton() {
		w.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("user enter all fields with valid data")
	public void user_enter_all_fields_with_valid_data(DataTable data) {
		List<List<String>> list = data.asLists(String.class);
		w.findElement(By.xpath("//label[@for='done']")).click();
		w.findElement(By.id("fname")).sendKeys(list.get(0).get(0));
		w.findElement(By.id("lname")).sendKeys(list.get(1).get(3));
		w.findElement(By.id("email")).sendKeys(list.get(2).get(2));
		w.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(list.get(3).get(3));
		w.findElement(By.id("telephoneno")).sendKeys(list.get(2).get(4));
	
	
	   	}

	
	@When("user enter all fields with valid datas.")
	public void user_enter_all_fields_with_valid_datas(DataTable table) {
		List<Map<String, String>>maps = table.asMaps(String.class,String.class);
		w.findElement(By.xpath("//label[@for='done']")).click();
		w.findElement(By.id("fname")).sendKeys(maps.get(0).get("fname"));
		w.findElement(By.id("lname")).sendKeys(maps.get(0).get("lname"));
		w.findElement(By.id("email")).sendKeys(maps.get(0).get("email"));
		w.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(maps.get(0).get("address"));
		w.findElement(By.id("telephoneno")).sendKeys(maps.get(0).get("phoneno"));
	    
	}

	@When("user enter all fields with valid datass.{string},{string},{string},{string},{string}")
	public void user_enter_all_fields_with_valid_datass(String fname, String lname, String email, String address, String phoneno) {
		w.findElement(By.xpath("//label[@for='done']")).click();
		w.findElement(By.id("fname")).sendKeys(fname);
		w.findElement(By.id("lname")).sendKeys(lname);
		w.findElement(By.id("email")).sendKeys(email);
		w.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(address);
		w.findElement(By.id("telephoneno")).sendKeys(phoneno);
		 	
	}
	@When("user click submit button")
	public void user_click_submit_button() {
		w.findElement(By.xpath("//input[@type='submit']")).click();
	    	}

	@Then("user sucessful message is displayed")
	public void user_sucessful_message_is_displayed() {
		Assert.assertTrue(w.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
	}




}
