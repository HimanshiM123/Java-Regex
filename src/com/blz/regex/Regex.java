package com.blz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
public class Regex {
    Scanner sc = new Scanner(System.in);
   public void validFirstName(){
        System.out.println("Welcome to user registration program using regex");
        System.out.println("Enter First Name :");
        String firstName = sc.next();
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}$", firstName));
    }
    public void validLastName(){
        System.out.println("Enter last Name :");
        String lastName = sc.next();
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}$", lastName));
    }
    public static void main(String[] args) {
       Regex r = new Regex();
       r.validFirstName();
       r.validLastName();
    }
}
