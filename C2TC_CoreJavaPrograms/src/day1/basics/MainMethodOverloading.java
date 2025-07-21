package day1.basics;

public class MainMethodOverloading {
	public static void main() {
		System.out.println("Welcome from main 1");
	}

	
	public static void main(char c[]) {
		System.out.println("Welcome from main 2");
	}


	public static void main(String ar) {
		System.out.println("Welcome from main 3");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome from main 4");
	}
	

}
