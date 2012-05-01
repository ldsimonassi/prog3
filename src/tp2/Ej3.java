package tp2;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX_NOTAS = 5;
		
		// Creo un vector de 5 enteros para guardar las notas
		int[] notas = new int[MAX_NOTAS];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Ingrese la nota ["+i+"]:");
			notas[i] = input.nextInt();
		}
		
		double promedio = 0;
		for (int i = 0; i < notas.length; i++) {
			promedio += notas[i];
			System.out.println("Nota["+i+"]:"+notas[i]);
		}

		promedio = promedio / MAX_NOTAS;
		System.out.println("El promedio es:"+ promedio);
	}
}
