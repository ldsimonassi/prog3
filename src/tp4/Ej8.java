package tp4;

import java.util.Scanner;

public class Ej8 {
	public static int getYearDays(int year, int month, int day) {
		if(!Ej7.isValidDate(year, month, day))
			throw new IllegalArgumentException();
		int days = 0;
		
		for (int i = 1; i < month; i++) {
			int mdays = Ej4.getNumDays(i, year);
			days += mdays;
		}
		
		days += day;
		
		return days;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el a–o:");
		int year = scanner.nextInt();
		System.out.println("Ingrese el mes:");
		int month = scanner.nextInt();
		System.out.println("Ingrese el dia:");
		int day = scanner.nextInt();
		System.out.println("La cantidad de d’as desde el comienzo del a–o es:"+getYearDays(year, month, day));
	}
}
