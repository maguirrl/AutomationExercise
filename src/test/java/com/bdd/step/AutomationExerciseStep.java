package com.bdd.step;

import com.bdd.page.AutomationExercisePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AutomationExerciseStep extends ScenarioSteps {
    AutomationExercisePage automationExercisePage;

    @Step
       public void estoyEnLaPaginaWebAutomationExercise(String navegador) {
        automationExercisePage.estoyEnLaPaginaWebAutomationExercise(navegador);
    }

    public void ingresoElCorreo(String sCorreo) {
        automationExercisePage.ingresoElCorreo(sCorreo);
    }

    public void ingresoLaContraseña(String sContrasena) {
        automationExercisePage.ingresoLaContraseña(sContrasena);
    }

    public void enLaPantallaPrincipalDeberiaMostrarmeMiNombreDeUsuario() {
        automationExercisePage.enLaPantallaPrincipalDeberiaMostrarmeMiNombreDeUsuario();
    }

    public void enElInicioDeSesiónDeberiaMostrarmeUnErrorDeCredenciales() {
        automationExercisePage.enElInicioDeSesiónDeberiaMostrarmeUnErrorDeCredenciales();
    }
}
