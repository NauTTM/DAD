package P01T04A;

public class GradeBook {
	
	private String courseName;
	
	
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
	}
	
	public static void main(String[] args) {
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		this.courseName = name;
	}

}
