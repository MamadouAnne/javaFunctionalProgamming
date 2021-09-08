package com.anne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal");
        double principal = scanner.nextDouble();
        System.out.println("Enter annual rate");
        double annualRate = scanner.nextDouble();
        System.out.println("Enter number of years");
        short years = scanner.nextShort();
    }


    }
