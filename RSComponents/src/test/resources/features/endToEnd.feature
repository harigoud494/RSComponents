Feature: place the Order END To END

@endToEnd
Scenario: Place the order with Guest customer
Given I am in HomePage
And I search with valid product name "robots"
And I Add product from search results page
And I select minicart to go Basketpage 
And I select checkout Login button
And I select Guest checkout with user email "hari.goud494@gmail.com" 
When I enter Delivery details and click on continue to payment
|usertype|guest|
|Title|Mr.|
|FirstName|Hari|
|LastName|Goud|
|MobleNumber|07466525574|
|companyORYourName|Hari Goud|
|Address Line1|Hounslow|
|Town|Hounslow|
|PostCode|TW3 1TA|
And Enter Payent details
|Card Number|1234|
And select proceed to pay
Then I should see Order Confirmation Page

Scenario: Place the order with Existing customer
Given I am in HomePage
And I search with valid product name "robots"
And I Add product from search results page
And I select minicart to go Basketpage 
And I select checkout Login button
And I enter Enter valid userName and password
|User Name|harigoud|
|password|Test123@|
And I select checkout Login button
When I enter Delivery details and click on continue to payment
|usertype|login|
|Title|Mr.|
|FirstName|Hari|
|LastName|Goud|
|MobleNumber|07466525574|
|companyORYourName|Hari Goud|
|Address Line1|Hounslow|
|Town|Hounslow|
|PostCode|TW3 1TA|
And Enter Payent details
|Card Number|1234|
And select proceed to pay
Then I should see Order Confirmation Page
