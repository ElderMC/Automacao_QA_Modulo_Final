package pageobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilsPO {

    WebDriver driver;

    public UtilsPO(WebDriver driver) {
        this.driver = driver;
    }

    //Método responsável por fechar os pop-ups
    public void fecharPopUp() throws InterruptedException {
        WebElement popUp = driver.findElement(By.cssSelector("body > div.styles__WapperPoperBox-sc-1hnwv8t-1.ihQABY > div > div.MuiDialogTitle-root.styles__Title-sc-1hnwv8t-4.jBXAwt > h2 > div > i"));
        popUp.click();
        Thread.sleep(3000);
    }

    //Mensagem de Finalização do Teste
    public void mensagemFinal(){
        System.out.println("Teste Finalizado com Sucesso");
    }

}
