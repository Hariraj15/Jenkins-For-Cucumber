package com.stepdefinition;

import com.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibrary {
	@Before
	public void beforeBackground() {
		launch("http://demo.guru99.com/telecom/");
	}
	@After
	public void afterScenario() {
		w.quit();

	}
	

}
