Feature: Leaftaps login feature

Scenario: Login scenario with valid credentials

Given Launch the browser and load the url
And Enter the username
And Enter the password
When Click on the login button
Then Verify the login is successful 

Scenario: Login scenario with invalid credentials

Given Launch the browser and load the url
And Enter the username
And Enter the password
When Click on the login button 
But Verify the login is successful