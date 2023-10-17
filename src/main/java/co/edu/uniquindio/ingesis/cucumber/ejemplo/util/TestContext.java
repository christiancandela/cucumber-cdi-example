package co.edu.uniquindio.ingesis.cucumber.ejemplo.util;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestContext {
    private String datoCompartido;

    public String getDatoCompartido() {
        return datoCompartido;
    }

    public void setDatoCompartido(String datoCompartido) {
        this.datoCompartido = datoCompartido;
    }
}
