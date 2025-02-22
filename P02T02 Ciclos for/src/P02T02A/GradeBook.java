package P02T02A;

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;

	public GradeBook(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for %s\n", getCourseName());
	}
	
	public void determineClassAverage() {
		try (Scanner input = new Scanner(System.in)) {
			int total = 0;
			
			for(int i = 0; i <10; i++) {
				System.out.print("Enter grade: ");
			    int numero = input.nextInt();
			    total += numero;
			}
			int media = total/10;
			
			System.out.println("total of all 10 grade is:" +total);
			System.out.println("Class average is: "+media);
		}
	}


}
