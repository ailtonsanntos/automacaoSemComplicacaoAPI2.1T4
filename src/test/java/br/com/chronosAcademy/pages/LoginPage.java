package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin(){
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar(){
        loginMap.btnFechar.click();
    }

    public void clickDivFechaModal(){
        loginMap.divFecharModal.click();
    }

    public void setInpUserName(String username) {
        if (username != null) {
            loginMap.inpUserName.sendKeys(username);
        }
    }

    public void setInpPassword(String password) {
        if (password != null) {
            loginMap.inpPassword.sendKeys(password);
        }
    }

    public void clickInpRemember(){
        loginMap.inpRemember.click();
    }

    public void clickLinkCreateAccount(){
        loginMap.LinkCreateAccount.click();
    }

    public void clickBtnSignIn(){
        loginMap.btnSignIn.click();
    }

    public boolean isBtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }

    public void visibilityOfBtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);
    }

    public void invisibilityOfBtnFechar(){
        Driver.invisibilityOf(loginMap.btnFechar);
    }

    public void aguardaLoader(){
        Driver.attributChange(loginMap.divLoader, "display", "none");
    }

    public String getUsuarioLogado(){
        Driver.visibilityOf(loginMap.textLogado);
        return loginMap.textLogado.getText();
    }

    public String getErroLogin(){
        Driver.visibilityOf(loginMap.txtErroLogin);
        return loginMap.txtErroLogin.getText();
    }
}
