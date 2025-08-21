package pages;

import java.util.List;

public class PaginaGetStarted extends BasePage {

    private String languageDropdown = "//select[@aria-label='Select Language']";
    
    public PaginaGetStarted() {
        super(driver);
    }

    public List<String> returnLanguageDropdownValues() {
        return getDropdownValues(languageDropdown);
    }

}
