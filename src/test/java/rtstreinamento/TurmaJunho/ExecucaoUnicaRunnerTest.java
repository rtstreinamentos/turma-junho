package rtstreinamento.TurmaJunho;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features",
tags = { "@executar-esse" }, 
format = {
		"html:target/cucumber", "json:target/cucumber.json" })
public class ExecucaoUnicaRunnerTest {

}
