package br.com.cwi.automation_training.tests;

import org.junit.ClassRule;
import org.junit.runner.RunWith;

import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features = "classpath:features", tags = "@treinamentoCadastro",
=======
@CucumberOptions(features = "classpath:features", tags = "@treinamento",
>>>>>>> branch 'master' of https://github.com/nataliapedroso89/cwi-automation-training.git
	  glue = {""}, monochrome = true, dryRun = false)
public class TreinamentoTest {

	@ClassRule
	public static TestRule testRule = new TestRule();
	
}