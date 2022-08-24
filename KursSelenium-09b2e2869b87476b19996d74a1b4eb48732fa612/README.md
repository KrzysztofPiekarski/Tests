Code for Selenium classes, course
After downloading, remember to upload the appropriate driver (depending on the browser and operating system used).
It is possible to run tests from the IDE and console level:
2.1. Check in Terminal that you have Maven installed

mvn -version
If the version number is displayed, everything is fine. If an error occurred, install maven (example instruction for Windows - https://mkyong.com/maven/how-to-install-maven-in-windows/ and Linux https://www.javahelps.com/2017/10/ install-apache-maven-on-linux.html on Linux should already be installed if you used the script from CodersLab).

2.2. Use the cd command to go to the project folder (where the pom.xml file is). 2.3. Run all the tests in the repository: mvn test

Launching tests in the selected class:

mvn clean test -Dtest = GoogleSearchTest test

Any class name can be used instead of GoogleSearchTest.

There is also an option to run a specific test from the class:

mvn clean test -Dtest = FormTest # formTestNoFirstName test

This will run the formTestNoFirstName test from the FormTest class.

It is also possible to run tests matching a given expression:

mvn clean test -Dtest = FormTest # formTest * test

Runs tests that begin with the formTest phrase from the FormTest class.
