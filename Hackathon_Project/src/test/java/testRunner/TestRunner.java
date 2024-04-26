package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {".//FeatureFiles/1st.feature",".//FeatureFiles/2nd.feature",".//FeatureFiles/3rd.feature"},
//					features= {".//FeatureFiles/3rd.feature"},
					//features = {".//FeatureFiles/1st.feature",".//FeatureFiles/2nd.feature"},
					//features = {".//FeatureFiles/1st.feature"},
					//features = {".//FeatureFiles/2nd.feature"},
					glue="stepDefinitions",
					plugin= {"pretty", "html:reports/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true, // to publish report in cucumber server
					tags= "@smoke and @regression"
					
		)
public class TestRunner {

		}
