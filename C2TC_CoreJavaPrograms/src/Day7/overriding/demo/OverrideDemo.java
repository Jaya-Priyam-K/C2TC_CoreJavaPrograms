package Day7.overriding.demo;

public class OverrideDemo {

	public static void main(String[] args) {
		PLTraining pl = new PLTraining();
		pl.session("Full Stack Developer");
		
		pl = new JFS();
		pl.session("Method overriding");
		
		pl = new Python();
		pl.session("Method overriding");

	}

}
