### TestNG 

**What is TestNG?**
- TestNG stands for "Test Next Generation." 
- It is an open-source unit testing framework that's used to enhance the testing capabilities in software development.
- It provides more advanced functionalities compared to the standard testing frameworks, such as grouping, sequencing, and parameterizing of tests.

**Why do we need to use TestNG?**
- **Flexibility in Configuration**: Allows different ways to set up testing environments, making it suitable for various kinds of test scenarios.
- **Data-Driven Testing**: Enables tests to be driven by external data sources such as Excel files.
- **Enhanced Reporting**: Provides detailed reports on the outcomes of tests, which are crucial for debugging and development feedback.

**How to use the TestNG framework?**
- **Install TestNG Plugin**: For Eclipse , you would need to install the TestNG plugin through the Eclipse's marketplace 
- **Add Dependencies**: Incorporate TestNG dependencies into your `pom.xml`.

**What is a Plugin?**
- A plugin is a software add-on that is installed on a program to add a specific feature to an existing computer program. When a program supports plugins, it enables customization.
- In the Eclipse, a plugin like TestNG can be installed to extend its capabilities to manage and run tests more effectively.



### TestNG Features

**Supports multiple execution in Single Run**
- Definition: Allows multiple tests to be executed in a single command or action.
- Use Case: When a comprehensive test suite has to be run.

**Supports sequential and parallel execution**
- Definition: Tests can be run one after the other (sequentially) or simultaneously (in parallel) to reduce total test execution time.
- Use Case: Useful in large projects to improve speed and efficiency of testing, especially when tests are independent.

**Generates reports and provides the status of the execution**
- Definition: Automatically generates detailed reports after test execution that show which tests passed, failed, or skipped.
- Use Case: Essential for analyzing test results, identifying bugs, and improving software quality.

**Supports to configure execution using annotations and attributes**
- Definition: Offers annotations like @Test, @BeforeMethod, etc., to control test flow and configure test methods.
- Use Case: To set up pre-conditions or clean-up actions, or to group and prioritize tests.

**Supports multiple test data (data-driven testing)**
- Definition: Enables tests to run with different sets of data inputs for validation against multiple data scenarios.
- Use Case: To ensure that the application behaves correctly with various inputs, enhancing test coverage.

**Supports Cross-browser testing**
- Definition: Allows tests to be run across different web browsers to ensure compatibility.
- Use Case: Essential for web applications to confirm consistent behavior and performance across multiple browsers.

**Supports Assertion**
- Definition: Provides assertion capabilities to verify that the application behaves as expected.
- Use Case: To validate the actual outcomes of test cases against expected outcomes.

**Supports to rerun the failed test cases**
- Definition: Facilitates automatic rerun of tests that have failed in a test run.
- Use Case: To isolate failures and ensure they are consistent and not due to transient issues or flakiness.

**Supports to categorize the test cases using TestNG groups**
- Definition: Allows categorization of test cases into groups for selective test execution.
- Use Case: To run a targeted subset of tests, like smoke, regression, or functional tests, without running the entire suite.


### Steps to start with TestNG:
# Convert normal script into a TestNG script:
1.  Remove static keyword from the main method
2.  Remove the input arguments(String[] args)
3.  Give a meaningful name to the method
4.  Add @Test on the top of the method
5.  Import from org.testng.annotations.
6.  Right click on the testcase Run as-> 1 TestNG Test

## Steps to do sequential execution:
1. Select the required testcases 
2. Right click on the testcases -> click TestNG -> convert to TestNG
   -> a testng.xml wizard will appear.
3. Click finish and run fro the xml file

## View basic reports:
  - After execution-> refresh the project -> test-output folder will appear
  -open index.html / emailable-report.html -> open with system editor 


#Steps to Excute TestNG Test

1. Convert the main method into normal method
   - remove static keyword 
   - remove String[] args
   - rename the method name

2. Add @Test annotation in the method top
3. Import Test annotation from org.testng.annotations




*Steps to resolve compliation error in xml*
1. Go to Problems tab (window from menu -> show view -> problems)
2. Expand errors 
3. Do right click on 'Downloading external resources is disabled'
4. Click on 'quick fix'
5. click on finish button




*Steps to create TestNG class*
1. Do right click on package
2. Choose 'TestNG' --> 'Create a TestNG Class'
3. In source folder location change from 'test' to 'main'
4. Provide a proper Class name
5. Enable the checkboxes and click on finish button.


*Steps to do Common Integration*
1. Steps a class as ProjectSpecificMethod(Base class)
2. Declare a two methods which are preCondition() and postCondition() 
3. Add @BeforeMethod for preCondition() and @AfterMethod for postCondition()
4. Declare the driver variable globally
5. Write TestSteps for launch browser, load url , implicitlyWait, maximize window in preCondition()
6. Write testStep to close the browser in postCondition()
7. Do inheritance in Testcase class 
8. In Testcase method Remove or comment the testSteps written in base(ProjectSpecifcMethod)

*Possible Exception are:*
1. nullPointerException - Check driver declaration 
2. noSuchSessionException - using driver.close() in multiple methods(Testcase() and postCondition())