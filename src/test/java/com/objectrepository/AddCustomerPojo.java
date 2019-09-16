package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddCustomerPojo extends FunctionalLibrary {
	public AddCustomerPojo() {
		PageFactory.initElements(w,this);
	}
	@FindAll({
	@FindBy(xpath="//label[@for='done']"),	
	@FindBy(id="done")
	})
	private WebElement donebutton;
	@FindBy(id="fname")
	private WebElement firstname;
	@FindBy(id="lname")
	private WebElement lastname;
	@FindBy(id="email")
	private WebElement mail;
	@FindBy(xpath="//textarea[@name='addr']")
	private WebElement address;
	@FindBy(id="telephoneno")
	private WebElement phone;
	public WebElement getDonebutton() {
		return donebutton;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getPhone() {
		return phone;
	}
	
	}

