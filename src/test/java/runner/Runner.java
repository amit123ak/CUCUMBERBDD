package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber_html_report.html","pretty"},
features="features",glue="stepdefinations",
tags="@ninja")
public class Runner {

}
