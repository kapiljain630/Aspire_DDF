# Aspire_DDF
Aspire DDF
Mandate to have:- Chrome>> Version 97.0.4692.71  [or 97]
See POM.XML for all dependencies.
To Run Testing.XML as TestNG Suite
See Test Output for all QA reports
Properties folder>> Application.properties file have All Locators, App URL, UserName, Password to login
Chrome Driver added in driver folder.
Uses Eclipse IDE to setup all project
Change name of Product_NameText as unique name in Application.properties file under properties folder before run  [for now added unique name, it can be run once without change]
Package>>org.automation.testing.assertions>> Class>> Compare>> [	//Validate Manufacture order created and exist in manufacture list with same  [based on same manufacture order num]]
Package>> org.automation.testing.base>> Class>> Driver INstance>> [Havne Before suites, Before Method, After Suites, After Method]
Packege>> org.automation.testing.pages>> 4 classes there added to have Pages or feature wise Methods, deatils are emntioned in classes for all methods
Package>> org.automation.testing.testcase>> 1 class added, which have all test cases added there.
App Login Flow
Navigate to inventory Feature
Create New Product
Update product Quantity in new product entry
Click Application icon, Navigating home page
create Manufacture Order for new Product
Update Status As Done
Validate the new Manufacturing Order is created with corrected information.
