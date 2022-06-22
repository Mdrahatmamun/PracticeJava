package todayPracticeHome;

public class AboutMe {

	public String schoolname; // Variable declared
	public String schoolname1 = " Chatkhil PG govt. High School"; // Variable initialized

	// 8 types of primitive data type below

	public String name = "Md rahat al mamun"; // string type need double quotation ("")
	public byte age = 40; // use range (-128 to 127)
	public short myApartmentRent = 450;
	public int myYearlySalary = 500200;
	public long myBankBalance = 32500l; // at the end l long value
	public float myHeight = 5.7f; // at the end f float value
	public double myGrade = 3.6689;
	public char sex = 'M';
	public boolean usCitizen = false; // value have to be true or false

	public static void main(String[] args) {
		AboutMe rahat = new AboutMe(); // Aboutme class is now instantiated. (object name start with Lower case). new
										// is a keyword

		System.out.println("My Name: " + rahat.name);
		System.out.println("My Age: " + rahat.age);
		System.out.println(rahat.myHeight);

	}

}
