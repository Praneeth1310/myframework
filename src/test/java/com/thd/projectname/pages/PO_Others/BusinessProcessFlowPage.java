package com.thd.projectname.pages.PO_Others;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jason on 3/5/17.
 */
public class BusinessProcessFlowPage {

    private static final Logger log = LogManager.getLogger(BusinessProcessFlowPage.class);

    /* PAGE ELEMENTS */
    //@FindBy(css = ".original-keyword.u__regular")
    @FindBy(css = "span.original-keyword")
    public WebElement labelOriginalKeyword;

    public void setDriver(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /* PAGE METHODS */
    public String getSearchResultsText() {
        log.entry();
        log.info("Getting search results text...");
        String searchText = labelOriginalKeyword.getText().replace("\"", "");
        log.exit();

        return searchText;
    }
}
