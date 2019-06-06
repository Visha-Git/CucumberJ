This is a ready to use stub for Java projects with Maven, JUnit and Cucumber 4.
It uses maven-failsafe-plugin to call the JUnit runner and execute the tests.

This setup runs tests in parallel. You can change the number of concurent threads by changing the <threadCount> property in pom.xml

To execute the tests run: 
mvn clean install
Or if you want to run a subset of tests only use the tag functionality:
mvn clean install "-Dcucumber.options=--tags @<your tag>"
