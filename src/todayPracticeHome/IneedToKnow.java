package todayPracticeHome;

public class IneedToKnow {
	
	public int age;
	public String name;
	public boolean tall;
	
	public IneedToKnow() {
		System.	out.println("DC");
	}


	public IneedToKnow(int age) {
		this.age = age;
		System.out.println(age);

	}

	public IneedToKnow(int age, String name, boolean tall) {
		this.age = age;
		this.name = name;
		this.tall = tall;
		System.out.println("Hay murad age is: " + age);
	}
	
	public IneedToKnow(int age,boolean tall,String name) {
		this.age = age;
		this.name = name;
		this.tall = tall;
	}
	
	
		
	
	
	
	
}
