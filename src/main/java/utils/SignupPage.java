package utils;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.WaitForSelectorState;

public class SignupPage {
    private final Page page;

    public SignupPage(Page page) {
        this.page = page;
    }

    public void enterFullName(String name) {
//      page.waitForSelector("#fullname", new Page.WaitForSelectorOptions()
//            .setTimeout(30000)
//            .setState(WaitForSelectorState.VISIBLE));
        page.getByPlaceholder("Enter Full Name").fill(name);
    }

    public void enterMobileNumber(String mobile) {
//        page.waitForSelector("#mobilenumber", new Page.WaitForSelectorOptions()
//            .setTimeout(30000)
//            .setState(WaitForSelectorState.VISIBLE));
        page.getByPlaceholder("Enter Mobile Number").fill(mobile);
    }

    public void enterEmail(String email) {
//        page.waitForSelector("#email", new Page.WaitForSelectorOptions()
//            .setTimeout(30000)
//            .setState(WaitForSelectorState.VISIBLE));
        page.getByPlaceholder("Enter Email Address").fill(email);
    }

    public void acceptTermsAndConditions() {
//        page.waitForSelector("//input[@type='checkbox']", new Page.WaitForSelectorOptions()
//            .setTimeout(30000)
//            .setState(WaitForSelectorState.VISIBLE));
        page.getByLabel("").check();
    }

    public void clickSubmit() {
//        page.waitForSelector("//button[@type='submit']", new Page.WaitForSelectorOptions()
//            .setTimeout(30000)
//            .setState(WaitForSelectorState.VISIBLE));
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Get OTP")).click();
    }
    
//    public void enterOTP() {
////      page.waitForSelector("//button[@type='submit']", new Page.WaitForSelectorOptions()
////          .setTimeout(30000)
////          .setState(WaitForSelectorState.VISIBLE));
//     
//  }
}
