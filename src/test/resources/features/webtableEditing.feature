Feature: Webtable Editing
   Background:
     Given I as the QA engineer candidate navigate to the "https://www.way2automation.com"
     And I as the QA engineer candidate go to the "https://www.way2automation.com/angularjs-protractor/" page
     And I as the QA engineer land on webtables page

   Scenario Outline: Editing date using valid values/positive test
     Given I as the QA engineer click the Add User button
     And I as the QA engineer enter "<First Name>" for name
     And I as the QA engineer enter "<Last Name>" for last name
     And I as the QA engineer enter "<User Name>" for user name
     And I as the QA engineer enter "<Password>" for password
     And I as the QA engineer choose a company
     And I as the QA engineer select a "<Role>"
     And I as the QA engineer enter my "<E-mail>" for email
     And I as the QA engineer enter my "<Cell Phone>" for cell phone
     When I as the QA engineer click the Save button
     Then My info is added to the table
     Examples:
     |First Name|Last Name|User Name|Password|   E-mail       |Cell Phone|Role|
     |Bliss     |Yaman    |Saadet   |Bliss123|bliss@gmail.com |123456789 |Admin|




   @Test
   Scenario: Deleting one row from webtable
     Given data of user name of novak is on the webtable
     And I as the QA engineer click novak's cancel button
     When I as the QA engineer click OK button
     Then novak's data is deleted from the webtable

