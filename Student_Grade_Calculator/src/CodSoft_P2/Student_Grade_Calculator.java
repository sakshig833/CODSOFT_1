package CodSoft_P2;

import java.util.Iterator;
import java.util.Scanner;

public class Student_Grade_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Grade Calculator");
		System.out.println("Enter no of Subjects: ");
		int numStudents = sc.nextInt();
		int total=0;
		for(int i =0; i<numStudents; i++) {
			System.out.println("Enter marks scored in " +(i+1)+ ":");
			int marks = sc.nextInt();
			total=total+marks;
		}
		double avgP=(double)total/numStudents;
		char Grade;
		if(avgP>=90) {
			Grade='A';
		}
		else if(avgP>=80) {
			Grade='B';
		}
		else if(avgP>=70) {
			Grade='C';
		}
		else if(avgP>=60) {
			Grade='D';
		}
		else if(avgP>=50){
			Grade='E';
		}
		else {
			Grade='F';
		}
		System.out.println("Toatal Marks Scored is : " +total);
		System.out.println("Average percentage is : "+avgP+ "%");
		System.out.println("Grade : "+Grade);
	}
	
}

