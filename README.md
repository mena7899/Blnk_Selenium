# BLNK-Selenium

## 1-Setup instructions

### clone the online repo "https://github.com/mena7899/Blnk-Selenium"

## 2-Tools Used

### Intellij IDE 

### Java 17

### Selenium 4.34

### TestNG 7.11.0

### WebDriverManager 6.1.1

### Maven (added to the environmetal varibles)


## 3-How to run the test

### use git no navigate to the project folder and run "mvn clean install -DskipTests" and "mvn test"

### a google chrome UI(head mode) will be opened 

### a test report will be generated in the following path "target/surefire-reports/emailable-report.html"

### if there is a test failure a screenshot of the failure will be saved in this path resources/screenshots/{testMethodName}.png