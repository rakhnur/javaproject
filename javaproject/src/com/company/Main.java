package com.company;

import java.sql.*;
import java.text.ParseException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws ParseException, SQLException {
        String answer;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaproject", "postgres", "2456");
            String selectQuery = "SELECT * FROM users";

            Validator validator = new Validator();
            Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the ID: ");
            int id = scanner.nextInt();
            System.out.println("Enter first name: ");
            String firstname = scanner.next();
            System.out.println("Enter last name: ");
            String lastname = scanner.next();
            System.out.println("Enter the password: ");
            String password = scanner.next();
            validator.checkPassword(password);
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            validator.checkAge(age);
            System.out.println("Enter the date of birth in 'year-day-month' format: ");
            System.out.println("Example - 2002-01-08");
            Date birthday = Date.valueOf(scanner.next());
            System.out.println("Enter your GPA: ");
            float gpa = Float.parseFloat(scanner.next());
            validator.checkGPA(gpa);
            /*System.out.println("You want to calculate your GPA?");
            System.out.println("Yes - 'Y', no - 'N'");
            answer = scanner.next();
            calculator.checkAnswer(answer, gpa);*/


            String insertQuery = "INSERT INTO users(id, firstname, lastname, password, age, birthday, gpa) values (?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, firstname);
            preparedStatement.setString(3, lastname);
            preparedStatement.setString(4, password);
            preparedStatement.setInt(5, age);
            preparedStatement.setDate(6, birthday);
            preparedStatement.setFloat(7, gpa);

            System.out.println("Enter student id you want to remove: ");
            String deleteId = scanner.next();
            String removeQuery= "DELETE FROM users WHERE id = '" + deleteId + "'";
            PreparedStatement preparedStatement2 = connection.prepareStatement(removeQuery);

            preparedStatement.executeUpdate();
            preparedStatement2.executeUpdate();

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
