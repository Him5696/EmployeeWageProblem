package com.bridgelabz.emp;

public class empWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static int EMP_WAGE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public static void main(String[] args) {

        int EMP_PER_HOUR  = 0;
        int totalEmpWage = 0;
        int totalEmpWorkingHours = 0;
        int totalWorkingDay = 0;
        for (int day = 0; day < MAX_WORKING_DAYS ; day++) {
            while (totalEmpWorkingHours <= MAX_HRS_IN_MONTH && totalWorkingDay < MAX_WORKING_DAYS) {
                totalWorkingDay++;
                int randomNum = (int) (Math.random() * 10 % 3);

                switch (randomNum) {
                    case 1:
                        System.out.println("Employee is full time");
                        EMP_PER_HOUR = 8;
                        break;
                    case 2:
                        System.out.println("Employee is part time");
                        EMP_PER_HOUR = 4;
                        break;
                    default:
                        System.out.println("Employee is absent");
                        EMP_PER_HOUR = 0;
                        break;
                }
                totalEmpWorkingHours += EMP_PER_HOUR;
                int empWage = (EMP_PER_HOUR * EMP_WAGE_PER_HOUR);
                totalEmpWage += empWage;
                System.out.println("Emp Wage: " + empWage);
            }
            System.out.println("total days: " + totalWorkingDay);
            System.out.println("Total Employee Working Hrs: " + totalEmpWorkingHours);
            System.out.println("Total Employee Wage: " + totalEmpWage);
        }
    }
}
