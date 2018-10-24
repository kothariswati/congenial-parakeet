package lessons;

import java.util.*;

public class GenerateNumbers {

	public static void main(String[] args) {

		Thousandnumbers();
	}
	
	public static void Thousandnumbers() {
		
		Random rand = new Random();
		
		for (int i=0;i<1000;i++) {
			int newInt = rand.nextInt(2000);
			System.out.print(newInt+" ");
		}
		
	}

}
