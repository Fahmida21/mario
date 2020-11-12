$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 1,
  "name": "Search Functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify login",
  "description": "",
  "id": "search-functionality;verify-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Click on Signin Link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on Signin Button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter UserPass and click login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify user login successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "homePageStepDep.launch(String)"
});
formatter.result({
  "duration": 2383401201,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.Click_on_Signin_Link()"
});
formatter.result({
  "duration": 643412599,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.Click_on_Signin_Button()"
});
formatter.result({
  "duration": 5973397099,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.Enter_UserPass_and_click_login()"
});
formatter.result({
  "duration": 920610701,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.Verify_user_login_successfully()"
});
formatter.result({
  "duration": 3403998501,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify search result",
  "description": "",
  "id": "search-functionality;verify-search-result",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Type product name",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click search",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify Search result",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "homePageStepDep.launch(String)"
});
formatter.result({
  "duration": 1901094400,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.type_product_name()"
});
formatter.result({
  "duration": 190859100,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_search()"
});
formatter.result({
  "duration": 1164394599,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.verify_Search_result()"
});
formatter.result({
  "duration": 5014028900,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify search result",
  "description": "",
  "id": "search-functionality;verify-search-result",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Click on product",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Click on Eletronics and Accessories",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Select Home button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Verify the search page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "homePageStepDep.launch(String)"
});
formatter.result({
  "duration": 1950192900,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_product()"
});
formatter.result({
  "duration": 363532200,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_Eletronics_and_Accessories()"
});
formatter.result({
  "duration": 167330700,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.select_Home_button()"
});
formatter.result({
  "duration": 3773140699,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.verify_the_search_page()"
});
formatter.result({
  "duration": 1402979600,
  "status": "passed"
});
});