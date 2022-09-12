package com.bridgelabz;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("Welocme Employees");
		int fullTime = 1;
		int perHrsWage = 20;
		int partTime = 2;
		int monthSal = 0;
		int workingDays = 2;
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		for (int day = 0; day < workingDays; day++) {
			int check = (int) Math.floor(Math.random() * 10) % 3;
			switch (check) {
			case 1:
				empHrs = 4;
				break;

			case 2:
				empHrs = 8;
				break;
			default:
				empHrs = 0;

				break;

			}
			empWage = empWage * perHrsWage;
			totalEmpWage = empWage + empWage;
			System.out.println("EmpWage " + empWage);
		}
		System.out.println("totalEmpWage : " + totalEmpWage);
	}
}