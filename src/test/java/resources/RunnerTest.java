package resources;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = {"src/test/java/br/com/marcos/ruiz/desafio/tecnico/feature"},
        glue = {"br.com.marcos.ruiz.desafio.tecnico.steps"},
        tags = "@Desafio",
        publish = true)
public class RunnerTest {
}
