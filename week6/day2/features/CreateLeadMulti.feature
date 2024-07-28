Feature: Leaftaps Create Lead feature

Scenario Outline: Create Lead with valid credentials

#Given Launch the browser and load the url
Given Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify the login is successful 
When Click on crmsfa link
And Click on Leads tab
And Click on Create Lead link
Given Enter the company name as <cname>
And Enter the first name as <fname>
And Enter the last name as <lname>
And Enter the phno as <phno>
When Click on Create lead button
Then Verify the lead is created and print the lead id

Examples:
|cname|fname|lname|phno|
|TestLeaf|Gokul|Sekar|99|
|Qeagle|Babu|M|98|