package day3Homework2;

public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+": tarafýndan kurs eklendi");
	}
}