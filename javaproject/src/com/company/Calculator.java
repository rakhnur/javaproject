package com.company;
import java.util.Scanner;

public class Calculator {

    /*public void calculate(float gpa) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects: ");

        int n = sc.nextInt();

        double[] marks = new double[n];

        System.out.println("Enter marks: ");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        double[] grade = new double[n];

        double gp, sum = 0;

        for (int i = 0; i < n; i++) {
            grade[i] = (marks[i] / 10);
        }

        for (int i = 0; i < n; i++) {
            sum += grade[i];
        }

        gp = sum / n;

        System.out.println("Your GPA is: " + gp);

        System.out.println("Your percentage from gpa is: " + gp * 9.5);

    }*/

    public void checkAnswer(String answer, float gpa) {
        if (answer == "Y") {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of subjects: ");

            int n = sc.nextInt();

            double[] marks = new double[n];

            System.out.println("Enter marks: ");

            for (int i = 0; i < n; i++) {
                marks[i] = sc.nextInt();
            }

            double[] grade = new double[n];

            double gp, sum = 0;

            for (int i = 0; i < n; i++) {
                grade[i] = (marks[i] / 10);
            }

            for (int i = 0; i < n; i++) {
                sum += grade[i];
            }

            gp = sum / n;

            System.out.println("Your GPA is: " + gp);

            System.out.println("Your percentage from gpa is: " + gp * 9.5);
        }
        else {
            return;
        }
        }
    }
