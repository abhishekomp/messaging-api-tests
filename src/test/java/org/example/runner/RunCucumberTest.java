package org.example.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.example.stepdefs,org.example.hooks")
public class RunCucumberTest {

    // This class remains empty; it is used only as a holder for the above annotations
    // The Cucumber engine will automatically discover and run the tests defined in the features directory
}