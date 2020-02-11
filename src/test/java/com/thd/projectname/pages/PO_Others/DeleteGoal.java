package com.thd.projectname.pages.PO_Others;


import com.thd.base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.thd.common.utils.WebActionsUtil;
import com.thd.base.Constants.Constants;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;

public class DeleteGoal extends BasePage {
    private static final Logger log = LogManager.getLogger(DeleteGoal.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();

    @FindBy(xpath = "//*[text()= 'Talent']")
    public WebElement Talent;

    @FindBy(xpath = "//*[@data-automation-id= \"promptOption\"]")
    public WebElement nameLinkEmployee;

    @FindBy(xpath = "//*[text()= 'Edit Goals']")
    public WebElement EditGoals;

    @FindBy(xpath = "//*[@data-automation-id='multiViewDelete']")
    public WebElement DeleteGoalsButton;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement SubmitButtonEditGoals;

    @FindBy(xpath = "//*[@data-automation-id = 'multiViewRestoreHeader']")
    public WebElement DeleteGoalsMsg; //---------------This item has been removed, restore to edit.

    @FindBy(xpath = "//*[text() = 'Process Successfully Completed']")
    public WebElement ProcessSuccessfulMsg;


    public void DeleteGoals(String employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        test.info("Adding Goal(s) to the Employee : " + employee);
        log.info("Adding Goal(s) to the Employee : " + employee);
        workdaycommon.stopProxy();
        workdaycommon.simplestartProxy(employee); //uncomment when needed
        log.info("employee proxy successfull");
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(Talent, EditGoals);
        workdaycommon.userWait(3000);
        log.info("Moved to Edit Goals screen");
        DeleteGoalsButton.click();
        workdaycommon.userWait(3000);
        SubmitButtonEditGoals.click();

        log.info("Clicked on Submit button after delete goals");
        if (ProcessSuccessfulMsg.isDisplayed()) {
            test.pass("Goals deleted successfully");
        } else {
            test.fail("Deletion of Goal is not successful");
        }

    }
}
