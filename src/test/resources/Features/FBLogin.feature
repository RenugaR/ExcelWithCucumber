
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: FBLogin
    Given The user is in FB Home Page
    When The user enters username and password and clicks submit button
    |Renu1234@gmail.com|renu12354|
    Then The customer navigate into home page

  @tag2
  Scenario Outline: FBLogin2
   Given The user is in FB Home Page
    When The user enters username and password and clicks submit button "<Username>","<Password>"
    Then The customer navigate into home page

    Examples: 
      |	Username 						|Password | 
      | Renu1234@gmail.com 	|greens1234 | 
      | pavi1234@gmail.com 	|greens12347 | 
