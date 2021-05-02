package courseDemo;

public class UserManager {
	public void list()
	{
		System.out.println("User Listelendi");
	}
	public void add(User user)
	{
		System.out.println("User Eklendi : "+user.firstName);
	}
	public void delete(User user)
	{
		System.out.println("User Silindi : "+user.firstName);
	}
	public void add()
	{
		System.out.println("User Eklendi");
	}
	public void delete()
	{
		System.out.println("User Silindi");
	}
	
}
