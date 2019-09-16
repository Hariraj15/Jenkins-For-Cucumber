package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.AddCustomerPojo;
import com.objectrepository.Homepage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class NewCustomerSteps extends FunctionalLibrary {
	/*static WebDriver w;
	@Given("user should be in telecom home page")
	public void user_should_be_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-Hari\\MavenCucumber\\Driver\\chromedriver.exe");
		w = new ChromeDriver();
		w.get("http://demo.guru99.com/telecom/");
	 
    }
*/
	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		Homepage h = new Homepage();
		button(h.getCustomer());
	}

	@When("user should enter all the fields with valid data")
	public void user_should_enter_all_the_fields_with_valid_data() {
		AddCustomerPojo a= new AddCustomerPojo();
		button(a.getDonebutton());
		insert(a.getFirstname(), "Hari");
		insert(a.getLastname(), "Raj");
		insert(a.getMail(), "hariraj.mv@gmail.com");
		insert(a.getAddress(), "Chennai");
		insert(a.getPhone(), "9894730181");
	}

	
	@When("user should enter all the fields with valid data.")
	public void user_should_enter_all_the_fields_with_valid_data(DataTable data) {
		List<String> list = data.asList(String.class);
		w.findElement(By.xpath("//label[@for='done']")).click();
		w.findElement(By.id("fname")).sendKeys(list.get(0));
		w.findElement(By.id("lname")).sendKeys(list.get(1));
		w.findElement(By.id("email")).sendKeys(list.get(2));
		w.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(list.get(3));
		w.findElement(By.id("telephoneno")).sendKeys(list.get(4));	}

	@When("user should enter all the fields with valid datas.")
	public void user_should_enter_all_the_fields_with_valid_datas(DataTable table) {
		Map<String,String> map = table.asMap(String.class,String.class);
		w.findElement(By.xpath("//label[@for='done']")).click();
		w.findElement(By.id("fname")).sendKeys(map.get("fname"));
		w.findElement(By.id("lname")).sendKeys(map.get("lname"));
		w.findElement(By.id("email")).sendKeys(map.get("mail"));
		w.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(map.get("address"));
		w.findElement(By.id("telephoneno")).sendKeys(map.get("phoneno"));
			
		  
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {
		w.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user customer id is generated and displayed")
	public void user_customer_id_is_generated_and_displayed() {
		 Assert.assertTrue(w.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}




}
