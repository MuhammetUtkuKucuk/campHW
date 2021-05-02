package courseDemo;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.id = 1;
		student.lastName = "Kucuk";
		student.identityNumber = "123456";
		student.email = "muhammetutku@gmail.com";
		student.password = "111111";
		student.onlineWallet = 50;
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.lastName = "Gungordu";
		instructor.identityNumber = "456789";
		instructor.email = "ahmetgungordu@gmail.com";
		instructor.password = "232323";
		instructor.age = 36;
		instructor.salary = 5000;
		
		student.firstName = "Muhammet Utku";
		instructor.firstName = "Ali";
		
		User[] users = new User[] {student,instructor};
		for (User user : users) {
			System.out.println(user.firstName);
		}
		
		UserManager[] userManagers= new UserManager[] {new StudentManager(), new InstructorManager()};
		for (UserManager userManager : userManagers) {
			userManager.list();
		}
		
		InstructorManager instructorManager = new InstructorManager();
		System.out.println("Instructor Maasi : " + instructor.salary + " Zamlanan Maasi : " + instructorManager.salaryIncrease(instructor));
		
		
		
		
		
		
		
	}

}
