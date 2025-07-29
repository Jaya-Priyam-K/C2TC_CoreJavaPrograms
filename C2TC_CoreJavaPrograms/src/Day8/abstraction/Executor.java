package Day8.abstraction;

public class Executor {
	public static void main(String[] args)
	{
		Coder c1;
		c1 = new Student();
		c1.rules();

		Coder c2;
		c2 = new Trainer();
		c2.rules();
	}
}
