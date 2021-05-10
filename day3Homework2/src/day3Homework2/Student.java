package day3Homework2;

public class Student extends User{
	private int studentNumber;
	private int completeRate;
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getCompleteRate() {
		return 100-(100-completeRate);
	}
}