package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	public static WebDriver w;
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-Hari\\Cucumber\\driver\\chromedriver.exe");
		w = new ChromeDriver();
		w.get(url);
}
	public static void insert(WebElement e,String value) {
		e.sendKeys(value);
		}
	public static void button(WebElement e) {
		e.click();
		

	}

}
