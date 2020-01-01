package com.student.test;

import java.util.Scanner;

import com.student.services.StudentServices;


public class StudentTest {
	private static Scanner scanner ;
	public static void main(String[] args) {
		StudentServices student = new StudentServices();
		scanner = new Scanner(System.in);
		int opt=0;
		System.out.println("============ Student Data Entry  ===============");
		System.out.println("Enter the Number of student: ");
		int studentnumber = scanner.nextInt();
		for(int i=0;i<studentnumber;i++) {
			student.setStudentData();
		}
		do{
			System.out.println("\n=========== STUDENT SERVICE OPTIONS =============\n");
			System.out.println("1 : Display names with percentage");
			System.out.println("2 : Display names with  maximum marks for every student");
			System.out.println("3 : display Names with Maximun marks of all students ");
			System.out.println("4 : Display student name with maximum average score ");
			System.out.println("5 : Display number of pass students  ");
			System.out.println("6 : Display failed  students with average score  ");
			System.out.println("7 : to Exite  ");
			System.out.println("--------------------------------------------------");
			int op=0;
			System.out.println("Enter option :");
			op=scanner.nextInt();
			switch(op) {
				case 1:student.displayStudentNames();break;
				case 2:student.displyNamesWitMax();break;
				case 3:student.displyNameWitMaxMarks();break;
				case 4:student.displyMaxAvgWiNms();break;
				case 5:student.displyPassStnds();break;
				case 6:student.displyFailStnds();break;
				case 7:System.exit(0);
			} 
			System.out.println("\n---------------------------------------- ");
			System.out.println("\n To Execute other options press other than 7 ");
			opt = scanner.nextInt();
		}while (!(opt == 7));
		
			
	}
}
