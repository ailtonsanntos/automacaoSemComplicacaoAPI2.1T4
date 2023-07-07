package br.com.chronosAcademy.maps;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.CSS;
import org.openqa.selenium.support.FindBy;

public class LoginMap {

    @FindBy(css = "#menuUser")
    public WebElement btnLogin;
    @FindBy(css =".closeBtn")
    public WebElement btnFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;
    @FindBy(css = "*[name='username']")
    public WebElement inpUserName;
    @FindBy(css = "*[name='password']")
    public WebElement inpPassword;
    @FindBy(id = "sign_in_btn")
    public WebElement btnSignIn;
    @FindBy(css = "*[name='remember_me']")
    public WebElement inpRemember;
    @FindBy(linkText = "CREATE NEW ACCOUNT")
    public WebElement LinkCreateAccount;
    @FindBy(css = ".loader")
    public WebElement divLoader;
    @FindBy(css = ".containMiniTitle")
    public WebElement textLogado;
    @FindBy(xpath = "//label[contains(text(), 'Incorrect')]")
    public WebElement txtErroLogin;
}
