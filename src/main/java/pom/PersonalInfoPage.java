package pom;

import org.jsoup.select.Evaluator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverService;

public class PersonalInfoPage extends WebDriverService {

    @FindBy(id = "firstname")
    public WebElement Firstname;
    @FindBy(id = "old_passwd")
    public WebElement OldPassword;
    @FindBy(id = "passwd")
    public WebElement newPassword;
    @FindBy(id = "confirmation")
    public WebElement confirmPassword;
    @FindBy(xpath = "//*[@id='center_column']/div/form/fieldset/div[11]/button)")
    public WebElement SaveBtn;
    @FindBy(xpath = "//*[@id='center_column']/div/p/text()")
    public WebElement successMsg;


    private static String fname = null;
    private static String oldpswd = null;
    private static String newpswd = null;
    private static String confnewpswd = null;

    public void EnterFirstName(String firstname) {
        fname = firstname;
        enterValueInTextField(Firstname, firstname);
    }
    public void EnterOldPassword(String oldpassword){
        oldpswd = oldpassword;
        enterValueInTextField(OldPassword, oldpassword);
    }
    public void EnterNewPassword(String newpassword){
        newpswd = newpassword;
        enterValueInTextField(newPassword, newpassword);
    }
    public void EnterconfirmnewPassword(String confirmnewpassword){
        confnewpswd = confirmnewpassword;
        enterValueInTextField(confirmPassword, confirmnewpassword);
    }
    public void ClickonSaveBtn(){ SaveBtn.click();}

    public void getSuccessMsg(){
        String Text = successMsg.getText();
        System.out.println("SuccessMsg is ::" +Text);

    }
}
