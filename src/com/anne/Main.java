package com.anne;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte percent = 100;
        double principal = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal ($1k - $1M):");
            principal = scanner.nextDouble();
            if (principal >= 1000 && principal <=1_000_000_000)
                break;
                System.out.println("Enter a number between 1,000 and 1,000,000,000");
        }
        System.out.println("Enter annual rate");
        double annualRate = scanner.nextDouble();
        System.out.println("Enter number of years");
        int years = scanner.nextInt();

        double monthlyInterestRate = annualRate/MONTH_IN_YEAR/percent;
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal*monthlyInterestRate*Math.pow((1 + monthlyInterestRate), numberOfPayments)/Math.pow((1 + monthlyInterestRate), numberOfPayments) -1;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);

    }


    }
