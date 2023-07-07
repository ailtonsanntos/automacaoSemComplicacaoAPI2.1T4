package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.CSS;
import org.openqa.selenium.support.FindBy;

public class MyAccountMap {

    @FindBy(css = "#menuUserLink")
    public WebElement linkUser;
    @FindBy(xpath = "//*[@id=\"loginMiniTitle\"]/label[1]")
    public WebElement linkMyAccount;
    @FindBy(css = "a[href='#/accountDetails']")
    public WebElement linkEdit;
    @FindBy(css = "#myAccountContainer > div:nth-child(1) > div > div:nth-child(1) > label")
    public WebElement textUsuario;
    @FindBy(css = ".deleteBtnText")
    public WebElement btnDelete;
    @FindBy(css = ".deleteRed")
    public WebElement btnYes;
    @FindBy(css = ".modificationTwo > p")
    public WebElement txtDelete;
}
