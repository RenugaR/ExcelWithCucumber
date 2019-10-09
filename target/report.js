$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/renugadevi.ramesh/eclipse-workspace/Facebook/src/test/resources/Features/FBLogin.feature");
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
  "name": "FBLogin",
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
  "name": "The user is in FB Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FBLogin.the_user_is_in_FB_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters username and password and clicks submit button",
  "rows": [
    {
      "cells": [
        "Renu1234@gmail.com",
        "renu12354"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FBLogin.the_user_enters_username_and_password_and_clicks_submit_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The customer navigate into home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FBLogin.the_customer_navigate_into_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "FBLogin2",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "The user is in FB Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user enters username and password and clicks submit button \"\u003cUsername\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The customer navigate into home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Renu1234@gmail.com",
        "greens1234"
      ]
    },
    {
      "cells": [
        "pavi1234@gmail.com",
        "greens12347"
      ]
    }
  ]
});
formatter.scenario({
  "name": "FBLogin2",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in FB Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FBLogin.the_user_is_in_FB_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters username and password and clicks submit button \"Renu1234@gmail.com\",\"greens1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "FBLogin.the_user_enters_username_and_password_and_clicks_submit_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The customer navigate into home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FBLogin.the_customer_navigate_into_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "FBLogin2",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in FB Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FBLogin.the_user_is_in_FB_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters username and password and clicks submit button \"pavi1234@gmail.com\",\"greens12347\"",
  "keyword": "When "
});
formatter.match({
  "location": "FBLogin.the_user_enters_username_and_password_and_clicks_submit_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The customer navigate into home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FBLogin.the_customer_navigate_into_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});