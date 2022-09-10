package com.bridgelabz;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("Welocme Employees");
		int fullTime = 1;
		int perHrsWage = 20;
		int partTime = 2;

		double check = Math.floor(Math.random() * 10) % 3;
		if (check == fullTime) {
			System.out.println("Employee is present");
			int Hrs = 8;
			int salary = perHrsWage * Hrs;
			System.out.println("Salary : " + salary);
		}
		if(check == partTime) {
			System.out.println("Employee is present in part Time");
			int Hrs = 8;
			int salary = partTime * Hrs;
			System.out.println("salary : " + salary);
		}
		else {
			System.out.println("Employee is absent");
			int Hrs = 0;
			int salary = perHrsWage * Hrs;
			System.out.println("Salary : " + salary);
		}
	}
}
