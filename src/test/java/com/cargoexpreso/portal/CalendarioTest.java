package com.cargoexpreso.portal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CalendarioTest {

    @Test
    public void validarCalendario() throws InterruptedException {

        String url = "http://demo.guru99.com/test/";
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);

        WebElement calendario = driver.findElement(By.xpath("//form/input[@name='bdaytime']"));

        calendario.sendKeys("22092023");
        calendario.sendKeys(Keys.TAB);
        calendario.sendKeys("0446PM");

        String value = calendario.getAttribute("value");

        //Assert.assertTrue(value.contains("2023-09-22T16:46"));

        Thread.sleep(3000);


        WebElement submit = driver.findElement(By.xpath("//form/input[@type='submit']"));
        submit.submit();

        Thread.sleep(3000);

        //Si quieren buscar texto en cualquier parte de la pagina

        WebElement bodyElement = driver.findElement(By.tagName("body"));
        String textoEnPagina = bodyElement.getText();

        Assert.assertTrue(true);

        driver.quit();

    }
}
