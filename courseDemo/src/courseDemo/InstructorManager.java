package courseDemo;

public class InstructorManager extends UserManager{
	@Override
	public void list()
	{
		System.out.println("Instructor Listelendi");
	}
	@Override
	public void add(User user)
	{
		System.out.println("Instructor Eklendi : "+user.firstName);
	}
	@Override
	public void delete(User user)
	{
		System.out.println("Instructor Silindi : "+user.firstName);
	}
	public double salaryIncrease(Instructor instructor)
	{
		return instructor.salary * 1.10;
	}
}
