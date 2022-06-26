package com.bridgelabz.emp;

public class empWage {
    public static void main(String[] args) {
        int EMP_PER_HOUR = 0;
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_WAGE_PER_HOUR = 20;
        int employeeCheck =(int)(Math.random() * 10) % 3;

        if (employeeCheck == IS_FULL_TIME) {
            System.out.println("Employee is present full Day");
            EMP_PER_HOUR = 8;
        }else if(employeeCheck == IS_PART_TIME){
            System.out.println("Part time Employee");
            EMP_PER_HOUR = 4;
        }else{
            System.out.println("Employee is Absent");
            EMP_PER_HOUR = 0;
        }
        int empWage = EMP_PER_HOUR  * EMP_WAGE_PER_HOUR;
        System.out.println("Employee Wages is: " + empWage);
    }
}
