package pages;
 
public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[normalize-space()='%s' and @href]";
                               

    
    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar a www.freerangetesters.com
    public void navigateToParaBank() {
        navigateTo("https://parabank.parasoft.com/parabank/index.htm");
        
    }

    public void clickOnSectionNavigationMenu(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }
 
}