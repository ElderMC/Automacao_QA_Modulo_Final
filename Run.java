import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjetcs.HomePO;
import pageobjetcs.HotelPO;
import pageobjetcs.UtilsPO;
import pageobjetcs.ValidacaoPO;


public class Run {
    WebDriver driver;

    @BeforeMethod
    public void setUpDriver(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/Ultron/Desktop/webdrive/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://123milhas.com/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

    @Test

    public void validarreserva() throws InterruptedException {
        HomePO homePO = new HomePO(driver);
        HotelPO hotelPageObject = new HotelPO(driver);
        UtilsPO utilsPO = new UtilsPO(driver);
        ValidacaoPO validacaoPO = new ValidacaoPO(driver);
        homePO.validatorPaging();
        utilsPO.fecharPopUp();
        homePO.clicarHotel();
        utilsPO.fecharPopUp();
        hotelPageObject.enviarCidade("Garopaba");
        hotelPageObject.enviarDataInicial("03/12/22");
        hotelPageObject.enviarDataFinal("10/12/22");
        hotelPageObject.buscar();
        validacaoPO.validarDestino();
        validacaoPO.validarCheckin();
        validacaoPO.validarCheckout();
        utilsPO.mensagemFinal();
    }
}