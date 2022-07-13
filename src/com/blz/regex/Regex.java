package com.blz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
public class Regex {
   public void validFirstName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to user registration program using regex");
        System.out.println("Enter First Name :");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}$", firstName));
    }
    public static void main(String[] args) {
       Regex r = new Regex();
       r.validFirstName();
    }
}
