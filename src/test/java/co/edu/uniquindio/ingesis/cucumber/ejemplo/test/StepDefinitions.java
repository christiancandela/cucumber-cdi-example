package co.edu.uniquindio.ingesis.cucumber.ejemplo.test;

import co.edu.uniquindio.ingesis.cucumber.ejemplo.util.TestContext;
import io.cucumber.java.en.Given;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class StepDefinitions {
    private final TestContext testContext;

    @Inject
    public StepDefinitions( TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("an example scenario")
    public void anExampleScenario() {
        testContext.setDatoCompartido("Se compartio dato");
    }
}
