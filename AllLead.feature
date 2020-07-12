Feature: All Lead scenario in Leaftaps

Background: 
Given Open the chrome browser and load the URL
And Enter the username as Demosalesmanager and password as crmsfa
And Click the Login button
And Click the CRMSFA link
And Click the Leads tab

Scenario Outline: Positive flow to create a Lead
And Click the Create Lead link
And Enter the company name as <Company Name>
And Enter the first name as <First Name>
And Enter the last name as <Last Name>
When Click the Create Lead button
Then Verify Lead is created with Lead ID

Examples:
|Company Name|First Name|Last Name|
|Testleaf|Keerthivyas|K|
|Testleaf|Balaji|P|

Scenario: Positive flow to delete a Lead
And Click the Find Leads tab
And Click the Phone tab
And Enter the phone number as 9876543230
And Click on Find Leads
And Click on first record
When Click on Delete button
Then Lead deleted successfull

Scenario: Positive flow to Edit a Lead
And Click the Find Leads tab
And Click the Phone tab
And Enter the phone number as 9876543230
And Click on Find Leads
And Click on first record
And Click on Edit button
And Update Company Name
When Click on Submit
Then Lead updated successfull

Scenario: Positive flow to Duplicate a Lead
And Click the Find Leads tab
And Click the Phone tab
And Enter the phone number as 9876543230
And Click on Find Leads
And Click on first record
And Click on Duplicate button
When Click on Submit button
Then Duplicate Lead created successfull

Scenario: Positive flow to Merge a Lead
And Click on Merge Lead tab
And Click on From Lead icon
And Enter first name as gopi and click on find lead and Select the first from record
And Click on To Lead icon
And Enter first name as keerthivyas and click on find lead and Select the first to record 
And click on Merge button
When Accept the alert to merge lead
Then Lead Merge successfull