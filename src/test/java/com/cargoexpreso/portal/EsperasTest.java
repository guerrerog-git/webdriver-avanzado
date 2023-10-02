package com.cargoexpreso.portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EsperasTest {

    @Test
    public void validarEsperas() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        long inicial = System.currentTimeMillis();
        //Espera implicita
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        String titulo = "Iniciar sesión";
        String tituloEsperado = "";


        driver.get("https://portal.cargoexpreso.com");
        //Esperas explicita
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("odcs-sign-in-username|input")));


        tituloEsperado = driver.getTitle();

        Assert.assertTrue(tituloEsperado.equals(titulo));
        long tiempoFinal = System.currentTimeMillis() - inicial;

        System.out.println("Tiempo que tomo el mostrar el titulo: " + (tiempoFinal));
        driver.quit();
    }
}
