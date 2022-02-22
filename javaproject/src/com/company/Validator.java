package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validator {

    public void checkGPA(float gpa) {
        if (gpa > 4.0) {
            System.out.println("Your grade is A+");
        }
        if (gpa == 4.0) {
            System.out.println("Your grade is A");
        }
        if (gpa < 4 && gpa >= 3.67 ){
            System.out.println("Your grade is A-");
        }
        if (gpa < 3.67 && gpa >= 3.33 ){
            System.out.println("Your grade is B+");
        }
        if (gpa < 3.33 && gpa >= 3 ){
            System.out.println("Your grade is B");
        }
        if (gpa < 3 && gpa >= 2.67 ){
            System.out.println("Your grade is B-");
        }
        if (gpa < 2.67 && gpa >= 2.33 ){
            System.out.println("Your grade is C+");
        }
        if (gpa < 2.33 && gpa >= 2 ){
            System.out.println("Your grade is C");
        }
        if (gpa < 2 && gpa >= 1.67 ){
            System.out.println("Your grade is C-");
        }
        if (gpa < 1.67 && gpa >= 1.33 ){
            System.out.println("Your grade is D+");
        }
        if (gpa < 1.33 && gpa >= 1 ){
            System.out.println("Your grade is D");
        }
        if (gpa < 1 && gpa >= 0.67 ){
            System.out.println("Your grade is E");
        }
        if (gpa < 0.67 && gpa >= 0 ){
            System.out.println("Your grade is F");
        }
    }

    public void checkAge(int age) {
        if (age >= 18) {
            System.out.println("User is adult");
        } else {
            System.out.println("User is underage");
        }
    }

    public void checkPassword(String password) {
        boolean valid = true;
        if (password.length() >= 8) {  //length validity ok
        } else {
            valid = false;
        }

        for (int i = 0; i < password.length(); i++) { //uppercase validity ok
            char ch = password.charAt(i);
            int counter = 0;

            if (Character.isUpperCase(ch)) { counter++;
            } else { counter = 0;}

            if(counter>=1){valid = true;} else {valid =false;}
        }

        for (int l = 0; l < password.length(); l++) { //lowercase validity ok
            char ch1 = password.charAt(l);
            int counter1 = 0;
            if (Character.isLowerCase(ch1)) {counter1++;} else {counter1 = 0;}

            if(counter1 >=1) {valid = true;} else {valid = false;}
        }

        if (password.contains("@") || password.contains("!") || password.contains("$") || password.contains("^"))//sign ok
        {
        } else {
            valid = false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch3 = password.charAt(i);
            int counter3 = 0;
            if (Character.isDigit(ch3)) {counter3++;} else {counter3 = 0;}

            if(counter3 >=1) {valid = true; break;} else {valid = false;}
        }

        if(valid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }

    /*
    public void checkDate(String date)  {
        if(date.matches("\\d{2}/\\d{2}/\\d{4}")){
            System.out.println("date is valid");
        }
        else {
            System.out.println("date is invalid");
        }
} */
}
