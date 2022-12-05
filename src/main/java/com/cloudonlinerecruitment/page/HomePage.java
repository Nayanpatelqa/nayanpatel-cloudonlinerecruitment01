package com.cloudonlinerecruitment.page;
import com.cloudonlinerecruitment.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//td[@id='ctl00_ctl03_RootMenun0']")
    WebElement home;

    @CacheLookup
    @FindBy(xpath = "//td[@id='ctl00_ctl03_RootMenun1']")
    WebElement vacancies;

//last test case I have intensely  fail
    @CacheLookup
    @FindBy(xpath = "")
    WebElement myAccount;

    public void clcikonHome(){
        clickOnElement(home);
    }

    public void clcikonVacancies(){
        clickOnElement(vacancies);
    }

//last test case I have intensely  fail
    public void clcikonMyAccount(){
        clickOnElement(myAccount);
    }

}
