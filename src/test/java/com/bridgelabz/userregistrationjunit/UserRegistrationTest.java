package com.bridgelabz.userregistrationjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Archana");
        Assertions.assertTrue(result);
    }

    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Gowda");
        Assertions.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void giveEmailValues_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailValidation("abc..@radif.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void giveNumberValue_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.numberValidation("10 1111111111");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenNumberValues_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.numberValidation("11 121212111");
        Assertions.assertFalse(result);
    }

    @Test
    public void giveLoginRule1Value_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.loginValidation("agnnfwqopn");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLoginRule1Values_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginValidation("aqropnm");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenRule2Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginValidationOneUpperCase("Logaqaaopnm");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenRule2Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginValidationOneUpperCase("addqeghopnm");
    }

    @Test
    public void givenRule3Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginValidationOneNumber("Laoqo1rpnm");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenRule3Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginValidationOneNumber("aqLawhrpnm");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenRule4Values_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginValidationOneSpecialCharacter("adqe1aaL@fp");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenRule4Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginValidationOneSpecialCharacter("awwfleropnm");
        Assertions.assertFalse(result);
    }
}




