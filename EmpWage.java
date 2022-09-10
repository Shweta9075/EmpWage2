package com.bridgelabz;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("Welocme Employees");
		int fullTime = 1;
		int perHrsWage = 20;
		int partTime = 2;
		int monthSal = 0;
		int salary;
		for (int i = 1; i <= 20; i++) {

			int check = (int) Math.floor(Math.random() * 10) % 3;
			switch (check) {
			
			case 1:
				System.out.println("Employee is present in part Time");
				int Hrs = 8;
				salary = perHrsWage * Hrs;
				System.out.println("salary : " + salary);
				break;
			case 2:
				System.out.println("Employee is present in part Time");
				Hrs = 4;
				salary = perHrsWage * Hrs;
				System.out.println("salary : " + salary);
				break;
			default:
				System.out.println("Employee is present in part Time");
				Hrs = 0;
				salary = perHrsWage * Hrs;
				System.out.println("salary : " + salary);
				break;
			}
			monthSal = salary + monthSal;
			
		}
		System.out.println(monthSal);
	}
}