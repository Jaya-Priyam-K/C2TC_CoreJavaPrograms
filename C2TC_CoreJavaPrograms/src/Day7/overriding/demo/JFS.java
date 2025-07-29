package Day7.overriding.demo;

public class JFS extends PLTraining {
	@Override
	public void session(String language)
	{
		System.out.println("The session going for "+language+" in Core Java");
	}
}
