package Day8.abstraction;

public class Student extends Coder{
	@Override
	public void rules()
	{
		System.out.println("Morning wake up at : "+ wakeup);
		System.out.println("Do the program....");
	}
}
