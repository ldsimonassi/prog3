package tp2;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		final long MINUTE_SECONDS = 60;
		final long HOUR_SECONDS = 60 * MINUTE_SECONDS;
		final long DAY_SECONDS = HOUR_SECONDS*24;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese una cantidad de segundos");
		long totalSeconds = input.nextLong();
		long seconds = totalSeconds;
		
		int days = (int)(seconds / DAY_SECONDS);
		
		seconds = seconds % DAY_SECONDS;
		
		int hours = (int)(seconds / HOUR_SECONDS);

		seconds = seconds % HOUR_SECONDS;

		int minutes = (int)(seconds / MINUTE_SECONDS);

		seconds = seconds % MINUTE_SECONDS;

		System.out.println("Segundos ingresados:"+totalSeconds);
		System.out.println("Dias:"+days);
		System.out.println("Horas:"+hours);
		System.out.println("Minutos:"+minutes);
		System.out.println("Segundos:"+seconds);
		
	}
}
