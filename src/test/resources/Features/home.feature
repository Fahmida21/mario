Feature: Search Functionality


@Sanity
Scenario: Verify login

Given launch "<URL>"
Then Click on Signin Link 
Then Click on Signin Button
Then Enter UserPass and click login 
Then Verify user login successfully 


@Sanity
Scenario: Verify search result

Given launch "<URL>"
Then Type product name 
Then Click search 
Then Verify Search result 

@Sanity
Scenario: Verify search result

Given launch "<URL>"
Then Click on product 
Then Click on Eletronics and Accessories
Then Select Home button
Then Verify the search page










