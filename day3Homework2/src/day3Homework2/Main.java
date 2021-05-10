package day3Homework2;

public class Main {

	public static void main(String[] args) {	
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engin@gmail.com");
		instructor1.setInstructorNumber(12346);
		
		Student student1 = new Student();
		student1.setId(3);
		student1.setFirstName("Rabia");
		student1.setLastName ("Gül");
		student1.setEmail("rabia@gmail.com");
		student1.setStudentNumber(53521);
		
		Student student2 = new Student();
		student2.setId(7);
		student2.setFirstName("Mustafa");
		student2.setLastName ("Yeşil");
		student2.setEmail("mustafa@gmail.com");
		student2.setStudentNumber(87642);
		
		User[] users = new User[] {instructor1, student1};
		
		for(User user : users) {
			System.out.println(user.getFirstName()+" "+user.getLastName());
		}
		
		UserManager userManager = new UserManager();
		userManager.login(student1);
		userManager.logout(student2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor1);
		instructorManager.addCourse(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student2);
		studentManager.rollCall(student2);
	}
}
