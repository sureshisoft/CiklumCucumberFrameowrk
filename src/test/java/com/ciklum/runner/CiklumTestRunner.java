package com.ciklum.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\LT-SUKR\\eclipse-workspace\\CiklumCucumberFramework\\src\\test\\resources\\Features"
,glue="com.ciklum.Stepdef",dryRun=false, monochrome=true)

public class CiklumTestRunner extends AbstractTestNGCucumberTests {

}
