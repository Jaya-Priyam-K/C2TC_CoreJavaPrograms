package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setCname("Jaya");
		c1.setCity("Puducherry");
		System.out.println(c1);
		
		Customer c2 = new Customer();
		c2.setCid(102);
		c2.setCname("Priyam");
		c2.setCity("Chennai");
		System.out.println(c2);
		
	}

}
