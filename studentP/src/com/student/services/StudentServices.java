package com.student.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import com.student.beans.Student;
import com.student.beans.Studentmarks;


public class StudentServices {
	private Scanner scanner ;
	private Studentmarks[] studentmarks;
	private List<Student> students = new ArrayList<Student>();
	private Student student;
	

	
	
	// Student Data Entry
	public void setStudentData() {
		scanner=new Scanner(System.in);
		
		
		student = new Student();
		System.out.println("Enter Student Name (string) : ");
		String name= scanner.next();
		student.setName(name);
		
		// Enter Student Marks 
		studentmarks = new Studentmarks[5];
		for(int i =0 ;i<studentmarks.length;i++) {
			 studentmarks[i] = new Studentmarks();
			 int nm = i+1;
			 System.out.println("Enter Course marks"+"["+nm+"]");
			 studentmarks[i].setMarks((double)random()); 
			 System.out.println("Enstring) : "+(double)random());
			 
		}
		student.setStudentmarks(studentmarks);
		student.setTotalmarks(getStudentTotal(studentmarks));
		student.setAverage(getStudentPrecentage(studentmarks));		
		students.add(student);
	}
	
	
	
	// Display names with percentage for every student method
	public void displayStudentNames() {
		System.out.println("============ Name and precentage ===============");
		  System.out.println(" Name       :    Average");
		  //
		  for(Student student:students) {	
			     // 
				  System.out.println(" "+student.getName()+"      :   "+getStudentPrecentage(student.getStudentmarks()));	  
		  }  
	   }
	
	
	//  Display name with  maximum marks for every student method
	public void displyNamesWitMax() {
		System.out.println("============ Name with  maximum marks for every student  ============");
		  System.out.println(" Name       :  Maximum Marks");
		  for(Student student:students) {	    
			      
			      // Calling private method to calculate maximum marks for student
				  System.out.println(" "+student.getName()+"     : "+getMaxMrks(student.getStudentmarks()));
			
		  }
	}
	
	
    // Display Name Wit Maximum Marks of all students method
	public void displyNameWitMaxMarks() {
		System.out.println("============ Student names and maximum  Marks of all students ===============");
		  System.out.println("Name      : total");
		  double mx=0.0;
		  Student studentMax =  students.get(0);
		  mx = studentMax.getTotalmarks();
		  String name="";
		  
		  for(Student student:students) {	
				  if(student.getTotalmarks() >= mx) {
						mx = student.getTotalmarks();
						name = (student.getName());
					}   
		  }
		  System.out.print(name+"     :  "+mx);	
	}
	
	
    // Display student name with maximum average score method
	public void displyMaxAvgWiNms() {
		System.out.println("============ Student name with maximum average ===============");
		  System.out.println("Name      :  maximum average");
		  double mx=0.0;
		  Student studentMax =  students.get(0);
		  String name="";
		  mx = studentMax.getAverage();
		  
		  for(Student studentMaxs:students) {	
				  if(studentMaxs.getAverage() >= mx) {
						mx = studentMaxs.getAverage();
						name = studentMaxs.getName();
					} 	  
		  }
		  System.out.print(name+"     :  "+mx);
	}
	
	
    // Display number of pass students method
	public void displyPassStnds() {
		System.out.println("============ Number of pass students  ===============");
		  int count=0;
		  int studentP = 0;
		  for(Student student:students) {	
			  for(int i=0;i<student.getStudentmarks().length;i++) {
				  if(student.getStudentmarks()[i].getMarks()>= 50) {
						count++;
						System.out.println(count);
					} 
				  if(count==5) {
					  studentP++;
				  }
			  }	  
			  count=0;
		  }
		  System.out.print("Number of Pass Student : " +studentP);	  
	}
	
	
	
//  Display failed  students and names
	public void displyFailStnds() {
		System.out.println("============  failed  students  ===============");
		 System.out.println("Name      : " + " average");
		 int count=0;
		  int studentP = 0;
		  for(Student student:students) {	
			  for(int i=0;i<student.getStudentmarks().length;i++) {
				  if(student.getStudentmarks()[i].getMarks()<= 50) {	 
					  count++;
					}			  
			  }
			  if(count>0) {
				  System.out.println(student.getName()+ " : "+getStudentPrecentage(student.getStudentmarks()));
				  }
			  count=0; 
		  }  
	}
	
	
	
	// Get Student Average method
	private Double getStudentPrecentage(Studentmarks[] studentmarks) {
		Double sum=0.0;
		Double avg=0.0;
		for(int i=0;i<studentmarks.length;i++) {
			sum = sum+studentmarks[i].getMarks();
		}
		avg = sum/5;
		return avg;
	}
	
	
	// Get Student Total marks
		private Double getStudentTotal(Studentmarks[] studentmarks) {
			Double sum=0.0;
			for(int i=0;i<studentmarks.length;i++) {
				sum = sum+studentmarks[i].getMarks();
			}
			return sum;
		}
		
	
	
	
	// Get maximum marks method
	private Double getMaxMrks (Studentmarks[] studentmarks) {

		Double max= studentmarks[0].getMarks();
		for(int i=0;i<studentmarks.length;i++) {
			
			if(studentmarks[i].getMarks() >= max) {
				max = studentmarks[i].getMarks();
			}
		}
		
		return max;
	}
	
	//random value generator
	private int random () {
		Random r = new Random();
		int low = 10;
		int high = 100;
		return r.nextInt(high-low) + low;
	}
	
}
