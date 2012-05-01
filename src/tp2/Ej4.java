package tp2;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String habitual = input.nextLine();
		int first = habitual.indexOf(" de ");
		int second = habitual.indexOf(" de ", first+4);		

		String day= habitual.substring(0, first);
		String month = habitual.substring(first+4, second);
		String year = habitual.substring(second + 4);

		String standard = year+"-"+month+"-"+day;
		
		System.out.println("Standard:"+standard);
	}
}
