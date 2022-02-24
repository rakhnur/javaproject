package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Pass {
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
}