package com.cargoexpreso.portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComboTest {

    @Test
    public void validarCombo() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://jsbin.com/osebed/2");

        Select selectFruits = new Select(driver.findElement(By.id("fruits")));

        Thread.sleep(3000);

        selectFruits.selectByVisibleText("Orange");
        Thread.sleep(2000);
        selectFruits.selectByValue("grape");
        Thread.sleep(2000);
        selectFruits.selectByIndex(1);
        Thread.sleep(2000);
        //???? Assert ??
        int seleccionados = selectFruits.getAllSelectedOptions().size();
        Assert.assertTrue(seleccionados == 3);

        selectFruits.deselectAll();
        Thread.sleep(1000);

        seleccionados = selectFruits.getAllSelectedOptions().size();
        Assert.assertTrue(seleccionados == 0);

        driver.quit();
    }

}
