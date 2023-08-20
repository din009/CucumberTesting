#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@regression
Feature: Title of your feature
  I want to use this template for my feature file
	
	Background:
	Given load the addactine URL
	
  @sanity
  Scenario: Login to the Addactine Webpage
    When Input Username "dineshaiite"
    And input Password "Test@123"
    And click on the login button
    Then validate Search Hotel Page loaded
    And UserId should be available in search hotel page
    And testing the feature
    
  @smoke 
  Scenario: Login to the Addactine Webpage
    When Input Usernames
    |dinesh|   #List<dinesh,Aathiya,Shobana>
    |Aathiya|
    |Shobana|
    And input Passwords
    |dinesh|aathiya|   # List<List<dinesh,aathiya>,List<shobana,divya>>
		|shobana|divya|
    And click on the login buttons
    |username|dinesh|   # Map<k,v>
		|password|Test@123|
    Then validate Search Hotel Page loadeds
    |username|password|   #List<Map<<username,dinesh><password,Test@123>, Map<<username,aathiya>,<password,Test@234>>
		|dinesh|Test@123|
		|aathiya|Test@234|
    And UserId should be available in search hotel page
    And testing the feature
		
  @sanity
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the <value> in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
