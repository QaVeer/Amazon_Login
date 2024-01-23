AmazonProject



An implementation of a test scenario covering the testing of the Amazon Login,Search & AddToCard Function, using Page Object Pattern. Testing performed in Firefox,Chrome browser, in Windows 10. Code implemented in Eclipse using Java, Selenium WebDriver and TestNG.


Prerequisites:


To run the project, you will need:

JDK 17 - you can download : https://www.oracle.com/java/technologies/downloads/#java17.

Eclipse - you can download : https://www.eclipse.org/downloads/.

Maven - you can download 'Maven integration for Eclipse' from Eclipse Marketplace.

TestNG - you can download 'TestNG for Eclipse' plug-in from Eclipse Marketplace.

FireFox Driver - version used: 121.0.1 (64-bit). Driver is already added to the project in the src/test/resources/drivers folder.

Maven uses the below dependencies:

Selenium WebDriver - used version 4.6.0.
TestNG - used version 7.6.1.

Running the test
In order to perfom the testing, run the testng.xml file, run.bat,pom.xml file.
Address of a website being tested: https://www.amazon.in/

For now, the test convers basic test cases for the Login Page, Cart page content and Search page content.

Screenshot of the current version of the eBay page:

<img width="902" alt="Screenshot_222" src="https://github.com/QaVeer/Amazon_Login/assets/149336120/6e916daa-d848-4166-85e7-22f4f83518cd">


 Project Structure :

 <img width="225" alt="Screenshot_777" src="https://github.com/QaVeer/Amazon_Login/assets/149336120/88acd287-cb02-408d-bc21-a0aeef050f8c">

Following are the test cases covered in the this Project:

Login into application.
Search The products.
AddToCard products.


TestNg.XML:


<img width="858" alt="Screenshot_788" src="https://github.com/QaVeer/Amazon_Login/assets/149336120/f9c52e24-9023-4104-87de-a79cb5af3e7c">

