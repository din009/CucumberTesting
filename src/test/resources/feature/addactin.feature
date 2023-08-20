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
@tag
Feature: Registration
  I want to use this template for my feature file
	Background:
	Given load the adactin url ("https://adactinhotelapp.com/")
	
	
  @tag1
  Scenario: Validating Registration Page
  	Given click new register here link  
    When Input Username "dineshaiite"
    And input Password "Test@123"
    And input ConfirmPassword "Test@123"
    And input Full Name "Dinesh Kumar"
    And input Email Address "dinesh@gmail.com"
    And click on Register
    Then validate Register is sucessful

