package com.anne;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int principal = (int)readNumber("Enter principal (1k - 1m):", 1000, 1_000_000_000);
        float annualRate =(float)readNumber("Enter annual rate", 0, 30);
        short years = (short)readNumber("Enter years", 1, 30);

        double mortgage = calculateMortgageA(principal, annualRate, years);
            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println(mortgageFormatted);

        }

    public static double readNumber(String prompt, double min, double max){
        double value;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between + " + min + " and " + max);
        }
        return  value;
    }

    public static double calculateMortgageA(double principal, double annualRate, short years){
        final byte percent = 100;
        final byte MONTH_IN_YEAR = 12;
        short numberOfPayments = (short) (years * MONTH_IN_YEAR);
        double monthlyInterestRate = annualRate/MONTH_IN_YEAR/percent;

        return principal*monthlyInterestRate*Math.pow((1 + monthlyInterestRate), numberOfPayments)/Math.pow((1 + monthlyInterestRate), numberOfPayments) -1;

    }

    }
