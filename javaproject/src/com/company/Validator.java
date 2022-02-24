package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validator extends Pass {

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
