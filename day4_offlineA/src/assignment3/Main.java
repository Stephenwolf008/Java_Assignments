package com.pack.assignment3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Residential Status(HostelLite or DayScholar): ");
		String residentialStatus = sc.nextLine();
		
		
		if(residentialStatus.equalsIgnoreCase("hostellite")) {
			s = new HostelLite(1, 'm', "Rakshit", 3000);
			s.displayStudentDetails();
		} else if(residentialStatus.equalsIgnoreCase("dayscholar")) {
			s = new DayScholar(1, 'm', "Kartik", 0);
			s.displayStudentDetails();
		} else {
			System.out.println("Invalid Input");
		}
		
	}
}
