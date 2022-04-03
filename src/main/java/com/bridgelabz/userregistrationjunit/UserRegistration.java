package com.bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * purpose write a junit program to validation of user registration program
 * Validation use the regex program
 * @author : Archana
 * @since : 03-04-2022
 */

public class UserRegistration {
    Pattern pattern;
    Matcher matcher;

    /* method firstName to validate the first name of the user
     * @param name return boolean value
     */
    public boolean firstName(String name){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
}