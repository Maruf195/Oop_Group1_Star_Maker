package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        // Type casting
        // widening casting
        // byte -> short -> int -> long -> float -> double
        // char -> String
        int a = 10;
        double b = a; // cast int to double
        //Narrowing casting
        // reverse order
        double c = 10.2d;
        int d = (int) c;  // Manual casting  double to int


        String s = "123";
        int ss = Integer.parseInt(s);

        String sss = Integer.toString(ss);

        double sd = Double.parseDouble(sss);


        // Arithmetic operators , Comparison operators , logical operator, Assignment operators, bitwise operators


        // Arithmetic operators
        int addition = a + d;
        int multiplication = a * d;

        // Assignment operators

        int n = 12;
        n += 100;


        // Comparison operators  < , > , ==, != , >= , <=


        int m = 100;

        System.out.println(n < m);


        // Logical operators    and(&&) , or(||), !


        // Java String

        String message = "Mr. x \"age\" is: ";
        int age = 25;


        String comment = message + age;  // concat output :  Mr. x age is 25


        int length = comment.length();   // to get length of the string

        String name = "mr. x";

        System.out.println(name.toUpperCase()); //output: MR. X
        System.out.println(name.toLowerCase()); // as it is


        // to get index of any word

        int index = message.indexOf("is"); // output: 7

        System.out.println(Math.random());
        System.out.println(Math.max(10, 20)); //20
        System.out.println(Math.min(10, 20)); //10
        System.out.println(Math.sqrt(16)); // 4
        System.out.println(Math.pow(2, 3)); // 8


        // Boolean

        boolean isEmpty = true;

        // Comparison operators

        System.out.println(10 > 20);  //false


        // If-else

        if (5 > 2) System.out.println("Five is getter than 2");

        // if (condition){  to do }

        int n_age = 18;
       /* if (age>=18) System.out.println("Adult");
        else System.out.println("Minor");*/

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        /* int marks = 85;
        if(marks >= 90) System.out.println("A");
        else if (marks>=40) System.out.println("pass");
        else System.out.println("F"); */


        int marks = 85;

        if (marks >= 90) {

            System.out.println("A");
        } else if (marks >= 40) {
            System.out.println("Pass");

        } else {
            System.out.println("Fail");
        }

        int month = 8;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;


        }
    }
}