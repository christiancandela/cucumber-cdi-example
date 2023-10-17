package co.edu.uniquindio.ingesis.cucumber.ejemplo.test;

import co.edu.uniquindio.ingesis.cucumber.ejemplo.util.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;

@ApplicationScoped
public class StepDefinitionsDos {

    @Inject
    private TestContext testContext;


    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
        Assertions.assertEquals("Se compartio dato",testContext.getDatoCompartido());
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Then("responde {string}")
    public void responde(String respuesta) {
        testContext.setDatoCompartido(respuesta);
    }

    @And("me da la información del usuario \\()")
    public void meDaLaInformacionDelUsuario() {

    }
}
