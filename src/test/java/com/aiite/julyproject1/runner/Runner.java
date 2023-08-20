package com.aiite.julyproject1.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/test/resources/feature/"},
glue = {"com.aiite.julyproject1.stepdefenition"},
monochrome = true, 
dryRun = false, snippets = SnippetType.CAMELCASE,
publish = false,tags = "@tag1",
plugin = {"pretty","html:Reports/cucumberReport.html","json:Reports/cucumberReport.json"}
)
public class Runner {

}
