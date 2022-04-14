package com.nurgulamat;

import java.text.NumberFormat;

public class MortgageReport {
    public static void printMortgage(int principle, float annualInterest, byte years) {
        var calculator = new MortgageCalculator(principle, annualInterest, years)
        double mortgage = MortgageCalculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("=========");
        System.out.println("Monthly Payment: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int principle, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("=================");
        for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++){
            double balance = MortgageCalculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
