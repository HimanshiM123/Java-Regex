package com.blz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    final String MOBILE_NUMBER_REGEX = "^(91)[0-9]{10}$";
    Scanner sc = new Scanner(System.in);

    public void validMobileNum() {
        System.out.println("Enter Mobile Number With Country Code :");
        String mobileNum = sc.next();
        if (isValidInput(MOBILE_NUMBER_REGEX, mobileNum)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    private static boolean isValidInput(String regex, String userInput) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(userInput);
        boolean b = m.matches();
        return b;
    }
    public static void main(String[] args) {
        Regex r = new Regex();
        r.validMobileNum();
    }
}
