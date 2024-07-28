Feature: Leaftaps login feature

#Background: 
#Given Launch the browser and load the url


@Login 
Scenario: Login scenario with valid credentials
#Given Launch the browser and load the url
Given Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify the login is successful
#And Expected title is 'Leaftaps - TestLeaf Automation Platform' and print the input as 'Hello'

@Login @Negative 
Scenario: Login scenario with invalid credentials
#Given Launch the browser and load the url
Given Enter the username as 'demo'
And Enter the password as 'crm'
When Click on the login button 
But Verify the login is successful