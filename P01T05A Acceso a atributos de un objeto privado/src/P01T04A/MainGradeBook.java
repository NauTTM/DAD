package P01T04A;

import java.util.Scanner;

public class MainGradeBook {

	public static void main(String[] args) {
		
		GradeBook objetoGradeBook = new GradeBook();
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Initial course name is %s\n\n", objetoGradeBook.getCourseName());
		
		System.out.println("Please enter the coruse name: ");
		String name = input.nextLine();
		objetoGradeBook.setCourseName(name);
		
	    System.out.println();
	    objetoGradeBook.displayMessage();
	}

}
