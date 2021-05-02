package courseDemo;

public class StudentManager extends UserManager{
	@Override
	public void list()
	{
		System.out.println("Student Listelendi");
	}
	@Override
	public void add(User user)
	{
		System.out.println("Student Eklendi : "+user.firstName);
	}
	@Override
	public void delete(User user)
	{
		System.out.println("Student Silindi : "+user.firstName);
	}
	public void resetProgress(Student student)
	{
		System.out.println("Ilerleyis Sifirlandi" + student.firstName);
	}
	
}
