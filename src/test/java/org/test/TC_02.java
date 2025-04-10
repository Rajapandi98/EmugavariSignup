package org.test;

import base.BaseTest;
import utils.SignupPage;

public class TC_02 extends BaseTest {

    public static void main(String[] args) {
        setup();

        page.navigate("http://app.e-mugavari2.0-qa.s3-website.ap-south-1.amazonaws.com/sign-up");

        SignupPage signup = new SignupPage(page);
        
//        Negative Scenario without Filling Required Field
        
        signup.enterFullName("");
        signup.enterMobileNumber("");
        signup.enterEmail("");
        signup.acceptTermsAndConditions();
        signup.clickSubmit();

        
        // Add validation 
        System.out.println("Signup automation completed.");

        tearDown();
    }
}

