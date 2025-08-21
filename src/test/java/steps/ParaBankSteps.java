
package steps;
 
import java.util.Arrays;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaProductos;
import pages.PaginaGetStarted;
import pages.PaginaPrincipal;

 
public class ParaBankSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaProductos productosPage = new PaginaProductos();
    PaginaGetStarted getStarted = new PaginaGetStarted();
 
    @Given("I navigate to www.parabank.parasoft.com")
    public void iNavigateToPB() {
        landingPage.navigateToParaBank();
    }
 
    @When("I go to {word} using the navigation menu")
    public void navigationMenuUse(String section) {
        landingPage.clickOnSectionNavigationMenu(section);
    }

    @Then("I select Get Started")
    public void navigateToIntro() {
        productosPage.clickgetStartedLink();
    }
    

    @And("I can validate the language options")
    public void validateLanguageOptions() {
        List<String> lista = getStarted.returnLanguageDropdownValues();
        List<String> listaEsperada = Arrays.asList("Select Language", "English", "Français", "Deutsch", "Español");
 
        Assert.assertEquals(listaEsperada, lista);
    }

}