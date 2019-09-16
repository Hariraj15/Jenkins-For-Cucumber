package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class OneTariff {
	static WebDriver w;
	@Given("user should be in home page")
	public void user_should_be_in_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-Hari\\MavenCucumber\\Driver\\chromedriver.exe");
	    w = new ChromeDriver();
	    w.get("http://demo.guru99.com/telecom/");
	}

	@Given("user click on add tariff")
	public void user_click_on_add_tariff() {
		w.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	    
	}

	@When("user should enter all tariff fields with valid data")
	public void user_should_enter_all_tariff_fields_with_valid_data() {
		w.findElement(By.id("rental1")).sendKeys("1000");
		w.findElement(By.id("local_minutes")).sendKeys("200");
		w.findElement(By.id("inter_minutes")).sendKeys("100");
		w.findElement(By.id("sms_pack")).sendKeys("10");
		w.findElement(By.id("minutes_charges")).sendKeys("30");
		w.findElement(By.id("inter_charges")).sendKeys("100");
		w.findElement(By.id("sms_charges")).sendKeys("10");
		
	
	}
	@When("user should enter all tariff fields with valid data.")
	public void user_should_enter_all_tariff_fields_with_valid_data(DataTable data) {
		List<String> list = data.asList(String.class);
		w.findElement(By.id("rental1")).sendKeys(list.get(0));
		w.findElement(By.id("local_minutes")).sendKeys(list.get(1));
		w.findElement(By.id("inter_minutes")).sendKeys(list.get(2));
		w.findElement(By.id("sms_pack")).sendKeys(list.get(3));
		w.findElement(By.id("minutes_charges")).sendKeys(list.get(4));
		w.findElement(By.id("inter_charges")).sendKeys(list.get(5));
		w.findElement(By.id("sms_charges")).sendKeys(list.get(6));
		
		}
	@When("user should enter all tariff fields with valid datas.")
	public void user_should_enter_all_tariff_fields_with_valid_datas(DataTable table) {
		Map<String,String> map = table.asMap(String.class,String.class);
		w.findElement(By.id("rental1")).sendKeys(map.get("rental"));
		w.findElement(By.id("local_minutes")).sendKeys(map.get("local min"));
		w.findElement(By.id("inter_minutes")).sendKeys(map.get("inter min"));
		w.findElement(By.id("sms_pack")).sendKeys(map.get("sms pack"));
		w.findElement(By.id("minutes_charges")).sendKeys(map.get("local min charge"));
		w.findElement(By.id("inter_charges")).sendKeys(map.get("inter min charge"));
		w.findElement(By.id("sms_charges")).sendKeys(map.get("sms per charge"));
		
		
	    
	}

    @When("user click on submit button at the bottom")
	public void user_click_on_submit_button_at_the_bottom() {
		w.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("user tariff plan successful is displayed")
	public void user_tariff_plan_successful_is_displayed() {
       w.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed();
	    
	}



}



