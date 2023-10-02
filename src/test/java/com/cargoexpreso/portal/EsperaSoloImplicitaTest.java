package com.cargoexpreso.portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EsperaSoloImplicitaTest {

    @Test
    public void validarEsperas() {
        WebDriver driver = new ChromeDriver();
        long inicial = System.currentTimeMillis();
        //Espera implicita, es una espera general para cualquier elemento que selenium solicita de la pagina.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



        driver.get("https://portal.cargoexpreso.com");



        WebElement input = driver.findElement(By.id("odcs-sign-in-password|input"));



        driver.quit();
    }
}
