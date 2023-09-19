package c;

public class MyMain {
	
	public static void main(String[] args)  { 
		try {
			Person p1 = new Person("Richard F", 1918);
			Person p2 = (Person) p1.clone();
			p2.setName("Nelson M");
			System.out.println(p1.name);
			System.out.println(p2.name);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
