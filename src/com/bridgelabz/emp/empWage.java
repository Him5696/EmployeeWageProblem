package com.bridgelabz.emp;

public class empWage {
    public static void main(String[] args) {
        int EMP_PER_HOUR = 0;
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_WAGE_PER_HOUR = 20;
        int employeeCheck =(int)(Math.random() * 10) % 3;

        switch (employeeCheck){
            case 1:
                System.out.println("Employee is full time");
                EMP_PER_HOUR=8;
                break;
            case 2:
                System.out.println("Employee is part time");
                EMP_PER_HOUR = 4;
                break;
            default:
                System.out.println("Employee is absent");
                EMP_PER_HOUR=0;
                break;
        }
        int empWage = EMP_PER_HOUR  * EMP_WAGE_PER_HOUR;
        System.out.println("Employee Wages is: " + empWage);

    }
}
