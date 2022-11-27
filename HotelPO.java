package pageobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelPO {
    WebDriver driver;

    public HotelPO(WebDriver driver) {
        this.driver = driver;
    }

    //Método responsável por clicar, preencher e selecionar a cidade de destino
    public void enviarCidade(String cidade){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/form/div/div[2]/div[1]/div[2]/div[1]/input"));
        element.click();
        element.sendKeys(cidade);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[1]/button")).click();
    }

    //Método responsável por preencher a data de Check In
    public void enviarDataInicial(String datainicial) throws InterruptedException {
        WebElement clickCampo = driver.findElement(By.cssSelector("#datepicker-hotel-checkin"));
        clickCampo.click();
        clickCampo.sendKeys(datainicial);
        Thread.sleep(1000);
    }

    //Médoto responsável por preencher a data de check out
    public void enviarDataFinal(String dataFinal) throws InterruptedException {
        WebElement clickCampoF = driver.findElement(By.cssSelector("#datepicker-hotel-checkout"));
        clickCampoF.click();
        clickCampoF.sendKeys(dataFinal);
        Thread.sleep(1000);
    }

    //Método responsável por clicar no botão "Buscar"
    public void buscar() throws InterruptedException {
        WebElement element = driver.findElement(By.className("MuiButton-label"));
        element.click();
        Thread.sleep(3000);
    }
}

