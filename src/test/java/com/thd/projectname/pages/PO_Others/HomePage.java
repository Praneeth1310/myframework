package com.thd.projectname.pages.PO_Others;

import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;
import com.thd.base.WebDriverWrapper;
import com.thd.common.utils.Encryptionutil;
import com.thd.common.utils.PageActionsUtil;
import com.thd.common.utils.WebActionsUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.JOptionPane;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;


public class HomePage extends BasePage {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();
    Encryptionutil encryptionutil = new Encryptionutil();

    @FindBy(xpath = "//*[@data-automation-id='userName']/input")
    public WebElement userName;

    @FindBy(xpath = "//*[@data-automation-id='password']/input")
    public WebElement password;

    @FindBy(xpath = "//*[@data-automation-id='goButton']")
    public WebElement submit;


    @FindBy(xpath = "//*[@name='j_username']")
    public WebElement userNameSSO;

    @FindBy(xpath = "//*[@name='j_password']")
    public WebElement passwordSSO;

    @FindBy(xpath = "//*[@class='btn signIn']")
    public WebElement SigninSSO;


    //       ----------------------------------Remeber Device page---------------------
    @FindBy(xpath = "//*[contains(text(), 'Remember Device?')]")
    public WebElement RemeberDevicePage;

    @FindBy(xpath = "//*[contains(@aria-label,'Remember this device')]")
    public WebElement RememberDeviceCheckBox;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement RememberDeviceSubmitButton;
//-------------------------------------


    @FindBy(xpath = "(//*[@class='wd-icon-workday wd-icon'])[1]//following::img[1]")
    public WebElement selfImgBtn;

    @FindBy(xpath = "//input[@data-automation-id='globalSearchInput']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[text()='Sign Out']")
    public WebElement btnSignOut;

    @FindBy(xpath = "//*[@data-automation-id='promptOption' and text()='Audit Trail - Business Process Definition']")
    public WebElement auditTrailBPDef;

    @FindBy(xpath = "//*[@data-automation-id='dateWidgetInputBox']")
    public WebElement dateWidgetInputBox;

    @FindBy(xpath = "//*[@data-automation-id='timeWidgetContainer']")
    public WebElement timeWidgetContainer;

    @FindBy(xpath = "//*[@data-automation-id='timeWidgetInputBox']")
    public WebElement timeWidgetInputBox;

    @FindBy(xpath = "//*[@id=\"workdayApplicationFrame\"]/div[1]/div[1]/section/div[2]/div[1]/div[1]/button[1]")
    public WebElement okButton;

    @FindBy(xpath = "(//*[@data-automation-id='moreLinkLabel'])[6]")
    public WebElement auditTraiMore;

    @FindBy(xpath = "//*[@class='gwt-Label WMMG' and text()='No Data']")
    public WebElement dataDisplay;

    @FindBy(xpath = "(//*[@data-automation-id='selectedItemList'])[6]")
    public WebElement auditTrailSelectItemList;

    @FindBy(xpath = "  //*[text()='Business Process Type']")
    public WebElement audittrailBP;

    @FindBy(xpath = "//*[@class='mainTable']/tbody")
    public WebElement auditMainTable;




   /* public void WorkdayLogin(String WDTenant) {
        log.entry();
        driver.manage().deleteAllCookies();

        if(WDTenant.equals("P1")) {
            log.info("Entering P1 Tenant");
            log.debug("WorkdayLogin Page URL : " + Constants.LOGINURL);
            driverWrapper.get(Constants.LOGINURL);
        }

        else if(WDTenant.equals("P2"))
        {
            log.info("Entering P2 Tenant");
            log.debug("WorkdayLogin Page URL : " + Constants.LOGINURLP2);
            driverWrapper.get(Constants.LOGINURLP2);
        }

        else
            {
                log.fatal("Entered a wrong URL or Incorrect WD Tenant URL entered");
                test.fail("Loading  respective WD Tenant URL failed");
            }
        driverWrapper.waitForPageLoaded();
        log.exit();
    }  */


    public void WDScreenLoad(String tenant) {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        String url;
        if (tenant.contains("p1"))
            url = Constants.P1_LOGINURL;
        else if (tenant.contains("p2"))
            url = Constants.P2_LOGINURL;
        else if (tenant.contains("sandbox"))
            url = Constants.SANDBOX_LOGINURL;
        else if (tenant.contains("hd3"))
            url = Constants.HD3_LOGINURL;
        else if (tenant.contains("PreviewTenant"))
            url = Constants.PRVW_TENANT;
        else
            url = Constants.P1_LOGINURL;
        log.entry();
        driver.manage().deleteAllCookies();
        log.debug("WorkdayLogin Page URL : " + url);
        driverWrapper.get(url);
        driverWrapper.waitForPageLoaded();
        log.exit();
    }

    public void login(String tenant) {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        String user;
        String pwd;

        if (tenant.contains("p1")) {
            user = Constants.P1_USERNAME;
            pwd = Constants.P1_PASSWORD;
        }
        else if (tenant.contains("p2")) {
            user = Constants.P2_USERNAME;
            pwd = Constants.P2_PASSWORD;
        }
        else if (tenant.contains("sandbox"))
        {
            user = encryptionutil.decryptProcess(Constants.SANDBOX_ENC_USERNAME);
            pwd  = encryptionutil.decryptProcess(Constants.SANDBOX_ENC_PASSWORD);
            //  userNameSSO.sendKeys(user);
            //  passwordSSO.sendKeys(pwd);
            //  PageActionsUtil.clickButton(driverWrapper, SigninSSO);
        }

        else if (tenant.contains("hd3"))
        {
            user = encryptionutil.decryptProcess(Constants.HD3_ENC_USERNAME);
            pwd  = encryptionutil.decryptProcess(Constants.HD3_ENC_PASSWORD);

        }
        else if (tenant.contains("PreviewTenant"))
        {
            user = encryptionutil.decryptProcess(Constants.PRVW_TENANT_USERNAME);
            pwd  = encryptionutil.decryptProcess(Constants.PRVW_TENANT_PASSWORD);
        }


        else {
            user = Constants.P1_USERNAME;
            pwd = Constants.P1_PASSWORD;
        }
        log.entry();
        log.debug("Logging in ...");
        //this.LoginPopUpBox();

        userName.sendKeys(user);
        password.sendKeys(pwd);
        PageActionsUtil.clickButton(driverWrapper, submit);
//        ------------- New line of code added  --------------------------------
      /*.  try {
            log.info("inside try");

            if (RememberDeviceCheckBox.isDisplayed()) {

                log.info("RememberDeviceCheckBox is displayed");


                RememberDeviceCheckBox.click();
                log.info("clicked on the Remember Device Check box");
                RememberDeviceSubmitButton.click();
                log.info("clicked on the Submit button on the remember device screen");

            }
            //else{                log.info("in else");
            //}
        } catch (NoSuchElementException e) {
            log.info("inside catch");
            log.info("RememberDeviceCheckBox is not displayed");
        }*/
//-----------------------------------------------------------------------------------------
        WebActionsUtil.explicitWait(driver, workdaycommon.homepageWD, "click");
        try {
            if (workdaycommon.homepageWD.isDisplayed()) {
                test.pass("Workday Login Successful");
            }
        } catch (NoSuchElementException e) {
            test.fail("Login to workday Failed");
        }

        log.exit();
    }



    public void LoginPopUpBox() {
        JTextField username_WD = new JTextField(8);
        JPasswordField password_WD = new JPasswordField(8);
        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.LIGHT_GRAY);
        myPanel.add(new JLabel("Username:"));
        myPanel.add(username_WD);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Password:"));
        myPanel.add(password_WD);
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Enter Username and password for Workday Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            log.info("x value: " + username_WD.getText());
            //log.info("y value: " + password_WD.getText());
            userName.sendKeys(username_WD.getText());
            password.sendKeys(password_WD.getText());
        } else if (result == JOptionPane.CANCEL_OPTION) {
            test.fail("Login Cancelled");
            log.fatal("Login Cancelled, Cannot proceed further");
            driver.close();
        }
    }


    public void LogoutWorkday() {
        log.entry();
        WebActionsUtil.explicitWait(driver, selfImgBtn, "click");
        selfImgBtn.click();
        PageActionsUtil.clickButton(driverWrapper, btnSignOut);
        log.info("Logged out of Workday Successfully");
        WebActionsUtil.explicitWait(driver, submit, "visible");
        if (submit.isDisplayed()) {
            test.pass("Workday Logout Successful");
        } else
            test.fail("Logout Failed");
        log.exit();
    }

    private Date yesterday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -6);
        return cal.getTime();
    }

    public boolean verifyPageLoad() {
        boolean flag = false;
        if (driver.findElements(By.cssSelector("h1[data-automation-id='landingPageWelcomeCardHeading']")).size() != 0) {
            int i = 0;
            if (driver.findElements(By.cssSelector("h1[data-automation-id='landingPageWelcomeCardHeading']")).iterator().hasNext()) {
                flag = driver.findElements(By.cssSelector("h1[data-automation-id='landingPageWelcomeCardHeading']")).get(i).getText().contains("Welcome");
                i++;
            }
        }

        return flag;
    }

    public void loadAuditTrailPage() {
        log.entry();
        log.debug("Audit trail Page URL : " + Constants.AUDITURL);
        driverWrapper.get(Constants.AUDITURL);
        driverWrapper.waitForPageLoaded();
        log.exit();
    }

    public void loadAuditReport(String from_date, String to_date) throws Exception {
        workdaycommon.userWait(4000);
        searchBox.click();
        workdaycommon.userWait(4000);
        searchBox.sendKeys("audit trail");
        workdaycommon.userWait(4000);
        searchBox.sendKeys(Keys.ENTER);
        workdaycommon.userWait(10000);
        auditTrailBPDef.click();

        if (driverWrapper.isElementPresent(dateWidgetInputBox)) {
            test.pass(" Audit Page Loaded date input box visible");

            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(from_date);
                elem.sendKeys(Keys.TAB);
                timeWidgetContainer.click();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        if (driverWrapper.isElementPresent(dateWidgetInputBox)) {
            test.pass(" Audit Page Loaded date input box visible B");

            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[2]"))) {
                elem.sendKeys(to_date);
                elem.sendKeys(Keys.TAB);
                timeWidgetContainer.click();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

        }


        okButton.click();
        WebActionsUtil.explicitWait(driver,auditMainTable,"visible");
//        workdaycommon.userWait(20000);
//        auditTraiMore.click();
//        workdaycommon.userWait(1000);
        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement audittrail_Table= driver.findElement(By.xpath("//*[@class='mainTable']/tbody"));
        List<WebElement> audittrail_rows=audittrail_Table.findElements(By.tagName("tr"));
        int rows_size = audittrail_rows.size();
        String reportdata [][]= new String[rows_size+1][5];
        System.out.println("Number of Rows:"+audittrail_rows.size());
        List<WebElement> headervalues=driver.findElements(By.xpath("//*[contains(@data-automation-id,'columnLabel-')]"));
        String header[][] = new String[1][5];

        reportdata[0][0] = driver.findElement(By.xpath("//*[contains(@data-automation-id,'columnLabel-0')]")).getText();
        reportdata[0][1] = driver.findElement(By.xpath("//*[contains(@data-automation-id,'columnLabel-1')]")).getText();
        reportdata[0][2] = driver.findElement(By.xpath("//*[contains(@data-automation-id,'columnLabel-2')]")).getText();
        reportdata[0][3] = driver.findElement(By.xpath("//*[contains(@data-automation-id,'columnLabel-3')]")).getText();
        reportdata[0][4] = driver.findElement(By.xpath("//*[contains(@data-automation-id,'columnLabel-4')]")).getText();


        for(int rnum=0;rnum<audittrail_rows.size();rnum++)
        {
            System.out.println("-------------------------------------------------------------");
            List<WebElement> audittrail_columns=audittrail_rows.get(rnum).findElements(By.tagName("td"));
            System.out.println("Number of columns:"+audittrail_columns.size());
            for(int cnum=0;cnum<audittrail_columns.size();cnum++)
            {
                String printvalue = audittrail_columns.get(cnum).getText();
                reportdata[rnum+1][cnum] = printvalue;
                System.out.println(printvalue);
            }
        }
        Markup tableobj = MarkupHelper.createTable(reportdata);
        test.pass(tableobj);


    }


    public boolean verifyReportResult() {

        try {
            if ((auditTrailSelectItemList.getText() != null)) {
//            if (auditTrailSelectItemList.isDisplayed()) {
                test.pass("Changes Detected in the Business Process");
//            workdaycommon.userWait(1000);
//                auditTraiMore.click();
                test.info(auditTrailSelectItemList.getText());
//            SendEmail sendEmail = new SendEmail();
//            sendEmail.sendAlertEmail("BP");
            }

        } catch (Throwable e) {

//            if (dataDisplay.isDisplayed() && (dataDisplay.getText().equalsIgnoreCase("No Data")) ) {
//                log.infolog.info(dataDisplay.getText());
//                if (dataDisplay.getText().equalsIgnoreCase("No Data")) {
//                test.pass("No Changes Detected in the Business Process"+e.getMessage());
            test.pass("No Changes Detected in the Business Process");
//            }
        }
        return true;
    }
}

