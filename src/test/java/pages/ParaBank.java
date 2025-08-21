package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBank {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //Inicializa WebDriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void navegamosAParaBank() {
        // Navega a la pagina web
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @AfterMethod
    public void tearDown() {
        // Cierra el navegador despues de la prueba
        if (driver != null) {
        driver.quit();      
        }
    }
}
