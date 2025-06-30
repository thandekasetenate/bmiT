package bmiCalculatorT;

import java.util.Scanner;

public class bmiCalculatorT {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for name
        System.out.println("Enter your name:");
        String name = input.nextLine();

        // Ask for age
        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine(); // clear leftover newline

        // Ask for unit system
        System.out.println("Choose your unit system:");
        System.out.println("1. Metric (kilograms and meters)");
        System.out.println("2. Imperial (pounds and inches)");
        System.out.println("Enter 1 or 2:");
        int unit = input.nextInt();
        input.nextLine(); // clear leftover newline

        double weight;
        double height;

        // Get weight and height based on unit
        if (unit == 1) {
            System.out.println("Enter your weight in kilograms:");
            weight = input.nextDouble();
            input.nextLine();

            System.out.println("Enter your height in meters:");
            height = input.nextDouble();
            input.nextLine();
        } else {
            System.out.println("Enter your weight in pounds:");
            weight = input.nextDouble();
            input.nextLine();

            System.out.println("Enter your height in inches:");
            height = input.nextDouble();
            input.nextLine();
        }

        // Calculate BMI
        double bmi;
        if (unit == 1) {
            bmi = weight / (height * height);
        } else {
            bmi = (weight / (height * height)) * 703;
        }

        // Show result
        System.out.println();
        System.out.println("Hello " + name + ", age " + age + ".");
        System.out.printf("Your BMI is %.2f\n", bmi);
        System.out.println("BMI Category: " + getCategoryWithEmoji(bmi));

        // Custom thank-you message
        System.out.println();
        System.out.println("Thank you for using Thandeka's BmiCalculator ❤️");

        input.close();
    }

    // Method to return BMI category with emojis
    public static String getCategoryWithEmoji(double bmi) {
        if (bmi < 18.5) {
            return "Underweight 😟";
        } else if (bmi < 24.9) {
            return "Normal weight 😊";
        } else if (bmi < 29.9) {
            return "Overweight 😐";
        } else {
            return "Obese 😟";
        }
    }
}
