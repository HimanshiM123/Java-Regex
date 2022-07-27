package com.blz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    final String PASSWORD_REGEX = "^[A-Z]{1,}[A-Za-z]{6,}[!@#$%^&*]{1}[0-9]{1,}$";
    Scanner sc = new Scanner(System.in);

    public void validPassword() {
        System.out.println("Enter the password :");
        String password = sc.next();
        if (isValidInput(PASSWORD_REGEX, password)) {
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
        r.validPassword();
    }
}
