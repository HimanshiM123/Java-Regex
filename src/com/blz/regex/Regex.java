package com.blz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    final String NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
    final String LAST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
    final String EMAIL_REGEX = "abc.[a-z]{0,3}@bl.co.[a-z]{0,2}$";
    Scanner sc = new Scanner(System.in);

    public void validFirstName() {
        System.out.println("Welcome to user registration program using regex");
        System.out.println("Enter First Name :");
        String firstName = sc.next();
        if (isValidInput(NAME_REGEX, firstName)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public void validLastName() {
        System.out.println("Enter last Name :");
        String lastName = sc.next();
        if (isValidInput(LAST_NAME_REGEX, lastName)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public void validEmail() {
        System.out.println("Enter Email id:");
        String email = sc.next();
        if (isValidInput(EMAIL_REGEX, email)) {
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
        r.validFirstName();
        r.validLastName();
        r.validEmail();
    }
}
