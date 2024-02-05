package com.bdd.stepdefinition;

import com.bdd.step.AutomationExerciseStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class AutomationExerciseStepDefinition {
    @Steps
    AutomationExerciseStep automationExerciseStep;

    @Dado("^estoy en la pagina web Automation Exercise \"([^\"]*)\"$")
    public void estoyEnLaPaginaWebAutomationExercise(String navegador) throws Throwable {
        automationExerciseStep.estoyEnLaPaginaWebAutomationExercise(navegador);
    }

    @Y("^ingreso el correo \"([^\"]*)\"$")
    public void ingresoElCorreo(String sCorreo) throws Throwable {
        automationExerciseStep.ingresoElCorreo(sCorreo);
    }

    @Cuando("^ingreso la contraseña \"([^\"]*)\"$")
    public void ingresoLaContraseña(String sContrasena) throws Throwable {
        automationExerciseStep.ingresoLaContraseña(sContrasena);
    }

    @Entonces("^en la pantalla principal deberia mostrarme mi nombre de usuario$")
    public void enLaPantallaPrincipalDeberiaMostrarmeMiNombreDeUsuario() {
        automationExerciseStep.enLaPantallaPrincipalDeberiaMostrarmeMiNombreDeUsuario();
    }

    @Entonces("^en el inicio de sesión deberia mostrarme un error de credenciales$")
    public void enElInicioDeSesiónDeberiaMostrarmeUnErrorDeCredenciales() {
        automationExerciseStep.enElInicioDeSesiónDeberiaMostrarmeUnErrorDeCredenciales();
    }
}
