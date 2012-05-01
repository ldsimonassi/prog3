package tp1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		System.out.println("Por favor, ingrese el valor de x:");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double result = 3*Math.pow(x, 4) - 10* Math.pow(x, 3) +13;
		System.out.println("El resultado es:" + result);
	}
}
