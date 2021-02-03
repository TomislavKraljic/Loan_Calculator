package com.company;

import java.text.NumberFormat;

public class LoanReport {

    private final NumberFormat currency;
    private final LoanCalculator calculator;

    public LoanReport(LoanCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
            System.out.println("-------------");
        }

    public void printLoan() {
        double mortgage = calculator.calculateLoan();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("      LOAN");
        System.out.println("----------------");
        System.out.println("Monthly Payments: ");
        System.out.println("    " + mortgageFormatted);
    }
}
