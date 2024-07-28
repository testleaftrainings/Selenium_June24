#Steps to Implement multiple StepDefinition Class
-------------------------------------------------
1. Create a class as ProjectSpecificMethod
2. Declare the driver variable globally static in PSM
3. Remove driver variable global declaration in StepDefinition classes
4. All the StepDefinition classes should inherit PSM



#Step to do static parameterization in Cucumber
-----------------------------------------------
1. The Parameterization vale should be pass from feature.
2. Map the test step in step Defintion
3. Add method input argument for stepDefintion method
4. Remove the hardcorded data/value and use variable


#Steps to do dynamic parameterization in Cucumber
-------------------------------------------------
1. Instead of Scenario use Secnario Outline
2. And After all the test steps Add Examples and ||
3. To pass multiple test data Create a header in pipeline for each test information
4. In pipeline add multiple testdata
5. Replace the header in test step with in tag <headername>


#Steps to implement Hooks
-------------------------
1. Create a package as hooks and Create a class as HooksImplementation
2. In Hooks class create a method preCondition() and postCondition()
3. In preCondition() use @Before and postCondition() use @After
4. The Hooks class inherit the PSM Class
5. In the runner Class include hooks package also in glue attribute
6. Ensure the preCondition and postCondition test steps should be comment/remove in the feature file.


