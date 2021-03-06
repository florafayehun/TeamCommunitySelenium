$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 3,
  "name": "Giftrete Login",
  "description": "",
  "id": "giftrete-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#this is to navigate to the blue sku Citadel homepage"
    }
  ],
  "line": 6,
  "name": "Valid Login on Giftrete Website",
  "description": "",
  "id": "giftrete-login;valid-login-on-giftrete-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "that I naviagate to www.giftrete.com",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I fill my username",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I fill my password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.that_I_naviagate_to_www_giftrete_com()"
});
formatter.result({
  "duration": 9461057581,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_click_the_login_button()"
});
formatter.result({
  "duration": 3343727229,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_fill_my_username()"
});
formatter.result({
  "duration": 3022271,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat bindings.Login.i_fill_my_username(Login.java:37)\r\n\tat ✽.And I fill my username(login.feature:9)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "Login.i_fill_my_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.i_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.i_should_be_logged_in_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("registration.feature");
formatter.feature({
  "line": 3,
  "name": "Giftrete Registration",
  "description": "",
  "id": "giftrete-registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run2"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Valid Registration",
  "description": "",
  "id": "giftrete-registration;valid-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "that a user navigate to Giftete website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "fill the firstname",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user should be successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.that_a_user_navigate_to_Giftete_website()"
});
formatter.result({
  "duration": 18032310214,
  "status": "passed"
});
formatter.match({
  "location": "Registration.the_user_clicks_on_register_button()"
});
formatter.result({
  "duration": 18454029427,
  "status": "passed"
});
formatter.match({
  "location": "Registration.fill_the_firstname()"
});
formatter.result({
  "duration": 384249,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat bindings.Registration.fill_the_firstname(Registration.java:37)\r\n\tat ✽.And fill the firstname(registration.feature:8)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "Registration.the_user_should_be_successfully_registered()"
});
formatter.result({
  "status": "skipped"
});
});