package quiz;

public class Quiz03 {
	public static void p() {
		System.out.print("A");
		p();

	}

	public static void main(String[] args) {
		System.out.print("B");
		p();
		System.out.print("C");

	}

}
