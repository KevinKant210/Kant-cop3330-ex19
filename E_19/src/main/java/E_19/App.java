package E_19;


import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        IsValidNum checker = new IsValidNum();

        float height = Float.parseFloat(checker.promptUser("What is your Height in Inches: "));

        float weight = Float.parseFloat(checker.promptUser("What is your Weight in Pounds"));

        float bmi = (weight/(height*height))*703;

        System.out.printf("Your BMI is %.1f ",bmi);

        if(bmi > 25){
            System.out.println("You are overweight go see a doctor");
        }else{
            System.out.println("Your BMI is fine");
        }
    }
}
