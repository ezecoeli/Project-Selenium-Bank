package pages;
 
public class PaginaProductos extends BasePage {
 
    private String getStartedLink = "//a[normalize-space()='Get Started' and @href]";     
                    
    
    public PaginaProductos() {
        super(driver);
    }

    public void clickgetStartedLink() {
        clickElement(getStartedLink);
    }

}