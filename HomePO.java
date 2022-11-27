package pageobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePO {

    WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    //Metodo de validação da página inicial
    public void validatorPaging() throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector("#__next > div.styles__BaseContainer-sc-ksgk7f-0.egoxdZ > span > div > a > div > img"));
        boolean valid = element.isDisplayed();
        Assert.assertTrue(valid,"Imagem não Encontrada");
        Thread.sleep(3000);
    }

    //Método responsável por clicar no menu Hotel
    public void clicarHotel() throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector("#__next > div.styles__BaseContainer-sc-ksgk7f-0.egoxdZ > nav > div > ul > li:nth-child(2) > a > span"));
        element.click();
        Thread.sleep(2000);
    }

}
