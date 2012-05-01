package tp2;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("******* Primer carga ******");
		System.out.println("Precio del combustible x litro?:");
		// El precio por litro es double pq tiene decimales.
		double literPrice1 = input.nextDouble();

		System.out.println("Precio de la carga total?");
		// El precio total es double pq tienen decimales
		double tankPrice1 = input.nextDouble();

		System.out.println("Valor del cuenta kms?");
		// El valor del cuenta km es entero pq tiene saltos discretos
		int kms1 = input.nextInt();

		System.out.println("******* Segunda carga ******");

		System.out.println("Precio x litro?:");
		// El precio x litro es double pq es un valor q requiere precision decimal
		double literPrice2 = input.nextDouble();

		System.out.println("Precio de la carga total?:");
		// El precio de la carga total es double pq es un valor q requiere precision decimal
		double tankPrice2 = input.nextDouble();

		System.out.println("******* Tercera carga ******");

		System.out.println("Valor del cuenta kms?");
		// El valor del cuenta km es entero pq tiene saltos discretos
		int kms3 = input.nextInt();

		double distance = kms3 - kms1;

		
		// Todos los calculos siguientes involucran doubles y sus 
		// resultados en ningœn caso son discretos, utilizo double para su representaci—n.
		double liters1 = tankPrice1/literPrice1;
		double liters2 = tankPrice2/literPrice2;
		double kmPerLiter = distance/(liters1+liters2);
		double kmPrice = (tankPrice1+tankPrice2) / distance;
		double consumption100Km = 100/kmPerLiter;

		System.out.println("***** Conclusiones *****");
		System.out.println("Precio del KM...: $"+kmPrice);
		System.out.println("Consumo c/100KM.: "+consumption100Km+" Lts.");
	}
}
