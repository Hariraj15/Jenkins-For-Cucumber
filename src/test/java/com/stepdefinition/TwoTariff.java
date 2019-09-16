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

public class TwoTariff {
	static WebDriver w;
	@Given("user should be in homepage.")
	public void user_should_be_in_homepage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-Hari\\MavenCucumber\\Driver\\chromedriver.exe");
	    w = new ChromeDriver();
	    w.get("http://demo.guru99.com/telecom/");

	    
	}

	@Given("user click on add tariff button")
	public void user_click_on_add_tariff_button() {
		w.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	   
	}

	@When("user enter all fields with data")
	public void user_enter_all_fields_with_data(DataTable data) {
		List<List<String>> list = data.asLists(String.class);
		w.findElement(By.id("rental1")).sendKeys(list.get(0).get(0));
		w.findElement(By.id("local_minutes")).sendKeys(list.get(0).get(1));
		w.findElement(By.id("inter_minutes")).sendKeys(list.get(0).get(2));
		w.findElement(By.id("sms_pack")).sendKeys(list.get(0).get(3));
		w.findElement(By.id("minutes_charges")).sendKeys(list.get(0).get(4));
		w.findElement(By.id("inter_charges")).sendKeys(list.get(0).get(5));
		w.findElement(By.id("sms_charges")).sendKeys(list.get(0).get(6));
		
		   
	}
	@When("user enter all fields with datas")
	public void user_enter_all_fields_with_datas(DataTable table) {
		List<Map<String,String>> map = table.asMaps(String.class,String.class);
		w.findElement(By.id("rental1")).sendKeys(map.get(0).get("MR"));
		w.findElement(By.id("local_minutes")).sendKeys(map.get(0).get("LM"));
		w.findElement(By.id("inter_minutes")).sendKeys(map.get(1).get("IM"));
		w.findElement(By.id("sms_pack")).sendKeys(map.get(1).get("SMS"));
		w.findElement(By.id("minutes_charges")).sendKeys(map.get(1).get("LPMC"));
		w.findElement(By.id("inter_charges")).sendKeys(map.get(1).get("IPMC"));
		w.findElement(By.id("sms_charges")).sendKeys(map.get(2).get("SPC"));
		

	    
	}
	@When("user enter all fields with datass{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_all_fields_with_datass(String MR, String LM, String IM, String SMS, String LPMC, String IPMC, String SPC) {
		w.findElement(By.id("rental1")).sendKeys(MR);
		w.findElement(By.id("local_minutes")).sendKeys(LM);
		w.findElement(By.id("inter_minutes")).sendKeys(IM);
		w.findElement(By.id("sms_pack")).sendKeys(SMS);
		w.findElement(By.id("minutes_charges")).sendKeys(LPMC);
		w.findElement(By.id("inter_charges")).sendKeys(IPMC);
		w.findElement(By.id("sms_charges")).sendKeys(SPC);
		
	
	
	}

    @When("user click on submit button.")
	public void user_click_on_submit_button() {
		w.findElement(By.xpath("//input[@type='submit']")).click();
		
	   
	}

	@Then("tariff plan should be displayed")
	public void tariff_plan_should_be_displayed() {
		w.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed();
	    
	}





}
