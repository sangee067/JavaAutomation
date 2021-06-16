package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverService;


public class OrderVerifyPage extends WebDriverService {
    @FindBy(className = "box")
    public WebElement confimationMsg;
    @FindBy(linkText = "Back to orders")
    public WebElement backToOrder;
    @FindBy(css = "#order-list > tbody > tr.first_item > td.history_link.bold.footable-first-column > a")
    public WebElement orderRefFromTransactionHistory;



    private static String orderRef = null;

    public void getConfimationMsg() {

            String orderMsg = confimationMsg.getText();
            System.out.println(" Confirmation message :: \n" + orderMsg);
            String[] msg = orderMsg.split("reference");
            System.out.println(" 1st msg :: " + msg[0]);
            System.out.println(" 2nd msg :: " + msg[1]);
            String updatedMsg = msg[1];
            String[] orderRef = updatedMsg.split("\\s");
            String orderReference= orderRef[1];

    }


    public void clickonbacktoorder(){backToOrder.click();}


    public boolean verifyOrderRefFromTransactionHistory() {
        String ref = orderRefFromTransactionHistory.getText();
        System.out.println(" order Ref from Trans History :: " + ref);
        return (ref.equals(orderRef));

    }


}
