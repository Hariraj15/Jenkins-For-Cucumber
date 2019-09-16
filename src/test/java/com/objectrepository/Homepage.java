package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class Homepage extends FunctionalLibrary {
	public Homepage() {
		PageFactory.initElements(w,this);
		
	}
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement Customer;
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement Tariff;
	public WebElement getCustomer() {
		return Customer;
	}
	public WebElement getTariff() {
		return Tariff;
	}

}
