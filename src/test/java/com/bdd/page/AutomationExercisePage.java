package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.automationexercise.com")

public class AutomationExercisePage extends PageObject {

    @FindBy(xpath = "//a[@href='/login']")
    WebElement loginLabel;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement correoLabel;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement contrasenaLabel;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//b[text()='ntt']")
    WebElement usuarioLabel;


    public void estoyEnLaPaginaWebAutomationExercise(String navegador) {
        Browser.Start(this, "edge");
    }

    public void ingresoElCorreo(String sCorreo) {
        loginLabel.click();
        correoLabel.sendKeys(sCorreo);
    }

    public void ingresoLaContraseña(String sContrasena) {
        contrasenaLabel.sendKeys(sContrasena);
        loginButton.click();
    }

    public void enLaPantallaPrincipalDeberiaMostrarmeMiNombreDeUsuario() {
        try {
            getDriver().findElement(By.xpath("//b[text()='ntt']"));
            Assert.assertTrue("Se inicio sesión correctamente", true);
        }catch (Exception e) {
            Assert.fail("Error al iniciar sesión");
        }
    }

    public void enElInicioDeSesiónDeberiaMostrarmeUnErrorDeCredenciales() {
        try {
            getDriver().findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
            Assert.assertTrue("El inicio de sesión fallo", true);
        }catch (Exception e) {
            Assert.fail("Esto no deberia pasar");
        }
    }
}
