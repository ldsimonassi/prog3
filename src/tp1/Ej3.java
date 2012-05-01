package tp1;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		final double KILOGRAMOS_X_LIBRA = 0.454;
		final double METROS_X_PIE = 0.3046;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el peso (lbs):");
		double peso = input.nextDouble();	
		System.out.println("Ingrese la altura (pies):");
		double altura = input.nextDouble();
		
		double pesoMetrico = peso*KILOGRAMOS_X_LIBRA;
		double alturaMetrica = altura*METROS_X_PIE;
		
		double imc = alturaMetrica / Math.pow(pesoMetrico, 2);
		
		System.out.println("El IMC para una persona de Peso:["+peso+"]lbs y Altura:["+altura+"]pies es:["+imc+"]");
	}
}
