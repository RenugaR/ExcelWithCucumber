$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/ExcelData.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The CUSTOMER is in FB Home",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginWithExcel.the_CUSTOMER_is_in_FB_Home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The CUSTOMER enters username and password and clicks submit button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginWithExcel.the_CUSTOMER_enters_username_and_password_and_clicks_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Customer see the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginWithExcel.the_Customer_see_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});