package com.bridgelabz.emp;

public class empWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation Problem");
        int isFullTime = 1;
        int EMP_WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int employeeCheck = (int) (Math.random() * 10) % 2;
        if (employeeCheck == isFullTime) {
            System.out.println("Employee is present");
            int empWage =FULL_DAY_HOUR * EMP_WAGE_PER_HOUR;
            System.out.println("Daily wage of employee is: " + empWage);
        }else {
            System.out.println("Employee is Absent: No wage");
        }
    }
}
