Feature: Leaftaps Create Lead feature



@CreateLead   @Positive @Regression
Scenario: Create Lead with valid credentials

#Given Launch the browser and load the url
Given Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify the login is successful 
When Click on crmsfa link
And Click on Leads tab
And Click on Create Lead link
Given Enter the company name as TestLeaf Qeagle
And Enter the first name as Gokul
And Enter the last name as Sekar
And Enter the phno as 99
When Click on Create lead button
Then Verify the lead is created and print the lead id