package com.bridgelabz.emp;

public class empWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static int EMP_WAGE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int FULL_DAY_HR = 8;
    public static final int PART_DAY_HR = 4;
    public static final int MAX_HRS_IN_MONTH = 100;
    static int totalWorkingDays = 0;
    static int workingHours = 0;
    static int totalEmpHours = 0;

    public static int getWorkingHours() {
        while (totalEmpHours < MAX_HRS_IN_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int)(Math.random() * 10) % 3;
            // Calculating Wage On Employee Type
            switch (empCheck) {
                case 0:
                    workingHours = FULL_DAY_HR;
                    System.out.println("Full Day Hr " + workingHours);
                    break;
                case 1:
                    workingHours = PART_DAY_HR;
                    System.out.println("Part Day Hr" + workingHours);
                    break;
                default:
                    workingHours = 0;
            }
            totalEmpHours += workingHours;
            System.out.println("Day: " + totalWorkingDays + " workingHours: " + workingHours);
        }
        //Calculated Employ wage
        int totalEmpWage = totalEmpHours * EMP_WAGE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        getWorkingHours();
    }
}
