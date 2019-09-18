$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/DemoCustomerAdd.feature");
formatter.feature({
  "name": "Customer flow",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "New Customer flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "NewCustomerSteps.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter all the fields with valid data",
  "keyword": "When "
});
formatter.match({
  "location": "NewCustomerSteps.user_should_enter_all_the_fields_with_valid_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "NewCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user customer id is generated and displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "NewCustomerSteps.user_customer_id_is_generated_and_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});