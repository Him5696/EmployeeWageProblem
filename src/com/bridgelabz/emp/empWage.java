package com.bridgelabz.emp;

public class empWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation Problem");
        int isFullTime = 1;
        double employeeCheck = Math.floor (Math.random() * 10) % 2;
        if (employeeCheck == isFullTime) {
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
}
