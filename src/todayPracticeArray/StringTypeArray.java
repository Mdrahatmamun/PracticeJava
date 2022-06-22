package todayPracticeArray;

import java.util.Arrays;
import java.util.PrimitiveIterator.OfDouble;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class StringTypeArray {

	public static void main(String[] args) {

		String[] ali = new String[12];

		ali[0] = "buffalo";
		ali[1] = "broadway";
		ali[2] = "erie";
		ali[3] = "galaria mall";
		ali[4] = "duine st";
		ali[5] = "woodell ave";
		ali[6] = "main st";
		ali[7] = "...........";
		ali[8] = "batavia";
		ali[9] = "warsaw";
		ali[10] = "goodyear";
		ali[11] = "marie ave";

		System.out.println(" ali bhai is in: " + ali[0]);
		System.out.println(" ali bhai is in: " + ali[1]);
		System.out.println(" ali bhai is in: " + ali[2]);
		System.out.println(" ali bhai is in: " + ali[7]);
		System.out.println(" ali bhai is in: " + ali[8]);
		System.out.println(" ali bhai is in: " + ali[4]);
		System.out.println(" ali bhai is in: " + ali[5]);
		System.out.println(" ali bhai is in: " + ali[9]);

		System.out.println("the length of array: " + ali.length);
		System.out.println("the last value of array is:" + ali[ali.length - 5]);

		System.out.println("finding list of array: " + Arrays.toString(ali));

		System.out.println("\n---------------------------------------------\n");

		String[] murad = new String[] { "Flushing", "Roosevelt Ave", "Brooklyn Motel", "Linden Blvd", "Borough Park" };

		/*
		 * String[] murad = new String[5]; 
		 * murad[0] = "Flushing"; 
		 * murad[1] = "Roosevelt Ave";
		 * murad[2] = "Brooklyn Motel"; 
		 * murad[3] = "Linden Blvd";
		 * murad[4] = "Borough Park";
		 */

		System.out.println("\n---array murad---\n");// line num 44
		System.out.println(murad.length);
		System.out.println(murad[2]);//why 2? bcuz index number starts from 0 so third position is 3-1
		
		
		

		System.out.println("\n-----int array----\n");

		int[] md = new int[] { 8, 9, 10, 11, 12, 13 };
		System.out.println("what Is index 0 Of md  array" + md[0]);
		System.out.println("length of md array" + md.length);

	}

}
