package todayPracticeHome;

public class JavaPractice01 {
//	variables initialized, also called fields.
	public String name= "rahat";
	public int age=39;
	public boolean citizenship= false;
	public float Height= 5.7f;
	public char sex='M';
	
//	Default constructor
	//public JavaPractice01() {
		//System.out.println("this default constructor from JavaPractice01 class");
	//}
	
	public void rahatsMethod() { // Method implemented
		
		System.out.println("My name is: " + name+ "\nMy age is: " + age + "\nMy sex is: " + sex );
			
	}
	
public static void main(String[] args) {  // main method is entry point of java, to allow this application to run.
	// Default constructor initialized here, also called the class is instantiated.
	// It also called object is created
	JavaPractice01 brooklyn = new JavaPractice01();
	System.out.println(brooklyn.name+" " + brooklyn.age + brooklyn.sex); // object calling variables
	brooklyn.rahatsMethod(); // Method initialized, Object calling method
			
}	
	
	
	
	
	
}
