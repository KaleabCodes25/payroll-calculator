package com.pluralsight;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner payroll = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = payroll.nextLine();

        System.out.println("How many hours did you work?: ");
        double hours = payroll.nextDouble();

        System.out.println("How much do you get paid per hour?: ");
        double rate = payroll.nextDouble();



        double grossPay = hours * rate;

        System.out.printf("%s You worked %.2f hours and your gross pay is $%.2f", name, hours, grossPay);




    }

}
