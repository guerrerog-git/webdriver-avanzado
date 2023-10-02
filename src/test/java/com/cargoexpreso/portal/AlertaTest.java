package com.cargoexpreso.portal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertaTest {

    @Test
    public void validarAlerta() {
        String url = "https://acortar.link/SuXZgP";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        pausar(3000);
        /**
         *
           // busca en todo el documento
           *  cualquier tipo de elemento
           [@id='content']  predicado o filtro de busqueda
         */
        driver.findElement(By.xpath("//*[@id='content']/button")).click();
        pausar(3000);

        Alert alert = driver.switchTo().alert();
        String texto = alert.getText();

        pausar(3000);

        Assert.assertTrue(texto.equals("Press a button!"));
        alert.accept();



        pausar(3000);
        driver.quit();

    }

    public void pausar(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            e.printStackTrace(); //Desarrollo, log o bitacora.
        }
    }

}
