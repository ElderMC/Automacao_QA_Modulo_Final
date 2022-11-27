package pageobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.ObjectInputStream;

public class ValidacaoPO {

    WebDriver driver;

    public ValidacaoPO(WebDriver driver) {
        this.driver = driver;
    }

   //Validção do elemento destino
    public void validarDestino () {
        WebElement destino = driver.findElement(By.cssSelector("#app-layout > div.hotel-index-page > nav.top-hotel-search-form > div > div:nth-child(1) > span.theme-text--body-4"));
        boolean valido = destino.isDisplayed();
        Assert.assertTrue(valido, "Cidade Inválida");
    }

    //Validação do Elemento Check in
    public void validarCheckin () {
        WebElement checkin = driver.findElement(By.cssSelector("#app-layout > div.hotel-index-page > nav.top-hotel-search-form > div > div:nth-child(2) > p"));
        boolean valido = checkin.isDisplayed();
        Assert.assertTrue(valido, "Check-in Invalido");
        }

    //Validação do Elemento Check Out
    public void validarCheckout() {
        WebElement checkout = driver.findElement(By.cssSelector("#app-layout > div.hotel-index-page > nav.top-hotel-search-form > div > div:nth-child(3) > span.theme-text--body-4"));
        boolean valido = checkout.isDisplayed();
        Assert.assertTrue(valido, "Check-out Invalido");
        }
    }

