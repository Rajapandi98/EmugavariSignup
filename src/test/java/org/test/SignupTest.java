package org.test;

import base.BaseTest;
import utils.SignupPage;

public class SignupTest extends BaseTest {

    public static void main(String[] args) {
        setup();

        page.navigate("http://app.e-mugavari2.0-qa.s3-website.ap-south-1.amazonaws.com/sign-up");

        SignupPage signup = new SignupPage(page);
//        signup.enterFullName("Raj");
//        signup.enterMobileNumber("11111111111");
//        signup.enterEmail("rajapandi2930@gmail.com");
//        signup.acceptTermsAndConditions();
//        signup.clickSubmit();
//        signup.enterOTP();

        
        
//        Negative Scenario
        
        signup.enterFullName("");
        signup.enterMobileNumber("");
        signup.enterEmail("");
        signup.acceptTermsAndConditions();
        signup.clickSubmit();

        
        // Add validation 
        System.out.println("Signup automation completed.");

     //   tearDown();
    }
}

