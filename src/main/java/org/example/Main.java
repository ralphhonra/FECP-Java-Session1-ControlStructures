package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String status  = input.nextLine().toLowerCase();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.println("Price: " + calculatePrice(status, age));
    }

    public static String calculatePrice(String status, int age) {
        float price = 0.0f;

        switch (status) {
            case "regular":
                if (age < 18) price = 50.00f;
                else if (age >= 18 && age <= 64) price = 100.00f;
                else if (age > 64) price = 75.00f;

                break;
            case "vip":
                if (age < 18) price = 75.00f;
                else if (age >= 18 && age <= 64) price = 150.00f;
                else if (age > 64) price = 112.50f;

                break;
            case "premium":
                if (age < 18) price = 100.00f;
                else if (age >= 18 && age <= 64) price = 200.00f;
                else if (age > 64) price = 150.00f;

                break;
            default:
                System.out.println("Invalid membership status entered.");
                break;
        }

        return "$".concat(String.format("%.2f", price));
    }
}